Feature: Logout
  As a user
  I want to log out of the application
  So that my session is securely ended

  Scenario: Validate successful logout
    @Given user logs in with "<username>" and "<password>"
    @Then  user should land on the product page
    @When  user opens the hamburger menu
    @And   user selects the logout option
    @Then user should be redirected to the login page