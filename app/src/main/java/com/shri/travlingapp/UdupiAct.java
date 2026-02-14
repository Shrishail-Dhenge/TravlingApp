package com.shri.travlingapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UdupiAct extends AppCompatActivity {

RecyclerView UdupiRV;

ArrayList<UdupiRVModel> arrInfoUdupi = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_udupi);

        UdupiRV=findViewById(R.id.UdupiRV);

        UdupiRV.setLayoutManager(new LinearLayoutManager(this));

        arrInfoUdupi.add(new UdupiRVModel(R.drawable.kerala_udupi_anateswara_temple,"Ananteswara Temple", R.string.ananteswara_temple ));
        arrInfoUdupi.add(new UdupiRVModel(R.drawable.kerala_udupi_kapu_beach,"Kapu Beach",R.string.kapu_beach));
        arrInfoUdupi.add(new UdupiRVModel(R.drawable.kerala_udupi_krishna_temp,"Shri Krishna Temple",R.string.udupi_krishna_temple));
        arrInfoUdupi.add(new UdupiRVModel(R.drawable.kerala_udupi_malape_beach,"Malape Beach",R.string.malpe_beach));

        UdupiRVAdapter adapter=new UdupiRVAdapter(this,arrInfoUdupi);
        UdupiRV.setAdapter(adapter);

    }
}