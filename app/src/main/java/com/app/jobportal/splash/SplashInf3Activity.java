package com.app.jobportal.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.jobportal.Login.LoginActivity;
import com.app.jobportal.R;

public class SplashInf3Activity extends AppCompatActivity implements View.OnClickListener {

    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_inf3);
        init();
        listener();
    }

    private  void init(){
        btn=findViewById(R.id.splash3_next);
    }
    private void listener(){
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(btn==v){
            Intent intent=new Intent(this, LoginActivity.class);
            startActivity(intent);
        }
    }
}