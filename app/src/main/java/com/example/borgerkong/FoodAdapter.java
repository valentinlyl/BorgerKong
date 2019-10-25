package com.example.borgerkong;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {
    public ArrayList<Food> foodArrayList;

    public void setData(ArrayList<Food> foodArrayList) {this.foodArrayList = foodArrayList; }

    // Constructor for ViewHolder
    public class ViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView name;
        public TextView qty;
        public ImageView photo;
        public Button btn;
        public TextView price;



        public ViewHolder(View v){
            super(v);
            view = v;
            name = v.findViewById(R.id.foodName);
            qty = v.findViewById(R.id.foodQTY);
            photo = v.findViewById(R.id.foodPhoto);
            btn = v.findViewById(R.id.btnViewOrder);
            price = v.findViewById(R.id.foodPrice);
        }
    }


    // Filling up the ViewHolder
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Intent Activity of clicking on the food item
    @Override
    public void onBindViewHolder(final FoodAdapter.ViewHolder holder, int position) {
        final Food food = this.foodArrayList.get(position);

        holder.name.setText(food.getName());
        holder.photo.setImageResource(food.getImageDrawableId());

        double amount = food.getPrice();
        holder.price.setText("$" + String.format("%.2f", amount));

        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();

                Intent intent = new Intent(context, FoodDetail.class);
                intent.putExtra("ID", food.getFoodID());
                context.startActivity(intent);
            }
        });

        holder.photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();

                Intent intent = new Intent(context, FoodDetail.class);
                intent.putExtra("ID", food.getFoodID());
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return foodArrayList.size();
    }
}




