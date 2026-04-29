package com.example.denemeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageView = findViewById(R.id.imageView);

        String imageUrl = getIntent().getStringExtra("image_url");
        Picasso.get().load(imageUrl).into(imageView);
    }
}