package com.premiumfaber.eemavenapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.premiumfaber.eemavenapp.Teacher;
import com.premiumfaber.eemavenapp.TeacherRepo;
import com.premiumfaber.eemavenapp.Guest;
import com.premiumfaber.eemavenapp.Client;
import com.premiumfaber.eemavenapp.Student;
import com.premiumfaber.eemavenapp.Event;
import com.premiumfaber.eemavenapp.EventRepo;
import com.premiumfaber.eemavenapp.Lesson;
import com.premiumfaber.eemavenapp.Contract;

@SpringBootApplication
public class EeMavenAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EeMavenAppApplication.class, args);

    }

}
