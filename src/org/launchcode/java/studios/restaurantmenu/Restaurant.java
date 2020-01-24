//package org.launchcode.java.studios.restaurantmenu;
//
//import java.awt.*;
//import java.util.Scanner;
//
//public class Restaurant {
//    private static Menu menu = new Menu();
//    private static int menuIdNumber = 1;
//
//    public static void main(String[] args) {
//        try (Scanner in = new Scanner(System.in)) {
//            int selection = 0;
//            do {
//                System.out.println();
//                System.out.println("Welcome to the restaurant!");
//                System.out.println("1) Print the menu");
//                System.out.println("2) Print single menu item");
//                System.out.println("3) Add a menu item");
//                System.out.println("4) Remove a menu item");
//                System.out.println("5) Exit");
//                System.out.println("Selection: ");
//
//                String userInput = in.nextLine();
//                selection = Integer.parseInt(userInput);
//
//
//                switch (selection) {
//                    case 1:
//                        System.out.println(menu.getLastUpdated());
//                        for (MenuItems menuItems : menu.getMenu()) {
//                            System.out.println(menuItems.toString());
//                        }
//                        System.out.println();
//                        break;
//                    case 2:
//                        System.out.println("Enter the menu ID you wish to print: ");
//                        String userInToPrint = in.nextLine();
//                        int menuIdToPrint = Integer.parseInt(userInToPrint);
//                        for (MenuItems menuItems : menu.getMenu()) {
//                            if (menuItems.getMenuID() == menuIdToPrint) {
//                                System.out.println(menuItems);
//                                break;
//                            }
//                        }
//                        break;
//                    case 3:
//                        System.out.print("Enter menu item description: ");
//                        String desc = in.nextLine();
//                        System.out.print("Enter menu item price: ");
//                        String priceStr = in.nextLine();
//                        System.out.print("Enter menu category: ");
//                        String category = in.nextLine();
//
//                        double price = Double.parseDouble(priceStr);
//                        menu.addMenuItem(
//                                new MenuItem(menuIdNumber++, desc, price, MenuCategory.valueOf(category.toUpperCase()), true));
//
//                        break;
//                    case 4:
//                        System.out.print("Please enter the menu item ID you wish to delete: ");
//                        String deleteItemId = in.nextLine();
//
//                        int menuIdToDelete = Integer.parseInt(deleteItemId);
//                        menu.removeMenuItem(menuIdToDelete);
//
//                        break;
//
//                }
//            } while (selection != 5);
//
//            System.out.println("Goodbye!");
//            System.exit(0);
//        } catch (Exception e) {
//            System.err.println("Nooooope!");
//            System.exit(1);
//        }
//    }
//}