@MonthlyFrequency
Feature: Monthly Frequency Calculation
  As the owner  of the company
  I want to how many lessons they attend
  In order to schedule properly 
 
  Background: User has app opened (frequency)
    Given User selects the student (f)
    Then I should see the student's "monthly frequency" (f)

  Scenario: Website displays a student's monthly frequency
    When I select a "Student" with name "Anna" and surname  "Sobozak" (f)
    Then I should see a  list of "months" (f)
    And I click on  "October" (f)
    And I should see  the customer's "monthly frequency" (f)
 
  Scenario Outline: Website  doesn't display a customer's frequency
    When I select a "Student"  with name "<name>" and surname "<surname>" (f)
    Then I should see a  list of "months" (f)
    And I click on  "<month>" (f)
    And I should see  "<warning>" message (f)
 Examples:
      | Name    | Surname   | Month   | Frequency | Warning                              |
      | Anna    | Sobozak   | October | 93%       |                                      |
      | Anna    | Sobozak   | July    |           | Customer did not attend during month |
      | Anna    |           | October |           |                                      |
      |         | Sobozak   | October |           |                                      |
      | Anna    | Sobozak   |         |           |                                      |
