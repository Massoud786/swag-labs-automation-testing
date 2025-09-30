Feature: Checkout Process
  As a user
  I want to complete the checkout process
  So that I can successfully place an order

  Scenario: Validate checkout information page
    @Given user adds an item to the cart
    @When user opens the cart page
    @And user clicks on Checkout button
    @Then user should land on the checkout your information page
    @When user fills in the form with "<First Name>", "<Last Name>", and "<Postal Code>"
    @And user clicks on continue button
    @Then user should proceed to the checkout page

  Scenario: Validate product details and total cost
    @Given user adds an item to the cart
    @When  user completes checkout information with "<First Name>", "<Last Name>", and "<Postal Code>"
    @And   user continues to the checkout overview page
    @Then  user should see product name, price, and total cost including tax

  Scenario: Validate order completion
    @Given user adds an item to the cart
    @When  user completes checkout information with "<First Name>", "<Last Name>", and "<Postal Code>"
    @And   user continues to the checkout overview page
    @And   user clicks the Finish button
    @Then  user should see an order confirmation message
    @And   the cart should be empty