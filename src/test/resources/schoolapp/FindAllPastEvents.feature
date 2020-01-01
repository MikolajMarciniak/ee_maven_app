@FindAllPastEvents
Feature: FindAllPastEventsMethod
  As the owner of the company
  I want to manage all past events. 
 
  Background: User has app opened
    Given User presses the "find all events" past button
    Then I should see a list of all "past events"

  Scenario: Website displays all events.
    When I press the "find all events" past button
    And I should see all "events" before current time
