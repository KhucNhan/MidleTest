package com.example.midletest.Entity;

public class BankAccount {
    private int number;
    private String name;
    private double balance;
    private boolean status;

    public BankAccount(int number, String name, double balance, boolean status) {
        this.number = number;
        this.name = name;
        this.balance = balance;
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
