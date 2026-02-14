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

public class UdupiRVAdapter extends RecyclerView.Adapter<UdupiRVAdapter.ViewHolder> {

    Context context;
    ArrayList<UdupiRVModel> arrInfoUdupil;

    public UdupiRVAdapter(Context context, ArrayList<UdupiRVModel> arrInfoUdupil) {
        this.context = context;
        this.arrInfoUdupil = arrInfoUdupil;
    }

    @Override
    public UdupiRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.rv_udupi_model,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UdupiRVAdapter.ViewHolder holder, int position) {
        holder.udupiImg.setImageResource(arrInfoUdupil.get(position).img);
        holder.udupiTitle.setText(arrInfoUdupil.get(position).Title);
        holder.udupiText.setText(arrInfoUdupil.get(position).Text);

    }

    @Override
    public int getItemCount() {
        return arrInfoUdupil.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView udupiText,udupiTitle;
        ImageView udupiImg;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            udupiImg=itemView.findViewById(R.id.udupiImg);
            udupiTitle=itemView.findViewById(R.id.udupiTitle);
            udupiText=itemView.findViewById(R.id.udupiText);
        }
    }
}
