package com.example.design.Activities;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.design.Adapters.referentAdapter;
import com.example.design.R;

public class Referal_Activity extends AppCompatActivity {
    ListView mListView;
    RatingBar rtBar;
    String[] Names = {"Ahsaan","Rehan","Salman","Daniyal","Asad"};
    String[] subHeadingsFav = {"1 year","babysitting","singing","multiple times","Will think"};
    
    int[] images = {R.drawable.actor,R.drawable.actor,R.drawable.actor,R.drawable.actor,R.drawable.actor};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review_referal);
        mListView = findViewById(R.id.refListView);
        referentAdapter myAdapter = new referentAdapter(Referal_Activity.this,Names,subHeadingsFav,images,rtBar);
        mListView.setAdapter(myAdapter);
    }
}
