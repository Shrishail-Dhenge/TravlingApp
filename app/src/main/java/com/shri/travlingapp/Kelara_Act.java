package com.shri.travlingapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Kelara_Act extends AppCompatActivity {
RecyclerView KelaraRV;
ArrayList<keralaRVModel> arrImgKelara = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kelara);
        KelaraRV=findViewById(R.id.KelaraRV);

        KelaraRV.setLayoutManager(new GridLayoutManager(this,2));

        arrImgKelara.add(new keralaRVModel(R.drawable.kerala_udupi,"Udupi"));
        arrImgKelara.add(new keralaRVModel(R.drawable.kerala_guruvarur_temple,"Guruvaur"));
        arrImgKelara.add(new keralaRVModel(R.drawable.kerala_athirapally,"Athirapally"));
        arrImgKelara.add(new keralaRVModel(R.drawable.kerala_munar,"Munnar"));
        arrImgKelara.add(new keralaRVModel(R.drawable.kerala_periyar,"Periyar"));
        arrImgKelara.add(new keralaRVModel(R.drawable.kerala_alleppey,"Alleppey"));
        arrImgKelara.add(new keralaRVModel(R.drawable.kerala_jatayu,"Jatayu"));
        arrImgKelara.add(new keralaRVModel(R.drawable.kerala_trivandram,"Trivandram"));
        arrImgKelara.add(new keralaRVModel(R.drawable.kerala_suchindram,"Suchindram"));
        arrImgKelara.add(new keralaRVModel(R.drawable.kerala_kanyakumari,"Kanyakumari"));
        arrImgKelara.add(new keralaRVModel(R.drawable.kerala_rameshvaram,"Rameshvaram"));
        arrImgKelara.add(new keralaRVModel(R.drawable.kerala_dhanushakodi,"Dhanushakodi"));
        arrImgKelara.add(new keralaRVModel(R.drawable.kerala_madurai,"Madurai"));
        arrImgKelara.add(new keralaRVModel(R.drawable.kerala_mysore,"Mysore"));

        KeralaRVAdapter adapter=new KeralaRVAdapter(this,arrImgKelara);
        KelaraRV.setAdapter(adapter);



    }
}