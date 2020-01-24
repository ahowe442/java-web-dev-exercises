package org.launchcode.java.studios.restaurantmenu;

import java.time.LocalDateTime;
import java.util.ArrayList;
// do I need to import MenuItems up here?   Jacob said that I might need to just instanciate the variable.

public class Menu {
    private ArrayList<MenuItems> menu;
    private LocalDateTime lastUpdated;

    public Menu(){
        this.menu = new ArrayList<>();
        this.lastUpdated = LocalDateTime.now();
    }

    //Add menu items
    //tells when the menu was last updated
    public void addMenuItem(MenuItems menuItems){
        menu.add(menuItems);
        lastUpdated =  LocalDateTime.now();

    }

    //remove menu items
    public void removeMenuItem(int menuItemID){
        for(int i =0; i< menu.size(); i++){
            if(menu.get(i).getMenuID() == menuItemID){
                menu.remove(i);
                lastUpdated =  LocalDateTime.now();
                break;

            }
        }
    }
    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }
    public ArrayList<MenuItems> getMenu(){
        return menu;
    }
    //tells if a menu item is new.
    //print out both a single menu item
    //print out the entire menu
    //A way to determine whether or not two menu items are equal.

}