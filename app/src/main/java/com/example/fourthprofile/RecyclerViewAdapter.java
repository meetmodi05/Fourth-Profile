package com.example.fourthprofile;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    int row_index = -1;
    private final ArrayList<SizeModel> modellist;

    public RecyclerViewAdapter(MainActivity mainActivity, ArrayList<SizeModel> modellist) {
        this.modellist = modellist;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.size_layout, parent, false);
        return new ViewHolder(v);
    }

    @SuppressLint("ResourceAsColor")
    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        SizeModel model = modellist.get(position);
        holder.textview.setText(Integer.toString(model.getSize()));
        holder.textview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                row_index = position;
                notifyDataSetChanged();
            }
        });
        if (row_index == position) {
            holder.textview.setSelected(true);
        } else {
            holder.textview.setSelected(false);
//            holder.textview.setTextColor(Color.BLACK);

        }
    }

    @Override
    public int getItemCount() {
        return modellist.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public MaterialTextView textview;
        public LinearLayout ll1;
//        public CardView cv;

        public ViewHolder(View v) {
            super(v);
            textview = v.findViewById(R.id.sizeTV);
//            cv = v.findViewById(R.id.cv1);
            ll1 = v.findViewById(R.id.layout);
        }
    }
}
