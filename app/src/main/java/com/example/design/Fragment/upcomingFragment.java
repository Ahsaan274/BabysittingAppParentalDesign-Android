package com.example.design.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.design.R;

import java.util.ArrayList;
import java.util.List;

public class upcomingFragment extends Fragment {
    public static Fragment newInstance() {
        return new upcomingFragment();
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.upcoming_fragment, container, false);
        List<String> list = new ArrayList<>();
        list.add("Babysitter is here 1!");
        list.add("Babysitter is here 2");
        list.add("Babysitter is here 3");
        list.add("Babysitter is here 4");
        list.add("Babysitter is here 5");

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new RecyclerViewAdapter(list));
        return view;
    }
    private class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private CardView mCardView;
        private TextView mTextView;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
        }
        public RecyclerViewHolder(LayoutInflater inflater, ViewGroup container) {
            super(inflater.inflate(R.layout.cardview, container, false));
            mCardView = itemView.findViewById(R.id.card_container);
            mTextView = itemView.findViewById(R.id.txtV1);
        }
    }
    private class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
        private List<String> mList;
        public RecyclerViewAdapter(List<String> list) {
            mList = list;
        }
        @NonNull
        @Override
        public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(getActivity());
            return new RecyclerViewHolder(inflater, parent);
        }
        @Override
        public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
            holder.mTextView.setText(mList.get(position));
            holder.mTextView.setText(mList.get(position));
        }
        @Override
        public int getItemCount() {
            return mList.size();
        }
    }
}
