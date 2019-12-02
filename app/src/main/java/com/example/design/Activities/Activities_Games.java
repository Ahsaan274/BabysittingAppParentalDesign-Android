package com.example.design.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.design.Adapters.Activities_Adapter;
import com.example.design.R;

public class Activities_Games extends AppCompatActivity {
    GridView mGridView;
    private Button btn;
    String[] numberWord = {"One","two","three","four","five","six","seven","eight","nine"};
    int[] numberImages = {R.drawable.actor,R.drawable.ehsan,R.drawable.ab,R.drawable.ay,R.drawable.fat,R.drawable.logoman,
            R.drawable.actor,R.drawable.ehsan,R.drawable.rehan};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activities_games);
        mGridView = findViewById(R.id.act_gridV);
        btn = findViewById(R.id.next3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),JobInfo_Activity.class);
                startActivity(intent);
            }
        });
        Activities_Adapter adapter = new Activities_Adapter(Activities_Games.this,numberWord,numberImages);
        mGridView.setAdapter(adapter);
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}