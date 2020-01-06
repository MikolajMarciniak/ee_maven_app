@FindAllEventsByDate
Feature: FindAllEventsByDateMethod
  As the owner of the company
  I want to filter events by date

  Background:
    Given User loads an app
    When User calls find all events function (with date parameters: start "2019-09-01 08:00:00" and end "2020-01-01 08:00:00")
    Then the user should see a list of all events between "2019-09-01 08:00:00" and "2020-01-01 08:00:00"

  Scenario: Past events can be retrieved by not specifying start date
    Given User loads an app
    And User creates and saves new event with date "20-12-2019 10:00:00" and name "Christmas party"
    When User calls find all events by date function (range between now and "2019-09-01 08:00:00" date)
    Then the user should see a list of all events between now and "2019-09-01 08:00:00" date;
    And  the user should see a the event with date "20-12-2019 10:00:00" and name "Christmas party"

  Scenario: Future events can be retrieved by not specifying end date
    Given User loads an app
    And User creates and saves new event with date "20-12-2019 10:00:00" and name "Christmas party"
    When User calls find all events by date function (range between now and "2020-01-01 08:00:00")
    Then the user should see a list of all events between now and "2020-01-01 08:00:00";
    And  the user should see a the event with date "20-12-2019 10:00:00" and name "Christmas party"