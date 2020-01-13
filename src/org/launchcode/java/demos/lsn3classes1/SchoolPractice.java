package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        class Student {

            private String name;
            private int studentId;
            private int numberOfCredits = 0;
            private double gpa = 0.0;

            public Student(String name, int studentId,
                           int numberOfCredits, double gpa) {
                this.name = name;
                this.studentId = studentId;
                this.numberOfCredits = numberOfCredits;
                this.gpa = gpa;
            }

            public Student(String name, int studentId) {
                this(name, studentId, 0, 0);
            }


            public String getName() {
                return name;
            }
            public void setName(String aName) {
                name = aName;
            }
            public int getStudentId(){
                return studentId;
            }
            public void setStudentId( int aStudentId){
                studentId = aStudentId;
            }
            public int getNumberOfCredits(){
                return numberOfCredits;
            }
            public void setNumberOfCredits(int aNumberOfCredits){
                numberOfCredits = aNumberOfCredits;
            }
            public double getGpa(){
                return gpa;
            }
            public void setGpa(double aGpa){
                gpa = aGpa;
            }

            Student  myAbby = new Student("Abby", 1234, 1, 4.0);

        }

        class Course{
            private String courseName;
            private int courseNumberCode;
            private HashMap Students = new HashMap<>();

            public Course (String courseName, int courseNumberCode, String Student){
                this.courseName = courseName;
                this.courseNumberCode = courseNumberCode;
                this.Student = Student;
            }
        }
    }

    Student.display();
}

