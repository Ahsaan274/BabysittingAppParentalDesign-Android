package com.example.design.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


import com.example.design.R;

public class JobInfoEditAdapter extends ArrayAdapter<String> {
    String[] Names,Ages,Gender;
    int[] images;
    Context mContext;
    public JobInfoEditAdapter(Context context, String[] Names, String[] Ages,String[] gender,int[] images){
        super(context, R.layout.job_info_edit_items);
        this.Names = Names;
        this.Ages = Ages;
        this.Gender = gender;
        this.images = images;
        this.mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.job_info_edit_items,parent,false);
            mViewHolder.mImage =  convertView.findViewById(R.id.JobIitemImg);
            mViewHolder.mName =  convertView.findViewById(R.id.jIItxtVName);
            mViewHolder.mAge =  convertView.findViewById(R.id.jIItxtVAge);
            mViewHolder.mGender = convertView.findViewById(R.id.jIItxtVGen);
            convertView.setTag(mViewHolder);
        }
        else{
            mViewHolder = (ViewHolder) convertView.getTag();
        }
        mViewHolder.mImage.setImageResource(images[position]);
        mViewHolder.mName.setText(Names[position]);
        mViewHolder.mAge.setText(Ages[position]);
        mViewHolder.mGender.setText(Gender[position]);
        return convertView;
    }
    static class ViewHolder{
        ImageView mImage;
        TextView mName;
        TextView mAge;
        TextView mGender;
    }
    @Override
    public int getCount() {
        return Names.length;
    }
}

