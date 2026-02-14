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

import java.util.ArrayList;

public class KeralaRVAdapter extends RecyclerView.Adapter<KeralaRVAdapter.ViewHolder> {
    Context context;
    ArrayList<keralaRVModel> arrImgKelara;

    public KeralaRVAdapter(Context context, ArrayList<keralaRVModel> arrImgKelara) {
        this.context = context;
        this.arrImgKelara = arrImgKelara;
    }

    @Override
    public KeralaRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.rv_kelara_model,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KeralaRVAdapter.ViewHolder holder, int position) {
        holder.keralaImg.setImageResource(arrImgKelara.get(position).KelaraImg);
        holder.kelaraTitle.setText(arrImgKelara.get(position).kelaraTitle);

        holder.keralaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arrImgKelara.get(position).kelaraTitle.equalsIgnoreCase("Udupi")){
                    Intent intent=new Intent(context, UdupiAct.class);
                    context.startActivity(intent);
                }
                else if (arrImgKelara.get(position).kelaraTitle.equalsIgnoreCase("Guruvaur")){
                    Intent intent=new Intent(context, GuruAct.class);
                    context.startActivity(intent);
                }
                else if (arrImgKelara.get(position).kelaraTitle.equalsIgnoreCase("Athirapally")){
                    Intent intent=new Intent(context, AthirapallyAct.class);
                    context.startActivity(intent);
                }
                else if (arrImgKelara.get(position).kelaraTitle.equalsIgnoreCase("Munnar")){
                    Intent intent = new Intent(context, MunnarAct.class);
                    context.startActivity(intent);
                }
                else if (arrImgKelara.get(position).kelaraTitle.equalsIgnoreCase("Periyar")){
                    Intent intent = new Intent(context, PeriyarAct.class);
                    context.startActivity(intent);
                }
                else if (arrImgKelara.get(position).kelaraTitle.equalsIgnoreCase("Alleppey")){
                    Intent intent = new Intent(context, AlleppeyAct.class);
                    context.startActivity(intent);
                }
                else if (arrImgKelara.get(position).kelaraTitle.equalsIgnoreCase("Jatayu")){
                    Intent intent = new Intent(context, JatayuAct.class);
                    context.startActivity(intent);
                }
                else if (arrImgKelara.get(position).kelaraTitle.equalsIgnoreCase("Trivandram")){
                    Intent intent = new Intent(context, TrivandramAct.class);
                    context.startActivity(intent);
                }
                else if (arrImgKelara.get(position).kelaraTitle.equalsIgnoreCase("Suchindram")){
                    Intent intent = new Intent(context, SuchindramAct.class);
                    context.startActivity(intent);
                }
                else if (arrImgKelara.get(position).kelaraTitle.equalsIgnoreCase("Kanyakumari")){
                    Intent intent = new Intent(context, KanyakumariAct.class);
                    context.startActivity(intent);
                }
                else if (arrImgKelara.get(position).kelaraTitle.equalsIgnoreCase("Rameshvaram")){
                    Intent intent = new Intent(context, RameshvaramAct.class);
                    context.startActivity(intent);
                }
                else if (arrImgKelara.get(position).kelaraTitle.equalsIgnoreCase("Dhanushakodi")){
                    Intent intent = new Intent(context, DhanushkodiAct.class);
                    context.startActivity(intent);
                }
                else if (arrImgKelara.get(position).kelaraTitle.equalsIgnoreCase("Madurai")){
                    Intent intent = new Intent(context, MaduraiAct.class);
                    context.startActivity(intent);
                }
                else if (arrImgKelara.get(position).kelaraTitle.equalsIgnoreCase("Mysore")){
                    Intent intent = new Intent(context, Kerala_maisourAct.class);
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
        return arrImgKelara.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView keralaImg;
        TextView kelaraTitle;
        CardView keralaCard;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            keralaImg=itemView.findViewById(R.id.kelara_imgModel);
            kelaraTitle=itemView.findViewById(R.id.kelara_txtModel);
            keralaCard=itemView.findViewById(R.id.keralaCard);
        }
    }
}
