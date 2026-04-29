package com.example.denemeactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;  // Doğru toolbar sınıfı

import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class RenklerActivity extends AppCompatActivity {
    RecyclerView recyclerView_renkler;
    ImageAdapter imageAdapter;

    private DatabaseReference databaseReference;
    private List<Model> images;
    private Toolbar toolbar_renkler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_renkler);

        toolbar_renkler = findViewById(R.id.toolbar_tema);
        setSupportActionBar(toolbar_renkler);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        recyclerView_renkler = findViewById(R.id.recyclerView_renkler);
        recyclerView_renkler.setHasFixedSize(true);
        recyclerView_renkler.setLayoutManager(new GridLayoutManager(this, 2));

        images = new ArrayList<>();
        databaseReference = FirebaseDatabase.getInstance().getReference("Renkler");

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                images.clear();
                for (DataSnapshot postSnapshot : dataSnapshot.getChildren()) {
                    Model image = postSnapshot.getValue(Model.class);
                    images.add(image);
                }
                imageAdapter = new ImageAdapter(RenklerActivity.this, images);
                recyclerView_renkler.setAdapter(imageAdapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
                // Handle possible errors.
            }
        });
    }

    public void setSupportActionBar(Toolbar toolbar_renkler) {
        // Assuming you meant to use androidx.appcompat.widget.Toolbar
        if (toolbar_renkler instanceof androidx.appcompat.widget.Toolbar) {
            setSupportActionBar((androidx.appcompat.widget.Toolbar) toolbar_renkler);
        }
    }
}
