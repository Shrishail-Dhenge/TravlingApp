package com.shri.travlingapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GuruRVAdapter extends RecyclerView.Adapter<GuruRVAdapter.ViewHolder> {
    Context context;
    ArrayList<GuruRVModel> arrInfoGuru;

    public GuruRVAdapter(Context context, ArrayList<GuruRVModel> arrInfoGuru) {
        this.context = context;
        this.arrInfoGuru = arrInfoGuru;
    }

    @Override
    public GuruRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.rv_guru_model,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GuruRVAdapter.ViewHolder holder, int position) {
        holder.GuruImg.setImageResource(arrInfoGuru.get(position).img);
        holder.GuruTitle.setText(arrInfoGuru.get(position).Title);
        holder.GuruText.setText(arrInfoGuru.get(position).Text);
    }

    @Override
    public int getItemCount() {
        return arrInfoGuru.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView GuruText,GuruTitle;
        ImageView GuruImg;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            GuruImg=itemView.findViewById(R.id.GuruImg);
            GuruTitle=itemView.findViewById(R.id.GuruTitle);
            GuruText=itemView.findViewById(R.id.GuruText);
        }
    }
}
