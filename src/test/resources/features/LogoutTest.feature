@Logout @Smoke
Feature: Logout
  As a user
  I want to log out of the application
  So that my session is securely ended

  Scenario: Validate successful logout
    Given user logs in with "standard_user" and "secret_sauce"
    When  user opens the hamburger menu
    And   user selects the logout option
    Then user should be redirected to the login page