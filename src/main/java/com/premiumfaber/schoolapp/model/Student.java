package com.premiumfaber.schoolapp.model;

public class Student extends Person{
    String newType = PersonType.STUDENT.toString();
    public Student(String newName) {
        super(newName);
    }
}
