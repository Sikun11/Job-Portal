package com.app.jobportal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView btn1,btn2,btn3;
    private ImageView apply_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ViewPager viewPager=findViewById(R.id.myViewPager);
        MyAdpter adpter=new MyAdpter((getSupportFragmentManager()));
        viewPager.setAdapter(adpter);

        btn1=findViewById(R.id.job1);
        btn2=findViewById(R.id.job2);
        btn3=findViewById(R.id.job3);

        //btn1
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,JobDescriptionActivity.class);
                startActivity(intent);
            }
        });
        //btn2
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,JobDescriptionActivity.class);
                startActivity(intent);
            }
        });
        //btn3
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,JobDescriptionActivity.class);
                startActivity(intent);
            }
        });

        //filter
        apply_btn=findViewById(R.id.applyFilter_btn);
        apply_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,JobFilterActivity.class);
                startActivity(intent);
            }
        });

    }
}