package com.example.midletest.Entity;

public class Appointment {
    private String name;
    private String dateTime;
    private String location;
    private String description;

    public Appointment(String name, String dateTime, String location, String description) {
        this.name = name;
        this.dateTime = dateTime;
        this.location = location;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

