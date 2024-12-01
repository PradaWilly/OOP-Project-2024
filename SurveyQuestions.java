/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecotrackapp;

/**
 *
 * @author Ross
 */
public class SurveyQuestions {
 public String question1;
    public String question2;
    public String question3;

    // Constructor with default questions
    public SurveyQuestions() {
        this.question1 = "do you know which appliances use the most energy?";
        this.question2 = "Have you ever received advice or tips on saving energy? ";
        this.question3 = "If so, what were they";
    }

    // Getters
    public String getQuestion1() {
        return question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public String getQuestion3() {
        return question3;
    }

    // Setters
    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3;
    }
}