package com.premiumfaber.schoolapp.infrastructure;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.premiumfaber.schoolapp.model.Event;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Component
public class EventRepo {
    private List<Event> dataStore = new ArrayList<>();

    public EventRepo() { }


    public List<Event> findAllEvents(){
        return dataStore;
    }

    public List<Event> findAllEventsByDate(LocalDateTime start, LocalDateTime end){
        //List <Event> listClone = new ArrayList<>();
        //for (String string : dataStore) {
        //    if(string = start){
        //        listClone.add(string);
        //    }
        //}
        //return listClone;
        return null;
    }


    public Event save(Event event) {
        dataStore.add(event);
        return event;
    }

    public void clear() {
        dataStore.clear();
    }

    public void remove(Event event1) {
    }

    public void getList(){
        System.out.println(dataStore);
    }
}
