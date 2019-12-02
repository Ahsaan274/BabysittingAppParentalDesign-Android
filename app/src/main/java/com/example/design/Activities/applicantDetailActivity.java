package com.example.design.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.design.Adapters.applicantDetailAdapter;
import com.example.design.Views.NonScrollListView;
import com.example.design.R;

public class applicantDetailActivity extends AppCompatActivity {
    NonScrollListView mListView;
    private Button btn;
    String[] headings = {"Past Experience","My Hobbies","Free time Activities",
            "Awards I got","Social Activities I do"};

    String[] subHeadings = {"1 year","babysitting","singing","multiple times","Will think"};

    int[] images = {R.drawable.ehsan,R.drawable.ehsan,R.drawable.ehsan,R.drawable.ehsan,R.drawable.ehsan};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.applicant_detail);
        btn = findViewById(R.id.btnBookSitter);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Referal_Activity.class);
                startActivity(intent);
            }
        });

        mListView = findViewById(R.id.nonScrollList);
        applicantDetailAdapter myAdapter = new applicantDetailAdapter(applicantDetailActivity.this,headings,subHeadings,images);
        mListView.setAdapter(myAdapter);
    }
}
