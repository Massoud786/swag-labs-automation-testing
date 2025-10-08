@Checkout @Regression
Feature: Checkout Process
  As a user
  I want to complete the checkout process
  So that I can successfully place an order

  Background:

    Given user enters login credentials
      | username     | standard_user |
      | password     | secret_sauce  |
    When user clicks on the login button
    Then user should land on the product page

    Rule: User must add at least one item to the cart before checkout

   @Smoke @Positive
  Scenario Outline: Validate checkout information page
    When user opens the cart page
    And user clicks on Checkout button
    Then user should land on the checkout your information page
    When user fills in the form with "<First_Name>", "<Last_Name>", and "<Postal_Code>"
    And user clicks the continue button
    Then user should proceed to the checkout page

    Examples:
      | First_Name | Last_Name | Postal_Code|
      | Mohammad   | Homayoun  | 96123      |

   @Regression @Negative @Validation
   Scenario Outline: Required field validation on checkout: Your information
    When user clicks on cart icon
    And user clicks on checkout button
    Then user should be taken to the checkout your information page
    When user completes checkout information with "<First_Name>", "<Last_Name>", and "<Postal_Code>"
    And user clicks the continue btn
    Then an error message should appear saying "<Error_Message>"

    Examples:
      |First_Name|Last_Name|Postal_Code|Error_Message|
      |          |         |           |Error: First Name is required|
      |Matthew   |         |94120      |Error: Last Name is required |
      |          |Matthew  |98754      |Error: First Name is required|
      |Greg      |Kozel    |           |Error: Postal Code is required|

  @Regression @Smoke
  Scenario: Validate product details and total cost
    Given  user places an item to the cart
    When   user lands to the cart page
    And    user continues to the checkout page
    When   user provides checkout information with "Raymond", "Greg", and "10290"
    And    user clicks on continue
    Then   user should see productName "Sauce Labs Backpack", productPrice "Item total: $29.99", productTax "Tax: $2.40", and productPrice "Total: $32.39"


  @Regression @EndToEnd @Positive
  Scenario: Validate order completion
    Given user puts an item to the cart
    When user is taken to the cart page
    And  user navigates to checkout page
    When user fills in the checkout information with "Raymond", "Greg", and "92123"
    And  user continues to the checkout overview page
    When user clicks the Finish button
    Then user should see an order confirmation "THANK YOU FOR YOUR ORDER"