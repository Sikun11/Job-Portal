package com.app.jobportal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.tabs.TabLayout;

public class JobDescriptionActivity extends AppCompatActivity {

    BottomSheetDialog bottomSheetDialogRequirement,bottomSheetDialogReview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_description);

        bottomSheetDialogRequirement=new BottomSheetDialog(this);
        bottomSheetDialogReview=new BottomSheetDialog(this);

        /*requirement*/
        bottomSheetDialogRequirement.setContentView(R.layout.requirement_bottom_dialog_layout);
        bottomSheetDialogRequirement.setCancelable(true);
        bottomSheetDialogRequirement.setCanceledOnTouchOutside(true);


        Button btnRequirementShow=findViewById(R.id.button_requirement);

        btnRequirementShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialogRequirement.show();
            }
        });

        /*btnReview*/
        bottomSheetDialogReview.setContentView(R.layout.review_bottom_dialog_layout);
        bottomSheetDialogReview.setCancelable(true);
        bottomSheetDialogReview.setCanceledOnTouchOutside(true);

        Button btnReviewShow=findViewById(R.id.button_review);
        btnReviewShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bottomSheetDialogReview.show();
            }
        });

    }
}