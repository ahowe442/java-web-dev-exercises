package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius:");
        int radius = input.nextInt();
        while(radius <= 0) {
            ;System.out.println("Enter a positive number radius:");
            radius = input.nextInt();
        }
        double area = Circle.getArea((double) radius);
        System.out.println("The area of a circle of radius "+ radius + " is: "+ area);

    }
}

//&& radius === null
// struggled to figure out the special characters.
