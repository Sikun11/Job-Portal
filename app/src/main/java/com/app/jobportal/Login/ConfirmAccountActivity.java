package com.app.jobportal.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.app.jobportal.R;
import com.app.jobportal.Register.AccountSetActivity;

//for confirm account
public class ConfirmAccountActivity extends AppCompatActivity {

    private Button btn;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_account);
        String username=getIntent().getStringExtra("uname");

        text=findViewById(R.id.uName_textview);

        if(username !=null){
            text.setText(username);
        }

        init();
        listener();
    }
    private void init(){
        btn=findViewById(R.id.btn_create_acct);
    }

    private  void listener(){

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ConfirmAccountActivity.this, AccountSetActivity.class);
                startActivity(intent);
            }
        });
    }
}