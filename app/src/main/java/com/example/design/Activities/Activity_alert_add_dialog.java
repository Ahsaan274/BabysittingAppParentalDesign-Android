package com.example.design.Activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.design.Adapters.AlertAddAdapter;
import com.example.design.R;

public class Activity_alert_add_dialog extends AppCompatActivity {
    ListView mListView;
    ImageView iV;
    String[] Namess;
    String[] Description;

    int[] images = {R.drawable.logoman,R.drawable.logoman};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_kid_alert_dialog);
        mListView = findViewById(R.id.alert_Add);
        iV = findViewById(R.id.alert_items_img);

        final AlertAddAdapter myAdapter = new AlertAddAdapter(this,Namess,images,Description);
        mListView.setAdapter(myAdapter);
        iV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myAdapter.count++;
                myAdapter.notifyDataSetChanged();
            }
        });
    }
}
