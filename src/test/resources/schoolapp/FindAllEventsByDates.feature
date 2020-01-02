@FindAllEventsByDates
Feature: Find all events by dates
  As the owner of the company
  I want to manage all events in a range of time. 
 
  Background: User has app opened
    Given User presses the "find all events" by date button
    Then I should see all "events" in range filled

  Scenario: Website displays all events.
    When I fill "time range" field
    And I press the "find all events" by date button
    And I should see all "events" in range filled
