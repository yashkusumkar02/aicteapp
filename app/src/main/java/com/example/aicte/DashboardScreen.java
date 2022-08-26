package com.example.aicte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DashboardScreen extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5;
    TextView txt1,txt2,txt3,txt4,txt5;
    ImageView imag1,imag2,imag3,imag4,imag5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_screen);

        btn1=findViewById(R.id.statistics_btn);
        btn2=findViewById(R.id.quicklink_btn);
        btn3=findViewById(R.id.announcement_btn);
        btn4=findViewById(R.id.mainactivity_btn);
        btn5=findViewById(R.id.login_page_btn);

        txt1=findViewById(R.id.text_statistics_link);
        txt2=findViewById(R.id.text_quick_link);
        txt3=findViewById(R.id.text_announcement_link);
        txt4=findViewById(R.id.text_mainacitvity_link);
        txt5=findViewById(R.id.login_text);

        imag1=findViewById(R.id.static_links);
        imag2=findViewById(R.id.quick_links);
        imag3=findViewById(R.id.announcement_links);
        imag4=findViewById(R.id.mainacivity_links);
        imag5=findViewById(R.id.login_image);

        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardScreen.this,StatisticsDashboard.class));
                finish();
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardScreen.this,StatisticsDashboard.class));
                finish();
            }
        });
        imag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardScreen.this,StatisticsDashboard.class));
                finish();
            }
        });

        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardScreen.this,QuickLinks.class));
                finish();
            }
        });

        imag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardScreen.this,QuickLinks.class));
                finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardScreen.this,QuickLinks.class));
                finish();
            }
        });

        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardScreen.this,Announcement.class));
                finish();
            }
        });

        imag3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardScreen.this,Announcement.class));
                finish();
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardScreen.this,Announcement.class));
                finish();
            }
        });

        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardScreen.this,MainActivity.class));
                finish();
            }
        });

        imag4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardScreen.this,MainActivity.class));
                finish();
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardScreen.this,MainActivity.class));
                finish();
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardScreen.this,Dashboard.class));
                finish();
            }
        });
        imag5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardScreen.this,Dashboard.class));
                finish();
            }
        });
        txt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardScreen.this,Dashboard.class));
                finish();
            }
        });


    }
}