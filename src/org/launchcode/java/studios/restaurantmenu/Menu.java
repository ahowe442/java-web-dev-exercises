package org.launchcode.java.studios.restaurantmenu;

import java.time.LocalDateTime;
import java.util.ArrayList;
// do I need to import MenuItems up here?   Jacob said that I might need to just instansiate the variable.

public class Menu {
    private ArrayList<MenuItems> menu;
    private LocalDateTime lastUpdated;

    public Menu(){
        this.menu = new ArrayList<>();
        this.lastUpdated = LocalDateTime.now();
    }

    //Add menu items

    //remove menu items

    //tells if a menu item is new.

    //tells when the menu was last updated

    //print out both a single menu item

    //print out the entire menu

    //A way to determine whether or not two menu items are equal.

}