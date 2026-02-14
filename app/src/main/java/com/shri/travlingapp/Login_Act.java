package com.shri.travlingapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class Login_Act extends AppCompatActivity {

    VideoView login_veidoView;
    EditText edt_Login_email, edt_Login_password;
    TextView txtReg;
    Button btnLogin;
    FirebaseAuth fAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        login_veidoView = findViewById(R.id.login_veidoView);
        edt_Login_email = findViewById(R.id.edt_Login_name);
        edt_Login_password = findViewById(R.id.edt_Login_password);
        btnLogin = findViewById(R.id.btnLogin);
        txtReg = findViewById(R.id.txtReg);

        fAuth = FirebaseAuth.getInstance();

        // Video background
        String Vpath = "android.resource://" + getPackageName() + "/raw/login_bg";
        login_veidoView.setVideoURI(Uri.parse(Vpath));
        login_veidoView.start();
        login_veidoView.setOnPreparedListener(mp -> {
            mp.setLooping(true);
            mp.setVolume(0f, 0f);
        });

        txtReg.setOnClickListener(v -> {
            startActivity(new Intent(Login_Act.this, RegisterAct.class));
            finish();
        });

        btnLogin.setOnClickListener(v -> {
            String email = edt_Login_email.getText().toString().trim();
            String pass = edt_Login_password.getText().toString().trim();

            if (TextUtils.isEmpty(email)) {
                edt_Login_email.setError("Email required");
                return;
            }
            if (TextUtils.isEmpty(pass)) {
                edt_Login_password.setError("Password required");
                return;
            }

            fAuth.signInWithEmailAndPassword(email, pass)
                    .addOnCompleteListener(task -> {
                        if (task.isSuccessful()) {
                            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(Login_Act.this, MainActivity.class));
                            finish();
                        } else {
                            Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show();
                        }
                    });
        });
    }
}
