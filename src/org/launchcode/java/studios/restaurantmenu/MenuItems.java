package org.launchcode.java.studios.restaurantmenu;

public class MenuItems {
    private final int menuID;
    private double price;
    private String description;
    private MenuCategory category; // change this to an enum class, will need to add this enum class.
    private boolean isNewItem;

    public MenuItems (int menuID, float price, String description, Enum category, int year, boolean isNewItem){
        this.menuID = menuID;
        this.price = price;
        this.description = description;
        this.category = (MenuCategory) category;
        this.isNewItem = isNewItem;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public MenuCategory getCategory() {
        return category;
    }
    public void setCategory(MenuCategory category) {
        this.category = category;
    }
    //return true if MenuItem is new and false if
    //tells if a menu item is new.
    public boolean isNewItem() {
        return isNewItem;
    }
    public void setNewItem(boolean newItem) {
        isNewItem = newItem;
    }
    public int getMenuID() {
        return menuID;
    }
}
