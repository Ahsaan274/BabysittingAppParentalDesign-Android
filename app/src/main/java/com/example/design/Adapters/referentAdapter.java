package com.example.design.Adapters;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.design.R;

public class referentAdapter extends ArrayAdapter<String> {
    String[] headings,subHeadings;
    int[] images;
    RatingBar rtBar;
    Context mContext;
    public referentAdapter(Context context, String[] headings, String[] subHeadings, int[] PersonImages, RatingBar rtBr){
        super(context, R.layout.referral_items);
        this.headings = headings;
        this.subHeadings = subHeadings;
        this.images = PersonImages;
        this.mContext = context;
        this.rtBar = rtBr;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.referral_items,parent,false);
            mViewHolder.mImage = (ImageView) convertView.findViewById(R.id.refItemImg);
            mViewHolder.mHeadline = (TextView) convertView.findViewById(R.id.refName);
            mViewHolder.mHeadDetail = (TextView) convertView.findViewById(R.id.refTxtView);
            mViewHolder.rtBar = (RatingBar) convertView.findViewById(R.id.simpleRatingBar);
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
        RatingBar rtBar;
    }
    @Override
    public int getCount() {
        return headings.length;
    }
}