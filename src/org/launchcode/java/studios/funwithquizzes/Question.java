package org.launchcode.java.studios.funwithquizzes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class Question {
    private String question;
    private String correctAnswer;
    private int numOfAnswerChoices;
    private String[] answerChoices;

    public Question(String question, String correctAnswer, int numOfAnswerChoices, String[] answerChoices) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.numOfAnswerChoices = numOfAnswerChoices;
        this.answerChoices = answerChoices;
    }

    public String getQuestion() {
        return question;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getNumOfAnswerChoices() {
        return numOfAnswerChoices;
    }

    public void setNumOfAnswerChoices(int numOfAnswerChoices) {
        this.numOfAnswerChoices = numOfAnswerChoices;
    }

    public String[] getAnswerChoices() {
        return answerChoices;
    }

    public void setAnswerChoices(String[] answerChoices) {
        this.answerChoices = answerChoices;
    }
}

