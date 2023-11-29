package com.example.yup;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yup.adapter.RecyclerAdapter;
import com.example.yup.generator.Generator;
import com.example.yup.model.Vegetable;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    List<Vegetable> items;
    RecyclerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        FloatingActionButton button = findViewById(R.id.floatBtn);
        button.setOnClickListener(this);

        items = Generator.generate(10);
        adapter = new RecyclerAdapter(items);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @SuppressLint("NotifyDataSetChanged")
    @Override
    public void onClick(View view) {
        for(Vegetable v: items) {
            v.setQuantity(new Random().nextInt(100));
        }
        adapter.notifyDataSetChanged();
    }
}