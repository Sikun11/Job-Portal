package com.app.jobportal.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.app.jobportal.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Timer().schedule(new TimerTask() {
            @Override

            public void run() {
                startActivity(new Intent(getApplicationContext(), SplashInf1Activity.class));
                finish();
            }
        }, 3000);
    }
}