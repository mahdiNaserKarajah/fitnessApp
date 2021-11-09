package com.example.fitness.model;

import java.util.ArrayList;

public class Diet {
    private String day;
    private int NumberOfMeals;
    private ArrayList<String> details;

    public Diet(String day, int numberOfMeals, ArrayList<String> details) {
        this.day = day;
        NumberOfMeals = numberOfMeals;
        this.details = details;
    }

    public String getDay() {
        return "Day :"+day + " day";
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getNumberOfMeals() {
        return  NumberOfMeals;
    }

    public void setNumberOfMeals(int numberOfMeals) {
        NumberOfMeals = numberOfMeals;
    }

    public ArrayList<String> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<String> details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Diet{" +
                "day='" + day + '\'' +
                ", NumberOfMeals=" + NumberOfMeals +
                ", details=" + details.toString() +
                '}';
    }
}
