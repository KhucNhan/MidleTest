package com.example.midletest.Entity;

public class Book {
    private String title;
    private String author;
    private String type;
    private int releasedYear;

    public Book(String title, String author, String type, int releasedYear) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.releasedYear = releasedYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(int releasedYear) {
        this.releasedYear = releasedYear;
    }
}
