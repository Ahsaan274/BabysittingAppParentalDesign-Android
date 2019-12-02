package com.example.design.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.design.R;

public class Activities_Adapter extends BaseAdapter{
    private Context mContext;
    private LayoutInflater inflater;
    private String[] mNumberWord;
    private int[] mNumberImages;

    public Activities_Adapter(Context mContext, String[] mNumberWord, int[] mNumberImages) {
        this.mContext = mContext;
        this.mNumberWord = mNumberWord;
        this.mNumberImages = mNumberImages;
    }

    @Override
    public int getCount() {
        return mNumberWord.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (inflater == null){
            inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.activities_items,null);

        }

        ImageView imageView = convertView.findViewById(R.id.act_img1);
        TextView textView = convertView.findViewById(R.id.act_txtV1);

        imageView.setImageResource(mNumberImages[position]);
        textView.setText(mNumberWord[position]);
        return convertView;
    }

}