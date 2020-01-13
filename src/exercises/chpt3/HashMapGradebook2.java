package exercises.chpt3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapGradebook2 {
    public static void main(String[] args){
        HashMap<Double, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        Double newStudent;

        System.out.println("Enter the student's ID (or ENTER to finish):");

        //Get student names and grades
        do {
            System.out.println("Student's ID: ");
            newStudent = input.nextDouble();

            if (!newStudent.equals("")){
                System.out.println("Name of Student: ");
                String newName = input.nextLine();
                students.put(newStudent, newName);

                // read in the new line before looping back
                input.nextLine();
            }
        } while (!newStudent.equals(""));

        //Print class roster
        System.out.println("\nClass Roster");

        for (Map.Entry<Double, String> student: students.entrySet()) {
            System.out.println(student.getKey() + "(" + student.getValue() + ")");
        }
    }
}
