package com.shri.travlingapp.Rajasthan;

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

import com.shri.travlingapp.R;

import java.util.ArrayList;

public class RajasthanRVAdapter extends RecyclerView.Adapter<RajasthanRVAdapter.ViewHolder> {
    Context context;
    ArrayList<RajasthanRVModel> arrRAjImg=new ArrayList<>();

    public RajasthanRVAdapter(Context context, ArrayList<RajasthanRVModel> arrRAjImg) {
        this.context = context;
        this.arrRAjImg = arrRAjImg;
    }

    @Override
    public RajasthanRVAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.rv_ragasthan_model,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RajasthanRVAdapter.ViewHolder holder, int position) {
        holder.Img.setImageResource(arrRAjImg.get(position).Img);
        holder.Title.setText(arrRAjImg.get(position).Title);

        holder.RajCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (arrRAjImg.get(position).Title.equalsIgnoreCase("Jaipur")){
                    Intent intent=new Intent(context, JaipurAct.class);
                    context.startActivity(intent);
                } else if (arrRAjImg.get(position).Title.equalsIgnoreCase("Jodhapur")){
                    Intent intent=new Intent(context, JodhapurAct.class);
                    context.startActivity(intent);
                }else if (arrRAjImg.get(position).Title.equalsIgnoreCase("Jaisalmer")){
                    Intent intent=new Intent(context, JaisalmerAct.class);
                    context.startActivity(intent);
                }else if (arrRAjImg.get(position).Title.equalsIgnoreCase("Udaipur Lake")){
                    Intent intent=new Intent(context, Udaipur_LakeAct.class);
                    context.startActivity(intent);
                }else {
                    Toast.makeText(context, "NO Option", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrRAjImg.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView Img;
        TextView Title;
        CardView RajCard;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Img=itemView.findViewById(R.id.Raj_imgModel);
            Title=itemView.findViewById(R.id.Raj_txtModel);
            RajCard=itemView.findViewById(R.id.RajasthanCard);
        }
    }
}
