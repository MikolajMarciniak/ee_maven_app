package com.premiumfaber.schoolapp;

import com.premiumfaber.schoolapp.model.Guest;
import com.premiumfaber.schoolapp.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolApp {

    public static void main(String[] args) {
        SpringApplication.run(SchoolApp.class, args);
        Person miko=new Person("Mikołaj");
        Guest marc=new Guest("Marcel");
    }

}
