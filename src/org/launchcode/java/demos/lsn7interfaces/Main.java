package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        Comparator comparator = new FlavorComparator();
        Comparator comparator1 = new ConeComparator();



        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.
        for (Flavor item : flavors) {
            System.out.println(item);
        }
        System.out.println("*******************************");
        System.out.println("\n*******************************");
        flavors.sort(new FlavorComparator());
        for (Flavor item : flavors) {
            System.out.println(item);
        }

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.
        System.out.println("*******************************");
        System.out.println("\n*******************************");
        for (Cone itemPrice : cones) {
            System.out.println(itemPrice);
        }
        System.out.println("*******************************");
        System.out.println("\n*******************************");
        cones.sort(new ConeComparator());
        for (Cone cost : cones) {
            System.out.println(cost);
        }
        System.out.println("*******************************");
        System.out.println("\n*******************************");

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
