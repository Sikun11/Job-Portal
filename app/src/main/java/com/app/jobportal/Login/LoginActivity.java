package com.app.jobportal.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.app.jobportal.R;
import com.app.jobportal.Register.SelectProfessionActivity;
import com.app.jobportal.Register.RegisterActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText userName=findViewById(R.id.login_username);
        EditText pwd=findViewById(R.id.login_pwd);

        Button loginBtn=findViewById(R.id.loginBtn);

        TextView signUp=findViewById(R.id.signup);


        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String uname=userName.getText().toString().trim();
                String password=pwd.getText().toString().trim();
                if(uname.isEmpty()){
                    Toast.makeText(LoginActivity.this,"Please Enter username",Toast.LENGTH_SHORT).show();
                }
                else if(password.isEmpty()){
                    Toast.makeText(LoginActivity.this,"Please Enter password",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(LoginActivity.this, SelectProfessionActivity.class);
                    startActivity(intent);
                }

            }
        });


    }
}