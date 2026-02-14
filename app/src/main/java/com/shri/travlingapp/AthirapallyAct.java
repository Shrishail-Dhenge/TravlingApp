package com.shri.travlingapp;

import android.os.Bundle;
import android.widget.ScrollView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AthirapallyAct extends AppCompatActivity {
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_athirapally);

        scrollView = findViewById(R.id.scrollView);
        // Example: scroll to bottom after layout is drawn
        // scrollView.post(new Runnable() { @Override public void run() { scrollView.fullScroll(ScrollView.FOCUS_DOWN); } });
    }
}