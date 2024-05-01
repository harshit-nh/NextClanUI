package com.example.nextclanui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<UserData> items;


    public MyAdapter(ArrayList<UserData> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.user_item_layout,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder holder, int position) {

        UserData userData = items.get(position);

        holder.imageView.setImageResource(userData.getUserImg());
        holder.userName.setText(userData.getUserName());
        holder.locationTxt.setText(userData.getLocationTxt());
        holder.distanceTxt.setText(userData.getDistanceTxt());
        holder.aboutTxt.setText(userData.getAboutTxt());
        holder.descriptionTxt.setText(userData.getDescriptionTxt());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView userName, locationTxt, distanceTxt,aboutTxt, descriptionTxt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.user_image);
            userName = itemView.findViewById(R.id.usernameTxt);
            locationTxt = itemView.findViewById(R.id.locationTxt);
            distanceTxt = itemView.findViewById(R.id.distanceTxt);
            aboutTxt = itemView.findViewById(R.id.aboutTxt);
            descriptionTxt= itemView.findViewById(R.id.infoTxt);
        }
    }
}
