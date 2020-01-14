package org.launchcode.java.studios.restaurantmenu;

import java.time.LocalDateTime;

public class MenuItems {
    private float price;
    private String description;
    private String category; // change this to an enum class, will need to add this class.
    private int year; // change this to date time now

    public MenuItems (float price, String description, String category, int year){
        this.price = price;
        this.description = description;
        this.category = category;
        this.year = year;
    }

    public float getPrice(){
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
    public String getCategory(){
        return description;
    }
    public void setCategory(String category){
        this.category = category;
    }


    // This part needs to be corrected or removed and added to a method that adds a new menuItem
    // and stamps the  year at the same time.
//    if (this.year >= 2019){
//        System.out.println("New Menu Item");
//    }
}
