package com.example.midletest.Entity;

public class Course {
    private String name;
    private String teacher;
    private int hours;
    private double price;

    public Course(String name, String teacher, int hours, double price) {
        this.name = name;
        this.teacher = teacher;
        this.hours = hours;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
