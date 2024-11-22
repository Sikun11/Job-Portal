package com.app.jobportal.Register;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.app.jobportal.Login.LoginActivity;
import com.app.jobportal.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText name=findViewById(R.id.register_name);
        EditText uname=findViewById(R.id.register_username);
        EditText pwd=findViewById(R.id.register_pwd);

        Button btn_register=findViewById(R.id.registerBtn);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String rName=name.getText().toString().trim();
                String uName=uname.getText().toString().trim();
                String rPwd=pwd.getText().toString().trim();

                if(rName.isEmpty()){
                    Toast.makeText(RegisterActivity.this,"Please Enter your name",Toast.LENGTH_SHORT).show();
                }
                else if (uName.isEmpty()){
                    Toast.makeText(RegisterActivity.this,"Please Enter your username",Toast.LENGTH_SHORT).show();
                }
                else if (rPwd.isEmpty()){
                    Toast.makeText(RegisterActivity.this,"Please Enter your password",Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent=new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}