
package com.example.borgerkong;

public class Food {
    private int foodID;
    private String name;
    private double price;
    private String description;
    private int imageDrawableId;
    private int qty;

    public Food(int foodID, String name, double price, String description, int imageDrawableId, int qty) {
        this.foodID = foodID;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageDrawableId = imageDrawableId;
        this.qty = qty;
    }

    public int getFoodID() { return foodID; }
    public void setFoodID(int foodID) {this.foodID = foodID;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}

    public int getImageDrawableId() {return imageDrawableId;}
    public void setImageDrawableId(int imageDrawableId) {this.imageDrawableId = imageDrawableId;}

    public int getQty() {return qty;}
    public void setQty(int qty) {this.qty = qty;}
}



