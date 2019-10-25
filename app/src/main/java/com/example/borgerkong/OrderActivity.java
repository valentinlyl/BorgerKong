package com.example.borgerkong;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class OrderActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order);
        Intent intent = getIntent();
        Button send = findViewById(R.id.btnSendOrder);

        recyclerView = findViewById(R.id.orderRV);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        OrderAdapter myAdapter = new OrderAdapter();
        myAdapter.setData(FakeDatabase.getAllFood());
        recyclerView.setAdapter(myAdapter);

        total = findViewById(R.id.orderTotal);
        total.setText("Total: $" + String.format("%.2f", totalCalc()));




        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double total = totalCalc();
                if( total > 0) {
                    int num = new Random().nextInt(1001) + 1;
                    qtyReset();
                    Toast.makeText(getApplicationContext(), "Your order has been sent! Thank you for ordering at Borger Kong. Your Ticket Number is: #" + num , Toast.LENGTH_LONG).show();
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Add food to your order first.", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    public void qtyReset(){
        ArrayList<Food> order = FakeDatabase.getAllFood();
        for (Food food : order){ // iteratively through the order menu items
            food.setQty(0);
        }

    }

    public double totalCalc(){
        ArrayList<Food> order = FakeDatabase.getAllFood();
        double total = 0;
        for (Food food : order){ // iteratively through the order menu items
            double price = food.getPrice();
            int quantity = food.getQty();
            total += price*quantity;
        }
        return total;

    }


}
