package readingnotes.chapt3_ControlFlow;

import java.util.Scanner;

public class chapt3Notes {
    public static void main(String[] args){

        System.out.println(" Chapter 3 Conditionals \n");
        /* if statements are written like this:
        if (condition) {
           statement1
           statement2
           ...
        }

        if else statement syntax
        if (condition) {
           statement1
           statement2
           ...
        } else {
           statement1
           statement2
           ...
        }
         */

        System.out.println("Chapt 3.1.3 - Elseif Statement");

        class ElseIf{
            public void elseIfStatement(String args[]){
                Scanner in = new Scanner(System.in);
                System.out.println("Enter a grade: ");
                int grade = in.nextInt();
                if (grade < 60){
                    System.out.println("F");
                } else if (grade < 70){
                    System.out.println("D");
                } else if (grade < 80){
                    System.out.println("C");
                } else if (grade < 90){
                    System.out.println("B");
                } else {
                    System.out.println("A");
                }


            }
        }





    }
}
