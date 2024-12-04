package com.example.midletest.Entity;

public class Tour {
    private String name;
    private String place;
    private String date;
    private boolean status;

    public Tour(String name, String place, String date, boolean status) {
        this.name = name;
        this.place = place;
        this.date = date;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
