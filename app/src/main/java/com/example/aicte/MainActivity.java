package com.example.aicte;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageSlider imageSlider,imageSlider2;

    TextView textView1,textView2,textView3;
    ImageView imageView1,imageView2,imageView3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        imageSlider=findViewById(R.id.image_slider);
        imageSlider2=findViewById(R.id.image_slider2);

        textView1=findViewById(R.id.portal);
        textView2=findViewById(R.id.parakh);
        textView3=findViewById(R.id.approved);

        imageView1=findViewById(R.id.portal_image);
        imageView2=findViewById(R.id.parakh_image);
        imageView3=findViewById(R.id.approved_college_image);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://www.linkpicture.com/q/two.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.linkpicture.com/q/three.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.linkpicture.com/q/four.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.linkpicture.com/q/five_1.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.linkpicture.com/q/six.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.linkpicture.com/q/seven.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://www.linkpicture.com/q/eight.jpg", ScaleTypes.FIT));


        ArrayList<SlideModel> slideModels1 = new ArrayList<>();

        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/apj%20abdul%20kalam.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/Homi%20Jehangir%20Bhabha.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/jagadish%20chandra%20bose.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/Srinivasa%20Ramanujan.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/Subramaniam%20Chandrasekhar.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/Vikram%20Sarabhai.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/swami%20vivekanand.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/asen_0.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/CV-Raman-Banner_2.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/har%20gobing%20khorana_0.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/Rabindranath%20Tagore_0.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/visvesvaraya_0.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/mother%20teresa.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/apj%20abdul%20kalam.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/Homi%20Jehangir%20Bhabha.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/jagadish%20chandra%20bose.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/Srinivasa%20Ramanujan.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/Subramaniam%20Chandrasekhar.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/Vikram%20Sarabhai.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/swami%20vivekanand.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/asen_0.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/CV-Raman-Banner_2.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/har%20gobing%20khorana_0.jpg",ScaleTypes.FIT));
        slideModels1.add(new SlideModel("https://www.aicte-india.org/sites/default/files/mother%20teresa.jpg",ScaleTypes.FIT));


        imageSlider.setImageList(slideModels,ScaleTypes.FIT);
        imageSlider2.setImageList(slideModels1,ScaleTypes.FIT);

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://internship.aicte-india.org/");
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://parakh.aicte-india.org/");
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.aicte-india.org/education/institutions/Universities");
            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://internship.aicte-india.org/");
            }
        });

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://parakh.aicte-india.org/");

            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goLink("https://www.aicte-india.org/education/institutions/Universities");
            }
        });

    }
    private void goLink(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}