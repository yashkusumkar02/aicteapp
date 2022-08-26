package com.example.aicte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class StatisticsDashboard extends AppCompatActivity {

    ImageView imageView;

    BarChart barChart;
    PieChart pieChart;
    ArrayList<PieEntry> pieEntries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics_dashboard);

        barChart=findViewById(R.id.bar_chart);
        pieChart=findViewById(R.id.pie_chart);
        pieEntries = new ArrayList<>();
        imageView=findViewById(R.id.gotoDashboardstat);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(StatisticsDashboard.this,DashboardScreen.class));
                finish();
            }
        });

        ArrayList<BarEntry> barEntries =new ArrayList<>();

        ArrayList<PieEntry>pieEntries = new ArrayList<>();


        for (int i=1; i<11; i++){
            float value =(float)(i*10.00);

            BarEntry barEntry= new BarEntry(i,value);

            PieEntry pieEntry=new PieEntry(i,value);
            barEntries.add(barEntry);
            pieEntries.add(pieEntry);
        }
        BarDataSet barDataSet =new BarDataSet(barEntries,"Institutes Enrollment");
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        barDataSet.setDrawValues(false);

        barChart.setData(new BarData(barDataSet));
        barChart.animateY(5000);
        barChart.getDescription().setText("Institute chart");
        barChart.getDescription().setTextColor(Color.BLUE);


        PieDataSet pieDataSet = new PieDataSet(pieEntries,"Institute");
        pieDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        pieChart.setData(new PieData(pieDataSet));
        pieChart.animateXY(5000,5000);
        pieChart.getDescription().setEnabled(false);


    }
}