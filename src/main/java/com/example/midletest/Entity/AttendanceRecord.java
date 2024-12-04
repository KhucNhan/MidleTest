package com.example.midletest.Entity;

public class AttendanceRecord {
    private String employeeName;
    private String workDate;
    private int hoursWorked;
    private boolean status;

    public AttendanceRecord(String employeeName, String workDate, int hoursWorked, boolean status) {
        this.employeeName = employeeName;
        this.workDate = workDate;
        this.hoursWorked = hoursWorked;
        this.status = status;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}

