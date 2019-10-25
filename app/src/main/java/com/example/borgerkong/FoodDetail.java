package com.example.borgerkong;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FoodDetail extends AppCompatActivity {

    public int qty = 0;
    public Food foodItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_detail);

        Intent intent = getIntent();
        int num = intent.getIntExtra("ID", 0);
        foodItem = FakeDatabase.getFoodById(num);


        TextView name = findViewById(R.id.detailName);
        TextView price = findViewById(R.id.detailPrice);
        TextView description = findViewById(R.id.detailDesc);
        ImageView image = findViewById(R.id.detailPhoto);
        Button add = findViewById(R.id.detailAdd);
        Button minus = findViewById(R.id.detailMinus);
        Button submit = findViewById(R.id.detailSubmit);

        name.setText(foodItem.getName());
        description.setText(foodItem.getDescription());
        image.setImageResource(foodItem.getImageDrawableId());

        double amount = foodItem.getPrice();
        price.setText("$" + String.format("%.2f", amount));

        final TextView qtyText = findViewById(R.id.detailQTY);
        qtyText.setText("0");
        qty = Integer.parseInt(qtyText.getText().toString());


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (qty != 0){
                    qty--;
                    qtyText.setText(String.valueOf(qty));
                }
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                qty +=1;
                qtyText.setText(String.valueOf(qty));
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(qty >= 1) {
                    int prevQTY = foodItem.getQty();
                    foodItem.setQty(qty + prevQTY);
                    Toast.makeText(getApplicationContext(), foodItem.getName() + " added", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Enter Quantity before adding", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

