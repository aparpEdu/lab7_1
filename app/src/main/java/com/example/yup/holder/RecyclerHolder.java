package com.example.yup.holder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.yup.R;

public class RecyclerHolder extends RecyclerView.ViewHolder {

    private final TextView name;
    private final TextView quantity;
    public RecyclerHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.recycler_name);
        quantity = itemView.findViewById(R.id.recycler_price);
    }


    public void setName(String name) {
        this.name.setText(name);
    }

    public void setQuantity(double quantity) {
        this.quantity.setText(String.valueOf(quantity));
    }
}
