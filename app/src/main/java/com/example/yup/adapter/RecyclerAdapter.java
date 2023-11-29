package com.example.yup.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yup.ItemDataActivity;
import com.example.yup.R;
import com.example.yup.holder.RecyclerHolder;
import com.example.yup.models.Fruit;
import com.example.yup.models.Vegetable;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerHolder> {
    private final List<Vegetable> items;
    private Context context;

    public RecyclerAdapter(List<Vegetable> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View shopView = inflater.inflate(R.layout.item, parent, false);

        return new RecyclerHolder(shopView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {
        Vegetable item = items.get(position);
        holder.setName(item.getName());
        holder.setQuantity(item.getQuantity());

        holder.itemView.setOnClickListener(view -> {
            if (item instanceof Fruit) {
                Fruit fruit = (Fruit) item;
                Intent intent = new Intent(context, ItemDataActivity.class);
                intent.putExtra("fruit", fruit);
                context.startActivity(intent);
            }
            Intent intent = new Intent(context, ItemDataActivity.class);
            intent.putExtra("vegetable", item);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

}
