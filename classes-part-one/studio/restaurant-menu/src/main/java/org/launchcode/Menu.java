package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItemsList;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> menuItemsList, Date lastUpdated) {
        this.menuItemsList = menuItemsList;
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItemsList() {
        return menuItemsList;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setMenuItemsList(ArrayList<MenuItem> menuItemsList) {
        this.menuItemsList = menuItemsList;
    }

    public void updateMenu(MenuItem item, Date date) {
        if (item.isNew()){
            item.setNew(false);
            this.menuItemsList.add(item);
            this.lastUpdated = date;
        }
    }
}
