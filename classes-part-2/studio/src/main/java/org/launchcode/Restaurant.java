package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        // write your code here
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        Menu menu = new Menu(new Date(), menuItems);


        MenuItem pasta = new MenuItem(5.99, "Noodles", "main course", true);
        MenuItem pizza = new MenuItem(7.99, "Pep Pizza", "main course", true);
        MenuItem mozzSticks = new MenuItem(4.99, "Cheesy sticks", "appetizer", false);

        menu.addItem(pasta);
        menu.addItem(pizza);
        menu.addItem(mozzSticks);
        menu.addItem(mozzSticks);

        System.out.println(menu.printSingleItem(mozzSticks));
        System.out.println(menu.printFullMenu());

        menu.removeItem(pizza);

        System.out.println(menu.printFullMenu());
    }
}
