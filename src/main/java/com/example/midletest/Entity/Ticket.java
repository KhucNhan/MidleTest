package com.example.midletest.Entity;

public class Ticket {
    private int id;
    private String name;
    private String slot;
    private double price;

    public Ticket(int id, String name, String slot, double price) {
        this.id = id;
        this.name = name;
        this.slot = slot;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
