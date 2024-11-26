package com.app.jobportal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class JobFilterActivity extends AppCompatActivity {

    Spinner spinner1,spinner2,spinner3;
    String[] jobSet={"Software Development","Data & Analytics","Cloud Computing","Quality Assurance","Project Management"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_filter);

        //job category
        spinner1=findViewById(R.id.jobCategorySpinner);

        ArrayAdapter<String> adpter=new ArrayAdapter<>(JobFilterActivity.this, android.R.layout.simple_spinner_item,jobSet);
        adpter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adpter);

        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String value=parent.getItemAtPosition(position).toString();
                Toast.makeText(JobFilterActivity.this,value,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }

        });

        //sub category
        spinner2=findViewById(R.id.subCategorySpinner);


    }
}