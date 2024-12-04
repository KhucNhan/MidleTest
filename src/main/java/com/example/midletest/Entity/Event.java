package com.example.midletest.Entity;

public class Event {
    private String name;
    private String dateTime;
    private String place;
    private int numberOfPeople;

    public Event(String name, String dateTime, String place, int numberOfPeople) {
        this.name = name;
        this.dateTime = dateTime;
        this.place = place;
        this.numberOfPeople = numberOfPeople;
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

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
}
