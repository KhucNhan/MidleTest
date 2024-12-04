package com.example.midletest.Entity;

public class Document {
    private String name;
    private String subject;
    private String lecturer;
    private String format;

    public Document(String name, String subject, String lecturer, String format) {
        this.name = name;
        this.subject = subject;
        this.lecturer = lecturer;
        this.format = format;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}

