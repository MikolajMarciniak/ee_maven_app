package com.premiumfaber.schoolapp.model;

public class Teacher extends Person{
    String newType = PersonType.TEACHER.toString();
    public Teacher(String newName) {
        super(newName);
    }
}
