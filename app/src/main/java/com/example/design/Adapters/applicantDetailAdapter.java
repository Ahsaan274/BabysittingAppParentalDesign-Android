package com.example.design.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.design.R;

import org.w3c.dom.Text;

import java.util.List;

public class applicantDetailAdapter extends ArrayAdapter<String>{
    String[] headings,subHeadings;
    int[] images;
    Context mContext;

    public applicantDetailAdapter(Context context, String[] headings,String[] subHeadings, int[] PersonImages){
        super(context, R.layout.applicant_detail_itemlist);
        this.headings = headings;
        this.subHeadings = subHeadings;
        this.images = PersonImages;
        this.mContext = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        //applicantDetailAdapter.ViewHolder mViewHolder = new applicantDetailAdapter.ViewHolder();

        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.applicant_detail_itemlist,parent,false);
            mViewHolder.mImage = (ImageView) convertView.findViewById(R.id.nonScrollImg);
            mViewHolder.mHeadline = (TextView) convertView.findViewById(R.id.headlineTxtView);
            mViewHolder.mHeadDetail = (TextView) convertView.findViewById(R.id.headlineDetail);
            convertView.setTag(mViewHolder);
        }
        else{
            mViewHolder = (ViewHolder) convertView.getTag();
        }
        mViewHolder.mImage.setImageResource(images[position]);
        mViewHolder.mHeadline.setText(headings[position]);
        mViewHolder.mHeadDetail.setText(subHeadings[position]);
        return convertView;
    }
    static class ViewHolder{
        ImageView mImage;
        TextView mHeadline;
        TextView mHeadDetail;
    }
    @Override
    public int getCount() {
        return headings.length;
    }
}
