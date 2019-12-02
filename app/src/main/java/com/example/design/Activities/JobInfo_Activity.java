package com.example.design.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.design.Adapters.JobInfoAdapter;
import com.example.design.R;

public class JobInfo_Activity extends AppCompatActivity {
    ListView mListView;
    String[] Names = {"Ahsaan","Rehan","Salman"};
    String[] Ages = {"22","20","24"};
    String[] Gender = {"Male","male","MalE"};
    private Button btn;

    int[] images = {R.drawable.actor,R.drawable.actor,R.drawable.actor};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.job_info);
        btn = findViewById(R.id.btnEdit);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),JobInfoEdit_Activity.class);
                startActivity(intent);
            }
        });
        mListView = findViewById(R.id.jobInfoListV);
        JobInfoAdapter adapter = new JobInfoAdapter(JobInfo_Activity.this,Names,Ages,Gender,images);
        mListView.setAdapter(adapter);
    }
}