package com.example.aicte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class StudenSignup extends AppCompatActivity {

    ImageView text1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studen_signup);

        text1=findViewById(R.id.signup_back_button);
        btn1=findViewById(R.id.gotologinpage);

        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudenSignup.this,StudentLoginSignup.class));
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StudenSignup.this,StudentLogin.class));
                finish();
            }
        });
    }
}