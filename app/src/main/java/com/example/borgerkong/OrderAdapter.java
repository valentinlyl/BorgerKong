package com.example.borgerkong;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.ViewHolder> {

    private ArrayList<Food> foodArrayList;

    public void setData(ArrayList<Food> foodArrayList) {   this.foodArrayList = foodArrayList;   }

    @Override
    public int getItemCount() {        return foodArrayList.size();    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public View view;
        public TextView name;
        public TextView qty;
        public ImageView photo;
        public TextView price;
        public TextView subtotal;


        public ViewHolder(View v) {
            super(v);
            view = v;
            name = v.findViewById(R.id.foodName);
            qty = v.findViewById(R.id.foodQTY);
            photo = v.findViewById(R.id.foodPhoto);
            price = v.findViewById(R.id.foodPrice);
            subtotal = v.findViewById(R.id.foodSubtotal);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.food, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Food food = foodArrayList.get(position);

        int check = food.getQty();

        if(check >= 1) {
            holder.itemView.setVisibility(View.VISIBLE);
            holder.itemView.setLayoutParams(new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            String quantity = "Quantity: " + (food.getQty());
            holder.name.setText(food.getName());
            holder.photo.setImageResource(food.getImageDrawableId());
            holder.qty.setText(quantity);

            double amount = food.getPrice();
            holder.price.setText("$" + String.format("%.2f", amount));

            double stotal = food.getPrice() * food.getQty();
            holder.subtotal.setText("Subtotal: $" + String.format("%.2f", stotal));
        } else {
            holder.itemView.setVisibility(View.GONE);
            holder.itemView.setLayoutParams(new RecyclerView.LayoutParams(0,0));
        }
    }
}
