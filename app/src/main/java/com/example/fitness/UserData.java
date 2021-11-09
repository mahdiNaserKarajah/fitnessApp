package com.example.fitness;

public class UserData {
    private String name;
    private int age;
    private int weight;
private int height;

    public UserData(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "name :'" + name + '\'' +
                ", age :" + age +
                ", weight :" + weight +
                ", height :" + height +
                '}';
    }
}
