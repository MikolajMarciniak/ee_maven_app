package com.premiumfaber.schoolapp.model;

public class Person {
    String name, type;
    enum PersonType {
        PERSON,
        STUDENT,
        TEACHER,
        CLIENT,
        GUEST
    }
    String newType = PersonType.PERSON.toString();

    public Person (String newName){
    name = newName;
    type = newType;
    }

    public String GetName(){
        return name;
    }
    public String GetType(){ return type;}
}
