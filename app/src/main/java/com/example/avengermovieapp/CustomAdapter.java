package com.example.avengermovieapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    ArrayList<ModelClass> arrayList;
    Context context;

    public CustomAdapter(ArrayList<ModelClass> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v=LayoutInflater.from(context).inflate(R.layout.sample_layout,parent,false);
        return new MyViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        ModelClass modelClass=arrayList.get(position);
        holder.movie_image.setImageResource(modelClass.getImage_id());
        holder.movie_title.setText(modelClass.getMovie_title());
        holder.movie_duration.setText(modelClass.getMovie_duration());
        holder.movie_platform.setText(modelClass.getMovie_platform());
        holder.movie_language.setText(modelClass.getMovie_language());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView movie_image;
        TextView movie_title,movie_duration,movie_platform,movie_language;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            movie_image=itemView.findViewById(R.id.movie_image);
            movie_title=itemView.findViewById(R.id.movie_title);
            movie_duration=itemView.findViewById(R.id.movie_duration);
            movie_platform=itemView.findViewById(R.id.movie_platform);
            movie_language=itemView.findViewById(R.id.movie_language);

        }
    }

}
