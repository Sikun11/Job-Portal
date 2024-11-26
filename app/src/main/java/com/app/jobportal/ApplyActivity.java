package com.app.jobportal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class ApplyActivity extends AppCompatActivity {

    private Button btn;
    private TextView uploadBtn,result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apply);

        btn=findViewById(R.id.ApplyResume_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ApplyActivity.this,UploadCvActivity.class);
                startActivity(intent);
            }
        });

        /*file upload*/
        uploadBtn=findViewById(R.id.upload_btn);
        result=findViewById(R.id.textResult);

        uploadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showFileChooser();
            }
        });


    }

    private void showFileChooser(){
        Intent intent=new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("*/*");
        intent.addCategory(Intent.CATEGORY_OPENABLE);

        try {
            startActivityForResult(Intent.createChooser(intent,"select a file"),100);
        }catch (Exception e){
            Toast.makeText(this,"please install a file manager",Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected  void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode==100 && resultCode== RESULT_OK && data!=null){
            Uri uri=data.getData();
            String path=uri.getPath();
            File file=new File(path);
            Log.e("ResumePath" , String.valueOf(file));

//            result.setText(file.getName());
        }

        super.onActivityResult(requestCode, resultCode, data);
    }


}