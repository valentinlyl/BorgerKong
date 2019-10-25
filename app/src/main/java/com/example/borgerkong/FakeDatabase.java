package com.example.borgerkong; // <============= CHANGE ME

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FakeDatabase {
    public static Food getFoodById(int foodID) {
        return foods.get(foodID);
    }

    public static ArrayList<Food> getAllFood() {
        return new ArrayList<Food>((List) Arrays.asList(foods.values().toArray()));
    }
    private static final HashMap<Integer, Food> foods = new HashMap<>();

    static {
        foods.put(1, new Food(
                1,
                "Whobber",
                4.00,
                "It's our famous and original borger! It contains a beef patties, tomato, onions, lettuce, creamy mayonnaise topped with a sprinkled sesame bun. ",
                R.drawable.whopper,
                0
        ));
        foods.put(2, new Food(
                2,
                "Double Whobber",
                4.50,
                "It's a Whobber but double the size of the borger, not just the patties. Get jumbo sized beef patties, tomato, onions, lettuce, creamy mayonnaise topped with a sprinkled sesame bun.",
                R.drawable.double_whopper,
                0
        ));

        foods.put(3, new Food(
                3,
                "Triple Whobber",
                5.00,
                "Okay, you know we can't go bigger borger right? We just made our burger taller. If you order this, you should already know what's in the original Whobber. I don't even know why you would eat this but, hey you're hungry and we want you full.",
                R.drawable.triple_whopper,
                0
        ));

        foods.put(4, new Food(
                4,
                "Fwies",
                1.50,
                "This is how my baby son calls this, so it stuck. It's crispy golden fries sprinkled with your choice of chicken salt or regular salt.",
                R.drawable.fries,
                0
        ));

        foods.put(5, new Food(
                5,
                "Onion Rongs",
                2.00,
                "Soft juicy onions covered in a crispy batter. It's delicious but sadly people only order this if it's inclusive in a meal. If you're reading this, you know it's delicious, just add it to your order.",
                R.drawable.onion,
                0
        ));

        foods.put(6, new Food(
                6,
                "Vegan Borger",
                4.00,
                "Look, every one is getting on the bandwagon and we think it's fair we do too. It's the Whobber but with a vegan patty made of who knows what... Try it to find out!",
                R.drawable.vegan,
                0
        ));
        foods.put(7, new Food(
                7,
                "Garden Salad",
                3.00,
                "A typical salad filled with lettuce, tomato, shaved carrot, spinach, rocket leaves topped with a light and zesty salad dressing.",
                R.drawable.salad,
                0
        ));
        foods.put(8, new Food(
                8,
                "10 Chicken Nuggets",
                4.20,
                "They sell it in all fast food restaurants. So we sell them too. Our chicken nuggets are lightly fried and finished off in an oven to ensure they are crispy but not oily. Game changer.",
                R.drawable.nuggets,
                0
        ));
        foods.put(9, new Food(
                9,
                "Chicken Borger",
                4.00,
                "Delicious chicken borger for those who can't have our Whobber. It contains a crispy chicken fillet, lettuce, tomato, mayonnaise sauce and a soft brioche bun.",
                R.drawable.chicken_burger,
                0
        ));
        foods.put(10, new Food(
                10,
                "Fish Borger",
                3.30,
                "For those who cannot eat meat, you can eat our fish borger instead. It consists of a fried fish fillet, lettuce, tartare sauce on a soft brioche bun.",
                R.drawable.fish_burger,
                0
        ));
        foods.put(11, new Food(
                11,
                "Beef Taco",
                1.30,
                "Why not? Let's taco-bout it. Mexican-style ground beef, cheese, tomato, lettuce in a crispy taco shell.",
                R.drawable.taco,
                0
        ));
        foods.put(12, new Food(
                12,
                "Cola Coca",
                1.10,
                "Because you need Coke with burgers. Period.",
                R.drawable.coca,
                0
        ));
        foods.put(13, new Food(
                13,
                "Chocolate Sundae",
                2.80,
                "Yummy soft serve ice cream in a cup drizzled with our signature hot chocolate sauce. You'll be dying for me more!",
                R.drawable.sundae,
                0
        ));
        foods.put(14, new Food(
                14,
                "Vanilla Soft Serve",
                0.40,
                "Our original soft serve, spirally, vanilla-ry goodness.",
                R.drawable.soft_serve,
                0
        ));
        foods.put(15, new Food(
                15,
                "Coffee",
                1.60,
                "Stay awake, grab some of our coffee at your convenience. Freshly-brewed Arabica beans. Only capuccinos at Borger Kong.",
                R.drawable.coffee,
                0
        ));
    }
}
