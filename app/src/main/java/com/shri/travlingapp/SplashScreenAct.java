package com.shri.travlingapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class SplashScreenAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(() -> {
            if (FirebaseAuth.getInstance().getCurrentUser() != null) {
                // User already logged in
                startActivity(new Intent(SplashScreenAct.this, MainActivity.class));
            } else {
                // User not logged in
                startActivity(new Intent(SplashScreenAct.this, RegisterAct.class));
            }
            finish();
        }, 3000);
    }
}
