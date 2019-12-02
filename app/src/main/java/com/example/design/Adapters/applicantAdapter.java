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

public class applicantAdapter extends ArrayAdapter<String>{
    String[] names;
    int[] images;
    Context mContext;
    public applicantAdapter(Context context, String[] PersonNames, int[] PersonImages){
        super(context, R.layout.activity_listview_with_image_and_text);
        this.names = PersonNames;
        this.images = PersonImages;
        this.mContext = context;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.activity_listview_with_image_and_text, parent, false);
            mViewHolder.mImage = (ImageView) convertView.findViewById(R.id.img1);
            mViewHolder.mName = (TextView) convertView.findViewById(R.id.imgTxtV1);
            convertView.setTag(mViewHolder);
        }
        else{
            mViewHolder = (ViewHolder) convertView.getTag();
        }
        mViewHolder.mImage.setImageResource(images[position]);
        mViewHolder.mName.setText(names[position]);
        return convertView;
    }
    static class ViewHolder{
        ImageView mImage;
        TextView mName;
    }
}
