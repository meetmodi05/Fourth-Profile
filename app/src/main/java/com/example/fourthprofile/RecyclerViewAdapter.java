package com.example.fourthprofile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<size_model> size_modelArrayList;

    public RecyclerViewAdapter(MainActivity mainActivity, ArrayList<size_model> size_modelArrayList) {
        this.size_modelArrayList = size_modelArrayList;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.size_layout, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
        size_model sm = size_modelArrayList.get(position);
        holder.sizetv.setText(Integer.toString(sm.getSize()));
    }

    @Override
    public int getItemCount() {
        return size_modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        MaterialTextView sizetv;

        public ViewHolder(View v) {
            super(v);
            sizetv = v.findViewById(R.id.sizeTV);
        }
    }
}
