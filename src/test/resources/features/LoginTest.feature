Feature: Login functionality test

  Scenario: Validate login functionality using map data table
    When user fills up the login form
    |username |standard_user|
    |password |secret_sauce|

    Then user clicks on sign in button
