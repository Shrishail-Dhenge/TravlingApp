package com.shri.travlingapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.auth.FirebaseAuth;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView homeRV;
    ArrayList<homeRVModel> arrImg = new ArrayList<>();
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // RecyclerView setup
        homeRV = findViewById(R.id.homeRV);
        homeRV.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        // Sample data
        arrImg.add(new homeRVModel(R.drawable.kerala_bg, "Kerala"));
        arrImg.add(new homeRVModel(R.drawable.rajastathan, "Rajastathan"));
        arrImg.add(new homeRVModel(R.drawable.kashmir, "Kashmir"));


        homeRVAdapter adp = new homeRVAdapter(MainActivity.this, arrImg);
        homeRV.setAdapter(adp);

        // Logout button setup
        btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(v -> {
            // Sign out from Firebase
            FirebaseAuth.getInstance().signOut();

            // Redirect to Login screen
            Intent intent = new Intent(MainActivity.this, Login_Act.class);

            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

            // Finish MainActivity so user cannot go back here without logging in
            finish();
        });
    }
}
