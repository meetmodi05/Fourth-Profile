package com.example.fourthprofile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<SizeModel> size_modelArrayList;

    public RecyclerViewAdapter(MainActivity mainActivity, ArrayList<SizeModel> size_modelArrayList) {
        this.size_modelArrayList = size_modelArrayList;
    }

    public void SetSizes(ArrayList<SizeModel> size_modelArrayList) {
        this.size_modelArrayList = new ArrayList<>();
        this.size_modelArrayList = size_modelArrayList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.size_layout, parent, false);
        View v1 = v.findViewById(R.id.sizeTV);
//        v1.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("ResourceAsColor")
//            @Override
//            public void onClick(View view) {
//                if (v1.isClickable()) {
//                    v1.setBackgroundColor(R.color.black);
//                }
//            }
//        });
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ViewHolder holder, int position) {
//        SizeModel sm = size_modelArrayList.get(position);
//        holder.sizetv.setText(Integer.toString(size_modelArrayList.getSize()));
        holder.binddata(size_modelArrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return size_modelArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private MaterialTextView sizetv;

        public ViewHolder(View v) {
            super(v);
            sizetv = v.findViewById(R.id.sizeTV);
        }

        void binddata(final SizeModel smodel) {
            int checkPostion = 0;
            if (checkPostion == -1) {
            }
        }
    }
}
