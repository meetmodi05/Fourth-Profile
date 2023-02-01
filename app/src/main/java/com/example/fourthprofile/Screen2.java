package com.example.fourthprofile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class Screen2 extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<GridModel> gridModelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        recyclerView = findViewById(R.id.recyclerView);
        gridModelArrayList = new ArrayList<>();
        gridModelArrayList.add(new GridModel("Bodycon Dress", "4 Color", "$450.00", R.drawable.avttar_man));
        gridModelArrayList.add(new GridModel("Bodycon Dress", "6 Color", "$380.00", R.drawable.cute_illustration));
        gridModelArrayList.add(new GridModel("Bodycon Dress", "4 Color", "$450.00", R.drawable.avttar_man));
        gridModelArrayList.add(new GridModel("Bodycon Dress", "2 Color", "$50.00", R.drawable.cute_illustration));
        gridModelArrayList.add(new GridModel("Bodycon Dress", "1 Color", "$505.00", R.drawable.man_avtar));
        gridModelArrayList.add(new GridModel("Bodycon Dress", "3 Color", "$250.00", R.drawable.man_avtar));
        gridModelArrayList.add(new GridModel("Bodycon Dress", "3 Color", "$250.00", R.drawable.avttar_man));
        gridModelArrayList.add(new GridModel("Bodycon Dress", "3 Color", "$250.00", R.drawable.man_avtar));

        Screen2_RAdapter screen2_rAdapter = new Screen2_RAdapter(this, gridModelArrayList);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(screen2_rAdapter);
    }
}