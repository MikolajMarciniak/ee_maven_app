@MonthlyFrequency
Feature: Monthly Frequency Calculation
  As the owner  of the company
  I want to how many lessons they attend
  In order to schedule properly 
 
  Background: User has app opened
    Given User selects the student
    Then I should see the student's "monthly frequency"

  Scenario: Website displays a student's monthly frequency
    When I select a "Student" with name "Anna" and surname  "Sobozak"
    Then I should see a  list of "months"
    And I click on  "October"
    And I should see  the customer's "monthly frequency"
 
  Scenario Outline: Website  doesn't display a customer's frequency
    When I select a "Student"  with name "<name>" and surname "<surname>"
    Then I should see a  list of "months"
    And I click on  "<month>"
    And I should see  "<warning>" message
 Examples:
      | Name    | Surname   | Month   | Frequency | Warning                              |
      | Anna    | Sobozak   | October | 93%       |                                      |
      | Anna    | Sobozak   | July    |           | Customer did not attend during month |
      | Anna    |           | October |           |                                      |
      |         | Sobozak   | October |           |                                      |
      | Anna    | Sobozak   |         |           |                                      |
