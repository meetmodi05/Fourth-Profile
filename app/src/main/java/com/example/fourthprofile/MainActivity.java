package com.example.fourthprofile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    RecyclerViewAdapter rvAdapter;
    LinearLayoutManager horizontalLinearLayoutManager;
    ArrayList<size_model> size_modelArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rv = findViewById(R.id.rv);
        size_modelArrayList = new ArrayList<>();
        size_modelArrayList.add(new size_model(31));
        size_modelArrayList.add(new size_model(32));
        size_modelArrayList.add(new size_model(33));
        size_modelArrayList.add(new size_model(34));
        size_modelArrayList.add(new size_model(35));


        rv.setHasFixedSize(true);
        horizontalLinearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rv.setLayoutManager(horizontalLinearLayoutManager);
        rvAdapter = new RecyclerViewAdapter(this, size_modelArrayList);
        rv.setAdapter(rvAdapter);
    }
}