package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void addItem(MenuItem newItem) {
        if (!items.contains(newItem)){
            items.add(newItem);
        } else {
            System.out.println("Error Adding Duplicate Item! " + newItem.getDescription());
        }

    }

    public void removeItem(MenuItem oldItem) {
        items.remove(oldItem);
    }

    public String printSingleItem(MenuItem item){
        return item.toString();
    }

    public String printFullMenu(){
        String result = "";
        for(MenuItem item : items) {
            result += "\n" + item.toString();
        }
        return result;
    }
}


