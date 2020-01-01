package com.premiumfaber.schoolapp.model;

public class Client extends Person{
    String type = PersonType.CLIENT.toString();

    public Client(String newName) {
        super(newName);
    }
}
