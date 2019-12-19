package com.premiumfaber.eemavenapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EeMavenAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EeMavenAppApplication.class, args);
    }

    public class Event {
        int Date;
        public Event(int date) {
            date = Date;
        }
    }

    public class Lesson {
        int Date;
        public Lesson(int date) {
            date = Date;
        }
    }

    public class TeacherRepository {
        int Date;
        public TeacherRepository(int date) {
            date = Date;
        }
    }

    public class EventRepository {
        int Date;
        public EventRepository(int date) {
            date = Date;
        }
    }

    public class Contract {
        int Date;
        public Contract(int date) {
            date = Date;
        }
    }

    public class Person {
        public Person() {
        }
    }
}
