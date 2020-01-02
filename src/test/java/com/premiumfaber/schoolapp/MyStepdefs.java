package com.premiumfaber.schoolapp;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.core.Is.is;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.premiumfaber.schoolapp.infrastructure.EventRepo;
import com.premiumfaber.schoolapp.model.Event;

import cucumber.api.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MyStepdefs {

    private static final Event EVENT_1 = new Event("01-01-2020", "New Year Eve Party");
    @Autowired
    EventRepo eventRepo;
    private List<Event> allEvents;

    //////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////MonthlyPayment/////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////
    @Given("^I am \"([^\"]*)\" and on the \"([^\"]*)\" page on URL \"([^\"]*)\"$")
    public void iAmAndOnThePageOnURL(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see the customer's \"([^\"]*)\"$")
    public void iShouldSeeTheCustomerS(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I select a \"([^\"]*)\" with name \"([^\"]*)\" and surname \"([^\"]*)\"$")
    public void iSelectAWithNameAndSurname(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see a list of \"([^\"]*)\"$")
    public void iShouldSeeAListOf(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I should see \"([^\"]*)\" message$")
    public void iShouldSeeMessage(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////MonthlyFrequency///////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////


    @Given("^User selects the student \\(f\\)$")
    public void userSelectsTheStudentF() {
    }

    @Then("^I should see the student's \"([^\"]*)\" \\(f\\)$")
    public void iShouldSeeTheStudentSF(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I select a \"([^\"]*)\" with name \"([^\"]*)\" and surname  \"([^\"]*)\" \\(f\\)$")
    public void iSelectAWithNameAndSurnameF(String arg0, String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see a  list of \"([^\"]*)\" \\(f\\)$")
    public void iShouldSeeAListOfF(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I click on  \"([^\"]*)\" \\(f\\)$")
    public void iClickOnF(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I should see  the customer's \"([^\"]*)\" \\(f\\)$")
    public void iShouldSeeTheCustomerSF(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @And("^I should see  \"([^\"]*)\" message \\(f\\)$")
    public void iShouldSeeMessageF(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////FindAllEvents//////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////

    @Given("^User presses the \"([^\"]*)\" button$")
    public void userPressesTheButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see a list of all events$")
    public void iShouldSeeAListOfAllEvents() {
    }

    @When("^I press the \"([^\"]*)\" button$")
    public void iPressTheButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I should see all \"([^\"]*)\"$")
    public void iShouldSeeAll(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////FindAllEventsByDate//////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////


    @Given("^User presses the \"([^\"]*)\" by date button$")
    public void userPressesTheByDateButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see a list of all past events$")
    public void iShouldSeeAListOfAllPastEvents() {
    }

    @When("^I fill \"([^\"]*)\" field$")
    public void iFillField(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I press the \"([^\"]*)\" by date button$")
    public void iPressTheByDateButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I should see all \"([^\"]*)\" in range filled$")
    public void iShouldSeeAllInRangeFilled(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////FindAllEventsFuture////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////

    @Given("^User presses the \"([^\"]*)\" future button$")
    public void userPressesTheFutureButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see a list of all future events$")
    public void iShouldSeeAListOfAllFutureEvents() {
    }

    @When("^I press the \"([^\"]*)\" future button$")
    public void iPressTheFutureButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I should see all \"([^\"]*)\" after current time$")
    public void iShouldSeeAllAfterCurrentTime(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////FindAllEventsPast//////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////

    @Given("^User presses the \"([^\"]*)\" past button$")
    public void userPressesThePastButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I should see a list of all \"([^\"]*)\"$")
    public void iShouldSeeAListOfAll(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^I press the \"([^\"]*)\" past button$")
    public void iPressThePastButton(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^I should see all \"([^\"]*)\" before current time$")
    public void iShouldSeeAllBeforeCurrentTime(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Given("User calls find all Events function")
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
}
