@PaymentCalculation
Feature: Monthly payment calculation
  As the owner of the company
  I want to how much my clients have to pay me
  In order to inform them appropriately 
 
  Background: User navigates to Company management page
    Given I am "logged in" and on the "Company management" page on URL "www.extra-english.pl/management"
    Then I should see the customer's "monthly payment amount"

  Scenario: Website displays a customer's payment amount
    When I select a "Customer" with name "Anna" and surname "Sobozak"
    Then I should see a list of "months"
    And I click on "October"
    And I should see the customer's "monthly payment amount" 
 
  Scenario Outline: Website doesn't display a customer's payment amount
    When I select a "Customer" with name "<name>" and surname "<surname>"
    Then I should see a list of "months"
    And I click on "<month>"
    And I should see "<warning>" message 
 Examples:
      | Name    | Surname   | Month   | Amount    | Warning                              |
      | Anna    | Sobozak   | October | 235.00 zł |                                      |
      | Anna    | Sobozak   | July    |           | Customer did not attend during month |
      | Anna    |           | October |           |                                      |
      |         | Sobozak   | October |           |                                      |
      | Anna    | Sobozak   |         |           |                                      |
