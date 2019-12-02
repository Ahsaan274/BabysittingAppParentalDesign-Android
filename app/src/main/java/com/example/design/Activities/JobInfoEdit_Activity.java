package com.example.design.Activities;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import com.example.design.Adapters.JobInfoEditAdapter;
import com.example.design.R;

public class JobInfoEdit_Activity extends AppCompatActivity {
    ListView mListView;
    String[] Names = {"Ahsaan","Rehan","Salman"};
    String[] Ages = {"22","20","24"};
    String[] Gender = {"Male","male","MalE"};
private Button btn;
    int[] images = {R.drawable.actor,R.drawable.actor,R.drawable.actor};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.job_info_edit);
        mListView = findViewById(R.id.editListView);
        btn = findViewById(R.id.btnRmv);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),applicantDetailActivity.class);
                startActivity(intent);
            }
        });
        JobInfoEditAdapter adapter = new JobInfoEditAdapter(JobInfoEdit_Activity.this,Names,Ages,Gender,images);
        mListView.setAdapter(adapter);

        /*showDialog("");*/
    }
    /*@RequiresApi(api = Build.VERSION_CODES.P)
    public void showDialog(String msg){
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.alert_dialog_lastminute);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        TextView text = dialog.findViewById(R.id.txtVLastMinute);
        text.setText("This job is super last minute!");

        TextView text2 = dialog.findViewById(R.id.txtVLM2);
        text2.setText("To make sure you have aplicants, this is the place, for your job is below:");

        ImageView iV = dialog.findViewById(R.id.img2);
        iV.setImageDrawable(getResources().getDrawable(R.drawable.ab));

        dialog.show();
    }*/
}