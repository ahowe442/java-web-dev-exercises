package exercises;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your Triangle's height?: ");
        int triHeight = input.nextInt();
        System.out.println("What is your Triangle's length?: ");
        int triLength = input.nextInt();
        int area = (triHeight*triLength)/2;
        System.out.println("Your triangle has an area of: " + area);

    }
}
