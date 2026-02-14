package com.shri.travlingapp.Kashmir;

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

import com.shri.travlingapp.MainActivity;
import com.shri.travlingapp.R;

import java.util.ArrayList;

public class KashmirRVAdapter extends RecyclerView.Adapter<KashmirRVAdapter.ViewHolder> {
    Context context;
    ArrayList<KashmirRVModel> arrKasImg= new ArrayList<>();

    public KashmirRVAdapter(Context context, ArrayList<KashmirRVModel> arrKasImg) {
        this.context = context;
        this.arrKasImg = arrKasImg;
    }

    @Override
    public KashmirRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view =LayoutInflater.from(context).inflate(R.layout.rv_kashmir_model,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KashmirRVAdapter.ViewHolder holder, int position) {
        holder.KashmirImg.setImageResource(arrKasImg.get(position).KashmirImg);
        holder.KashmirTitle.setText(arrKasImg.get(position).KashmirTitle);

        holder.KashmirCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arrKasImg.get(position).KashmirTitle.equalsIgnoreCase("Kishtwar")){
                    Intent intent=new Intent(context, KishtwarAct.class);
                    context.startActivity(intent);
                }
                else if (arrKasImg.get(position).KashmirTitle.equalsIgnoreCase("Dal Lake")){
                    Intent intent=new Intent(context, Dal_LakeAct.class);
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
        return arrKasImg.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView KashmirImg;
        TextView KashmirTitle;
        CardView KashmirCard;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            KashmirImg=itemView.findViewById(R.id.Kashmir_imgModel);
            KashmirTitle=itemView.findViewById(R.id.Kashmir_txtModel);
            KashmirCard=itemView.findViewById(R.id.KashmirCard);
        }
    }
}
