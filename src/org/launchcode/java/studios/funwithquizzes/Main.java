package org.launchcode.java.studios.funwithquizzes;


public class Main {
    public static void main(String[] args) {
        //Question q1 = new Question("What is your name?");
        MultipleChoice q1 = new MultipleChoice("What's your name", "Abby",
                3, new String[]{"Abby", "Kellie", "Ella"});

        System.out.println(q1.getCorrectAnswer());
        System.out.println(q1.getAnswerChoices()[1]);


    }
}
