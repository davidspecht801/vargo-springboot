package com.example.vargo.model;

public class Education {
    private int educationId;
    private String educationLevel;

    public int getEducationId() {
        return educationId;
    }

    public void setEducationId(int educationId) {
        this.educationId = educationId;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public Education(int educationId) {
        this.educationId = educationId;
    }
}
