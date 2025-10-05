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

    Rule: Add item
      Background:
        user puts an item to the cart

  @checkout
  Scenario: Validate checkout information page
    When user opens the cart page
    And user clicks on Checkout button
    Then user should land on the checkout your information page
    When user fills in the form with "<First Name>", "<Last Name>", and "<Postal Code>"
    And user clicks on continue button
    Then user should proceed to the checkout page

  Scenario: Validate product details and total cost
    When  user completes checkout information with "<First Name>", "<Last Name>", and "<Postal Code>"
    And   user continues to the checkout overview page
    Then  user should see product name, price, and total cost including tax

  Scenario: Validate order completion
    When  user completes checkout information with "<First Name>", "<Last Name>", and "<Postal Code>"
    And   user continues to the checkout overview page
    And   user clicks the Finish button
    Then  user should see an order confirmation message