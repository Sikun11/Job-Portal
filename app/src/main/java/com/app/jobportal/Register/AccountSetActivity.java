package com.app.jobportal.Register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.jobportal.HomeActivity;
import com.app.jobportal.R;

public class AccountSetActivity extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account_set);
        init();
        listener();
    }

    private void init() {
        btn=findViewById(R.id.btn_back_home);
    }
    private void listener(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AccountSetActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}