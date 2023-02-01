package com.example.fourthprofile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Screen2_RAdapter extends RecyclerView.Adapter<Screen2_RAdapter.ViewHolder> {
    private ArrayList<GridModel> gridarraylist;

    public Screen2_RAdapter(Screen2 screen2, ArrayList<GridModel> gridModelArrayList) {
        this.gridarraylist = gridModelArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_view_recored, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        GridModel model = gridarraylist.get(position);
        holder.priceText.setText(model.getPrice());
        holder.cloth_title.setText(model.getTitle());
        holder.iv1.setImageResource(gridarraylist.get(position).getImage());
        holder.color_desc.setText(model.getColor_description());
    }

    @Override
    public int getItemCount() {
        return gridarraylist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView priceText, cloth_title, color_desc;
        private ImageView iv1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            priceText = itemView.findViewById(R.id.priceText);
            cloth_title = itemView.findViewById(R.id.cloth_title);
            color_desc = itemView.findViewById(R.id.color_desc);
            iv1 = itemView.findViewById(R.id.iv1);
        }
    }
}
