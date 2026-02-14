package com.shri.travlingapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GuruAct extends AppCompatActivity {
RecyclerView GuruRV;
ArrayList<GuruRVModel> arrInfoGuru= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_guru);

        GuruRV=findViewById(R.id.GuruRV);

        GuruRV.setLayoutManager(new LinearLayoutManager(this));

        arrInfoGuru.add(new GuruRVModel(R.drawable.kerala_guruvarur_temple,"Guruvayur Temple",R.string.guruvarur_temple));
        arrInfoGuru.add(new GuruRVModel(R.drawable.kerala_guruvarur_chavakkad_beach,"Chavakkad Beach",R.string.charvakkad_beach));
        arrInfoGuru.add(new GuruRVModel(R.drawable.kerala_guruvarur_marine_world,"Marine World",R.string.marine_world));
        arrInfoGuru.add(new GuruRVModel(R.drawable.kerala_guruvarur_palayur_church,"Palayur Church",R.string.palayur_church));

        GuruRVAdapter adapter=new GuruRVAdapter(this,arrInfoGuru);
        GuruRV.setAdapter(adapter);


    }
}