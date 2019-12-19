@FindAllEvents
Feature: FindAllEventsMethod
  As the owner of the company
  I want to manage all events. 
 
  Background: User has app opened
    Given User presses the "find all Events" button
    Then I should see a list of all events

  Scenario: Website displays all events.
    When I press the "find all Events" button
    And I should see all "events" 
