package org.launchcode;

import java.util.ArrayList;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void categoryValidation(MenuItem item) {
        // Define the allowed categories
        ArrayList<String> categories = new ArrayList<>();
        categories.add("appetizer");
        categories.add("main course");
        categories.add("dessert");

        // Check if the item's category is in the list of valid categories
        if (categories.contains(item.getCategory().toLowerCase())) {
            System.out.println("Category is valid.");
            setCategory(item.category);
        } else {
            System.out.println("Invalid category please pick appetizer, main course, dessert");
        }
    }

    public void priceValidation(MenuItem item) {
        if (item.price >= 0) {
            setPrice(item.price);
        } else {
            System.out.println("Please enter a price above 0.");
        }
    }
}
