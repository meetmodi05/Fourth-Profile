package com.example.fourthprofile;

import static com.example.fourthprofile.R.layout.size_layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    RecyclerViewAdapter rvAdapter;
    LinearLayoutManager horizontalLinearLayoutManager;
    ArrayList<SizeModel> size_modelArrayList;
    ImageView iv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rv = findViewById(R.id.rv);
        iv1 = findViewById(R.id.iv1);
        size_modelArrayList = new ArrayList<>();
        size_modelArrayList.add(new SizeModel(31));
        size_modelArrayList.add(new SizeModel(32));
        size_modelArrayList.add(new SizeModel(33));
        size_modelArrayList.add(new SizeModel(34));
        size_modelArrayList.add(new SizeModel(35));

        Glide.with(this).load(getDrawable(R.drawable.girl_illustartion)).override(718, 1024).into(iv1);
        rv.setHasFixedSize(true);
        horizontalLinearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false);
        rv.setLayoutManager(horizontalLinearLayoutManager);
        rvAdapter = new RecyclerViewAdapter(this, size_modelArrayList);
        rv.setAdapter(rvAdapter);
        View v = LayoutInflater.from(getApplicationContext()).inflate(size_layout, null, false);
        View vs = v.findViewById(R.id.sizeTV);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (vs.isClickable()) {
                    vs.setBackgroundColor(getColor(R.color.black));
                }
            }
        });
    }
}