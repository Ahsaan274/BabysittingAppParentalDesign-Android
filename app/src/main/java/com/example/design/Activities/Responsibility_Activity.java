package com.example.design.Activities;

import android.content.Intent;
import android.os.Bundle;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.example.design.Adapters.ResponsibilityAdapter;
import com.example.design.R;

public class Responsibility_Activity extends AppCompatActivity {
    ListView mListView;
    ImageView addBtn;
    Button btnSv, btnRes;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.responsibility_activity);

        mListView = findViewById(R.id.resp_listV);
        addBtn = findViewById(R.id.resp_img1);
        btnSv = findViewById(R.id.resp_btnSv);
        btnRes = findViewById(R.id.resp_btnSv);
        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Activities_Games.class);
                startActivity(intent);
            }
        });
        final ResponsibilityAdapter myAdapter = new ResponsibilityAdapter(Responsibility_Activity.this);
        mListView.setAdapter(myAdapter);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myAdapter.count++;
                myAdapter.notifyDataSetChanged();
            }
        });
    }
}