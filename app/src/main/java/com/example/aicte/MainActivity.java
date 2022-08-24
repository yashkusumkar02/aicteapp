package com.example.aicte;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.navigation.NavigationView;
import com.yarolegovich.slidingrootnav.SlidingRootNav;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private ImageSlider imageSlider,imageSlider2;

    TextView textView1,textView2,textView3;
    ImageView imageView1,imageView2,imageView3,facebook,twitter;

    Button btn1,btn2,btn3,btn4;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        drawerLayout=findViewById(R.id.drawerlayout);
        navigationView=findViewById(R.id.navigationView);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.menu_Open,R.string.mnu_Close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);



        facebook=findViewById(R.id.facebook);
        twitter=findViewById(R.id.twitter);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.facebook.com/OfficialAICTE/");
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://twitter.com/AICTE_INDIA");
            }
        });

        btn1=findViewById(R.id.learn1);
        btn2=findViewById(R.id.learn2);
        btn3=findViewById(R.id.learn3);
        btn4=findViewById(R.id.learn4);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://scholarships.gov.in/");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://scholarships.gov.in/");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.aicte-india.org/schemes/students-development-schemes");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://www.ciiinnovation.in/");
            }
        });

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



    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    private void goLink(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{

            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                break;
            case R.id.nav_abt_us:
                Intent intent=new Intent(MainActivity.this,About_us.class);
                startActivity(intent);
                break;
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

}
