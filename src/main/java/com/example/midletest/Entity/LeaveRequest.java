package com.example.midletest.Entity;

public class LeaveRequest {
    private String employeeName;
    private String startDate;
    private String endDate;
    private boolean status;

    // Constructors
    public LeaveRequest(String employeeName, String startDate, String endDate, boolean status) {
        this.employeeName = employeeName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    // Getters and Setters
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

