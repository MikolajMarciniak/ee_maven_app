package com.premiumfaber.schoolapp.model;

public class Event {
    String date, eventName;
    public Event(String newDate, String newEventName){
        date=newDate;
        eventName=newEventName;
        //check if newDate is empty, IF so replace with current date
    }
}
