package com.example.design.Activities;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.design.Adapters.applicantAdapter;
import com.example.design.R;

public class applicantActivity extends AppCompatActivity {
    ListView mListView;

    String[] Names = {"Ahsaan","Rehan","Salman","Daniyal","Asad"};

    int[] images = {R.drawable.logoman,R.drawable.logoman,R.drawable.logoman,R.drawable.logoman,R.drawable.logoman};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.applicant_activity);
        mListView = findViewById(R.id.listView);
        applicantAdapter myAdapter = new applicantAdapter(applicantActivity.this,Names,images);
        mListView.setAdapter(myAdapter);
    }
}