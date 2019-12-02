package com.example.design.Adapters;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.design.R;

import java.util.ArrayList;
import java.util.List;

public class ResponsibilityAdapter extends ArrayAdapter<String> {

    String[] editText;
    Context mContext;
    public int count =3;
    public EditText text;

    public List<String> stringList;

    public ResponsibilityAdapter(Context context){
        super(context, R.layout.responsibility_activity);
        this.mContext = context;
        stringList = new ArrayList<>();
    }
    @Override
    public int getCount() {
        return count;
    }


    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();
        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService
                    (Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.resp_items, parent, false);

            mViewHolder.mEditText =  convertView.findViewById(R.id.resp_editText);
            mViewHolder.mEditText.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    //Toast.makeText(getContext(),"Before",Toast.LENGTH_LONG).show();
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    //Toast.makeText(getContext(),"During",Toast.LENGTH_LONG).show();
                }
                @Override
                public void afterTextChanged(Editable editable) {

                    if (editable.length() == 0)
                        Toast.makeText(getContext(),"You must entered!",Toast.LENGTH_LONG).show();
                    else if (editable.length()>0){
                        stringList.add(position,editable.toString());
                        Log.i( "afterTextChanged: ",stringList.toString());
                    }
                }
            });

            final EditText et = convertView.findViewById(R.id.resp_editText);
            mViewHolder.mEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View view, boolean b) {
                    if(b){
                        Toast.makeText(mContext, "focus", Toast.LENGTH_SHORT).show();
                    }
                    else if(!b) {
                        Toast.makeText(mContext, "Not-" +"focus", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(mContext, "Select field to fill data", Toast.LENGTH_SHORT).show();
                    }

                }
            });
            convertView.setTag(mViewHolder);
        }
        else{
            mViewHolder = (ViewHolder) convertView.getTag();

        }
        //mViewHolder.mEditText.setText("");
        return convertView;
    }
    static class ViewHolder{
        EditText mEditText;
    }
}