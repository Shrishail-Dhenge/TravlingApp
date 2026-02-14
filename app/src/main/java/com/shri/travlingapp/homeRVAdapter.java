package com.shri.travlingapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.shri.travlingapp.Kashmir.KAshmirAct;
import com.shri.travlingapp.Rajasthan.RajsthanAct;

import java.util.ArrayList;

public class homeRVAdapter extends RecyclerView.Adapter<homeRVAdapter.ViewHolder> {
    Context context;
    ArrayList<homeRVModel> arrImg;

    public homeRVAdapter(Context context, ArrayList<homeRVModel> arrImg) {
        this.context = context;
        this.arrImg = arrImg;
    }

    @Override
    public homeRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.rv_home_model,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull homeRVAdapter.ViewHolder holder, int position) {

        holder.imgModel.setImageResource(arrImg.get(position).img);
        holder.txtModel.setText(arrImg.get(position).title);

        holder.homeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arrImg.get(position).title.equalsIgnoreCase("Kerala")) {

                    Intent intent = new Intent(context, Kelara_Act.class);
                    context.startActivity(intent);
                }
                else if (arrImg.get(position).title.equalsIgnoreCase("Rajastathan")) {

                    Intent intent = new Intent(context, RajsthanAct.class);
                    context.startActivity(intent);
                }
                else if (arrImg.get(position).title.equalsIgnoreCase("Kashmir")) {

                    Intent intent = new Intent(context, KAshmirAct.class);
                    context.startActivity(intent);
                }
                else {
                    Toast.makeText(context, "NO Option", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    @Override
    public int getItemCount() {
        return arrImg.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgModel;
        TextView txtModel;
        CardView homeCard;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgModel=itemView.findViewById(R.id.imgModel);
            txtModel=itemView.findViewById(R.id.txtModel);
            homeCard=itemView.findViewById(R.id.homeCard);

        }
    }
}
