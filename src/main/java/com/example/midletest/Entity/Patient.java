package com.example.midletest.Entity;

import java.time.LocalDate;

public class Patient {
    private String name;
    private int age;
    private String diagnosis;
    private LocalDate admissionDate;
    private String treatmentStatus;

    public Patient(String name, int age, String diagnosis, LocalDate admissionDate, String treatmentStatus) {
        this.name = name;
        this.age = age;
        this.diagnosis = diagnosis;
        this.admissionDate = admissionDate;
        this.treatmentStatus = treatmentStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public LocalDate getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getTreatmentStatus() {
        return treatmentStatus;
    }

    public void setTreatmentStatus(String treatmentStatus) {
        this.treatmentStatus = treatmentStatus;
    }
}

