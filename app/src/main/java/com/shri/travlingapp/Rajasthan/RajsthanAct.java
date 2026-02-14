package com.shri.travlingapp.Rajasthan;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.shri.travlingapp.R;

import java.util.ArrayList;

public class RajsthanAct extends AppCompatActivity {
    RecyclerView RajRV;
    ArrayList<RajasthanRVModel> arrRAjImg=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_rajsthan);

        RajRV=findViewById(R.id.RajRV);
        RajRV.setLayoutManager(new GridLayoutManager(this,2));

        arrRAjImg.add(new RajasthanRVModel(R.drawable.raj_jaipur,"Jaipur"));
        arrRAjImg.add(new RajasthanRVModel(R.drawable.raj_jodhapur,"Jodhapur"));
        arrRAjImg.add(new RajasthanRVModel(R.drawable.raj_jaisalmer,"Jaisalmer"));
        arrRAjImg.add(new RajasthanRVModel(R.drawable.raj_udaipur_lake,"Udaipur Lake"));

        RajasthanRVAdapter adapter=new RajasthanRVAdapter(this,arrRAjImg);
        RajRV.setAdapter(adapter);


    }
}