package com.app.jobportal.Register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.app.jobportal.Login.ConfirmAccountActivity;
import com.app.jobportal.R;

public class SelectProfessionActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectprofession);

        init();
        listener();
    }
    private void init(){
        btn=findViewById(R.id.continue_btn);
    }
    private void listener(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SelectProfessionActivity.this, ConfirmAccountActivity.class);
                startActivity(intent);
            }
        });
    }
}