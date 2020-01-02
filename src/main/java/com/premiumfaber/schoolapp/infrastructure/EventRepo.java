package com.premiumfaber.schoolapp.infrastructure;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.premiumfaber.schoolapp.model.Event;

@Component
public class EventRepo {
    private List<Event> dataStore = new ArrayList<>();

    public EventRepo() {

    }

    public List<Event> findAllEvents(){
        return dataStore;
    }

    public List<Event> findAllEventsByDate(LocalDateTime start, LocalDateTime end){
        //TO DO: code to return a list of all events within range
        return null;
    }

    public Event save(Event event) {
        dataStore.add(event);
        return event;
    }

    public void clear() {
        dataStore.clear();
    }
}
