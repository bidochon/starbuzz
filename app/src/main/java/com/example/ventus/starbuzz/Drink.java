package com.example.ventus.starbuzz;

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    // drink is an array of Drinks
    public static final Drink[] drinks = {
            new Drink("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
            new Drink("Cappuccino", "Espresso, hot milk, and a steamed mil foam", R.drawable.cappuccino),
            new Drink("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter)
    };

    // drink constructor
    private Drink ( String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return this.description;
    }

    public String getName() {
        return this.name;
    }

    public int getImageResourceId() {
        return this.imageResourceId;
    }

    public String toString() {
        return this.name;
    }

}
