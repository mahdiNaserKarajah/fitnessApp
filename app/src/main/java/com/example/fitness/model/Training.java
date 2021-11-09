package com.example.fitness.model;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.example.fitness.TrainingActivity4;
import com.google.gson.Gson;

public class Training extends TrainingActivity4 {
    private int day;
    private int time;
    private String exercises;

    public Training(int day, int time, String exercises) {
        this.day = day;
        this.time = time;
        this.exercises = exercises;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getExercises() {
        return exercises;
    }

    public void setExercises(String exercises) {
        this.exercises = exercises;
    }

    @Override
    public String toString() {
        return "training{" +
                "Day : " + day +

                ", Time Of Training : " + time + " Minute"+
                ", Exercises : " + exercises + '\'' +
                '}';
    }






}
