package com.example.midletest.Entity;

import java.util.Date;

public class Order {
    private int id;
    private String date;
    private String customer;
    private String status;

    public Order(int id, String date, String customer, String status) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
