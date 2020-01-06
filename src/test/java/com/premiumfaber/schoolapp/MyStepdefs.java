package com.premiumfaber.schoolapp;

import com.premiumfaber.schoolapp.infrastructure.EventRepo;
import com.premiumfaber.schoolapp.model.Event;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.format.datetime.joda.LocalDateTimeParser;

import java.time.LocalDateTime;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MyStepdefs {

    private static final Event EVENT_1 = new Event("30-11-2020 10:00:00", "Halloween");
    private static final Event EVENT_2 = new Event("20-12-2019 10:00:00", "Christmas party");
    private static final Event EVENT_3 = new Event("31-12-2019 22:00:00", "New Year's eve");
    private static final Event EVENT_4 = new Event("30-08-2019 12:00:00", "Opening event");
    @Autowired
    EventRepo eventRepo;
    private List<Event> allEvents, allEventsByDate;


    //////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////FindAllEvents//////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////

    @Given("User calls find all events function")
    public void userCallsFindAllEventsButton() {
        allEvents = eventRepo.findAllEvents();
    }

    @Then("the user should see a list of all events")
    public void theUserShouldSeeAListOfAllEvents() {
        assertThat(allEvents, notNullValue());
        assertThat(allEvents, hasSize(greaterThan(0)));
        assertThat(allEvents, hasItem(EVENT_1));
    }

    @Given("User loads an app")
    public void userLoadsAnApp() {
        eventRepo.clear();
        eventRepo.save(EVENT_1);
    }

    @And("User creates and saves new event with date {string} and name {string}")
    public void userCreatesAndSavesNewEvent(String eventDate, String eventName) {
        Event event =  new Event(eventDate, eventName);
        eventRepo.save(event);
    }

    @And("the user should see a the event with date {string} and name {string}")
    public void theUserShouldSeeATheEvent(String eventDate, String eventName) {
        assertThat(allEvents.stream().anyMatch(event -> event.getDate().equals(eventDate) && event.getEventName().equals(eventName)), is(true));
    }

    @And("User removes an existing event with date {string} and name {string}")
    public void userRemovesAnExistingEventWithDateAndName(String eventDate, String eventName) {
        Event EVENT_2 = new Event(eventDate, eventName);
        eventRepo.remove(EVENT_2);
    }

    @And("the user should not see the event with date {string} and name {string}")
    public void theUserShouldNotSeeTheEventWithDateAndName(String eventDate, String eventName) {
        assertThat(allEvents.stream().anyMatch(event -> event.getDate().equals(eventDate) && event.getEventName().equals(eventName)), is(false));
    }



    //////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////FindAllEventsByDate////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////

    @When("User calls find all events function \\(with date parameters: start {string} and end {string})")
    public void userCallsFindAllEventsFunctionWithDateParametersStartAndEnd(String startDateTime, String endDateTime) {
        LocalDateTime end = LocalDateTime.parse(endDateTime);
        LocalDateTime start = LocalDateTime.parse(startDateTime);
        allEventsByDate = eventRepo.findAllEventsByDate(start, end);
    }

    @Then("the user should see a list of all events between {string} and {string}")
    public void theUserShouldSeeAListOfAllEventsBetweenAnd(String startDateTime, String endDateTime) {
        assertThat(allEventsByDate, notNullValue());
        assertThat(allEventsByDate, hasSize(greaterThan(0)));
        assertThat(allEventsByDate, hasItem(EVENT_2));
    }


    @When("User calls find all events by date function \\(range between now and {string} date)")
    public void userCallsFindAllEventsByDateFunctionRangeBetweenNowAndDate(String startDateTime) {
        LocalDateTime end = LocalDateTime.now();
        LocalDateTime start = LocalDateTime.parse(startDateTime);
        allEventsByDate = eventRepo.findAllEventsByDate(start, end);
    }

    @Then("the user should see a list of all events between now and {string} date;")
    public void theUserShouldSeeAListOfAllEventsBetweenNowAndDate(String startDateTime) {
        assertThat(allEventsByDate, notNullValue());
        assertThat(allEventsByDate, hasSize(greaterThan(0)));
        assertThat(allEventsByDate, hasItem(EVENT_2));
    }

    @When("User calls find all events by date function \\(range between now and {string})")
    public void userCallsFindAllEventsByDateFunctionRangeBetweenNowAnd(String endDateTime) {
        LocalDateTime start = LocalDateTime.now();
        LocalDateTime end = LocalDateTime.parse(endDateTime);
        allEventsByDate = eventRepo.findAllEventsByDate(start, end);
    }

    @Then("the user should see a list of all events between now and {string};")
    public void theUserShouldSeeAListOfAllEventsBetweenNowAnd(String endDateTime) {
        assertThat(allEventsByDate, notNullValue());
        assertThat(allEventsByDate, hasSize(greaterThan(0)));
        assertThat(allEventsByDate, hasItem(EVENT_2));
    }
}