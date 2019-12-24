package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class GasMilage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles are you driving? : ");
        int miles = input.nextInt();
        System.out.println("How many gallons of gas were consumed?: ");
        int gallons = input.nextInt();
        int mpg = miles/gallons;
        System.out.println("Your mpg is: " + mpg);

    }
}
