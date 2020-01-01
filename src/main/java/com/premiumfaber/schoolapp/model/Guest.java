package com.premiumfaber.schoolapp.model;

public class Guest extends Person{
    String type;
    String newType = PersonType.GUEST.toString();

    public Guest(String newName) {
        super(newName);
    }
}
