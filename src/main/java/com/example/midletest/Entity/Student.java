package com.example.midletest.Entity;

public class Student {
    private String name;
    private int id;
    private double avgPoint;
    private boolean status;

    public Student(String name, int id, double avgPoint, boolean status) {
        this.name = name;
        this.id = id;
        this.avgPoint = avgPoint;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAvgPoint() {
        return avgPoint;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
