@FindAllEventsByDates
Feature: Find all events by dates
  As the owner of the company
  I want to manage all events in a range of time. 
 
  Background: User has app opened
    Given User presses the "find all events by dates" button
    Then I should see a list of all past events

  Scenario: Website displays all events.
    When I fill "time range" field
    And I press the "Find all events by dates" button
    And I should see all "events" in range filled
