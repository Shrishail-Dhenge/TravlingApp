package com.shri.travlingapp.Kashmir;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.shri.travlingapp.R;

import java.util.ArrayList;

public class KAshmirAct extends AppCompatActivity {

    RecyclerView KarshmirRV;
   ArrayList<KashmirRVModel> arrKasImg= new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_kashmir);

        KarshmirRV=findViewById(R.id.KashmirRV);

        KarshmirRV.setLayoutManager(new GridLayoutManager(this,2));

        arrKasImg.add(new KashmirRVModel(R.drawable.kas_kishtwar,"Kishtwar"));
        arrKasImg.add(new KashmirRVModel(R.drawable.kas_dal_lake,"Dal Lake"));

        KashmirRVAdapter adp= new KashmirRVAdapter(this,arrKasImg);
        KarshmirRV.setAdapter(adp);

    }
}