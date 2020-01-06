@FindAllEvents
Feature: FindAllEventsMethod
  As the owner of the company
  I want to manage all events
 
  Background:
    Given User loads an app
    When User calls find all events function
    Then the user should see a list of all events

  Scenario: After adding new event it can be retrieved.
    Given User loads an app
    And User creates and saves new event with date "30-11-2020 10:00:00" and name "Halloween"
    When User calls find all events function
    Then the user should see a list of all events
    And  the user should see a the event with date "30-11-2020 10:00:00" and name "Halloween"

  Scenario: After removing an event it can no longer be retrieved.
    Given User loads an app
    And User removes an existing event with date "30-11-2020 10:00:00" and name "Halloween"
    When User calls find all events function
    Then the user should see a list of all events
    And  the user should not see the event with date "30-11-2020 10:00:00" and name "Halloween"
