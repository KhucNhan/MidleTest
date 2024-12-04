package com.example.midletest.Entity;

public class CartItem {
    private String name;
    private int stock;
    private double price;
    private double total;

    public CartItem(String name, int stock, double price, double total) {
        this.name = name;
        this.stock = stock;
        this.price = price;
        this.total = total;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
