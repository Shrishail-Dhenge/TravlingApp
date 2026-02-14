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

public class RegisterAct extends AppCompatActivity {

    VideoView Reg_veidoView;
    EditText name, email, pass, ph;
    Button btnregister;
    TextView txtLogin;

    FirebaseAuth fauth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);

        Reg_veidoView = findViewById(R.id.Reg_veidoView);
        name = findViewById(R.id.edt_Reg_name);
        email = findViewById(R.id.edt_Reg_email);
        pass = findViewById(R.id.edt_Reg_password);
        ph = findViewById(R.id.edt_Reg_Ph);
        txtLogin = findViewById(R.id.txtLogin);
        btnregister = findViewById(R.id.btnregister);

        fauth = FirebaseAuth.getInstance();

        // Video background
        String Vpath = "android.resource://" + getPackageName() + "/raw/login_bg";
        Reg_veidoView.setVideoURI(Uri.parse(Vpath));
        Reg_veidoView.start();
        Reg_veidoView.setOnPreparedListener(mp -> {
            mp.setLooping(true);
            mp.setVolume(0f, 0f);
        });

        txtLogin.setOnClickListener(v -> {
            startActivity(new Intent(RegisterAct.this, Login_Act.class));
            finish();
        });

        btnregister.setOnClickListener(v -> {
            String Email = email.getText().toString().trim();
            String Pass = pass.getText().toString().trim();

            if (TextUtils.isEmpty(Email)) {
                email.setError("Email required");
                return;
            }
            if (TextUtils.isEmpty(Pass)) {
                pass.setError("Password required");
                return;
            }

            fauth.createUserWithEmailAndPassword(Email, Pass)
                    .addOnCompleteListener(task -> {
                        if (task.isSuccessful()) {
                            Toast.makeText(this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(RegisterAct.this, MainActivity.class));
                            finish();
                        } else {
                            Toast.makeText(this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }
                    });
        });
    }
}
