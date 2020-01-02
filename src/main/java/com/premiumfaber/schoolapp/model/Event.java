package com.premiumfaber.schoolapp.model;

public class Event {
    private String date, eventName;

    public Event(String newDate, String newEventName){
        date=newDate;
        eventName=newEventName;
        //check if newDate is empty, IF so replace with current date
    }

    public String getDate() {
        return date;
    }

    public String getEventName() {
        return eventName;
    }
}
