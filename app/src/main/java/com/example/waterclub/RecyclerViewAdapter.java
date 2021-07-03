package com.example.waterclub;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewViewHolder> {

    private ArrayList<RecyclerViewItem> arrayList;

    public static class RecyclerViewViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;

        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView = imageView.findViewById(R.id.imageView1);
        }
    }

    public RecyclerViewAdapter(ArrayList<RecyclerViewItem> arrayList){
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public RecyclerViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.page_recicler, viewGroup, false);
        RecyclerViewViewHolder recyclerViewViewHolder = new RecyclerViewViewHolder(view);
        return  recyclerViewViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewViewHolder recyclerViewViewHolder, int i) {
        RecyclerViewItem recyclerViewItem = arrayList.get(i);

        recyclerViewViewHolder.imageView.setImageResource(recyclerViewItem.getImageResource());
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }



}
