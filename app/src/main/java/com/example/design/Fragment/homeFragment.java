package com.example.design.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.design.Activities.StartEndActivity;
import com.example.design.R;

public class homeFragment extends Fragment {
    View view;
    Button btnStarted ;
    public homeFragment() {
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view  = inflater.inflate(R.layout.home_fragement,container,false);

        btnStarted = view.findViewById(R.id.getStarted);
        btnStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),StartEndActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }
}