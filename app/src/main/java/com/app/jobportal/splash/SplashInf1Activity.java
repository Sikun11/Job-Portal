package com.app.jobportal.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.jobportal.R;

public class SplashInf1Activity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_inf1);
        init();
        listener();
    }

    public void init() {

        btn= findViewById(R.id.splash1_next);

    }

    public void listener() {

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == btn){

            Intent intent = new Intent(this,SplashInf2Activity.class);
            startActivity(intent);
        }
    }
}