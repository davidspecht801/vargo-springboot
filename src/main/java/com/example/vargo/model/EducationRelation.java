package com.example.vargo.model;


public class EducationRelation {
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getEducationId() {
        return educationId;
    }

    public void setEducationId(int educationId) {
        this.educationId = educationId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    private int personId;
    private int educationId;

    private String personName;
    private String educationLevel;

    private RelationType relationType;

    public enum RelationType {
        CUSTOMER;
    }

    public EducationRelation(){

    }
    public EducationRelation(int personId, int educationId) {
        this.personId = personId;
        this.educationId = educationId;
    }
}
