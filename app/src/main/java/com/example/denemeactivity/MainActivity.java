package com.example.denemeactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static class CustomItems {
        String url;

        public CustomItems(String url) {
            this.url = url;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    public static class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {
        Context mContext;
        List<Model> mImages;

        public ImageAdapter(Context context, List<Model> images) {
            this.mContext = context;
            this.mImages = images;
        }

        @NonNull
        @Override
        public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View v = LayoutInflater.from(mContext).inflate(R.layout.custom_layout, parent, false);
            return new ImageViewHolder(v);
        }

        @Override
        public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
            Model image = mImages.get(position);
            Picasso.get().load(image.getUrl()).into(holder.imageView);
        }

        @Override
        public int getItemCount() {
            return mImages.size();
        }

        public class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            ImageView imageView;

            public ImageViewHolder(View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.imageView);
                itemView.setOnClickListener(this);
            }

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ViewActivity.class);
                intent.putExtra("image_url", mImages.get(getAdapterPosition()).getUrl());
                mContext.startActivity(intent);
            }
        }
    }

    public static class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ImageViewHolder> {
        List<CustomItems> itemList;
        Context context;

        public RecyclerViewAdapter(List<CustomItems> itemList, Context context) {
            this.itemList = itemList;
            this.context = context;
        }

        @NonNull
        @Override
        public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            View view = layoutInflater.inflate(R.layout.custom_layout, parent, false);
            return new ImageViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
            CustomItems item = itemList.get(position);
            Picasso.get().load(item.getUrl()).into(holder.imageView);
        }

        @Override
        public int getItemCount() {
            return itemList.size();
        }

        public class ImageViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
            ImageView imageView;

            public ImageViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.imageView);
                itemView.setOnClickListener(this);
            }

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ViewActivity.class);
                intent.putExtra("image_url", itemList.get(getAdapterPosition()).getUrl());
                context.startActivity(intent);
            }
        }
    }

    public static class Model {
        String url;

        public Model() {
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}