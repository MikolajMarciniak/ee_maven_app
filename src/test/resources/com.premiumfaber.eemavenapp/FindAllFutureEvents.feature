@FindAllFutureEvents
Feature: find all future events method
  As the owner of the company
  I want to manage all future events. 
 
  Background: User has app opened
    Given User presses the "find all future events" button
    Then I should see a list of all future events

  Scenario: Website displays all events.
    When I press the "find all future events" button
    And I should see all "events" after current time
