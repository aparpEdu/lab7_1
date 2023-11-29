package com.example.yup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.yup.models.Fruit;
import com.example.yup.models.Vegetable;

public class ItemDataActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_data);

        TextView quantity = findViewById(R.id.itemQuantity);
        TextView name = findViewById(R.id.itemName);
        TextView price = findViewById(R.id.itemPrice);
        TextView index = findViewById(R.id.itemIndex);

            Vegetable vegetable = getIntent().getParcelableExtra("vegetable");
            if (vegetable != null) {
                quantity.setText(String.valueOf(vegetable.getQuantity()));
                name.setText(vegetable.getName());
                price.setText(String.valueOf(vegetable.getPrice()));
            } else {
                Fruit fruit = getIntent().getParcelableExtra("fruit");
                if (fruit != null) {
                    quantity.setText(String.valueOf(fruit.getQuantity()));
                    name.setText(fruit.getName());
                    price.setText(String.valueOf(fruit.getPrice()));
                    index.setText(String.valueOf(fruit.getSweetIndex()));
                }

            }
            findViewById(R.id.backBtn).setOnClickListener(view -> finish());
    }
}