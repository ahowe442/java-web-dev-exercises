package org.launchcode.java.studios.funwithquizzes;

public class TrueFalse extends Question{

    public TrueFalse(String question, String correctAnswer, int numOfAnswerChoices, String[] answerChoices) {
        super(question, correctAnswer, 2, new String[]{"True", "False"});
    }
}
