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

public class AlertAddAdapter extends ArrayAdapter<String> {
    String[] namesss;
    String[] descrippp;
    int[] images;
    Context mContext;
    public int count = 2;
    public AlertAddAdapter(Context context, String[] PersonNames, int[] PersonImages,String[] description){
        super(context, R.layout.add_kid_alert_items);
        this.namesss = PersonNames;
        this.images = PersonImages;
        this.mContext = context;
        this.descrippp = description;
    }

    @Override
    public int getCount() {
        return count;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.add_kid_alert_items, parent, false);
            mViewHolder.mImage = (ImageView) convertView.findViewById(R.id.alrt_img1);
            mViewHolder.mName = (TextView) convertView.findViewById(R.id.aler_add_txtV2);
            mViewHolder.mDesc = (TextView) convertView.findViewById(R.id.Alert_Add_desc);
            convertView.setTag(mViewHolder);
        }
        else{
            mViewHolder = (ViewHolder) convertView.getTag();
        }
       /* mViewHolder.mImage.setImageResource(images[position]);
        mViewHolder.mName.setText(namesss[position]);
         mViewHolder.mDesc.setText(descrippp[position]);*/
        return convertView;
    }
    static class ViewHolder{
        ImageView mImage;
        TextView mName;
        TextView mDesc;
    }
}