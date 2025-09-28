Feature: Login functionality test

  Scenario: Validate login functionality using map data table
    Given user fills up the login form
    |username |standard_user|
    |password |secret_sauce|
    When user clicks on login button
    Then user should land on the product page


    Scenario Outline: Invalid login attempts
      When user logs in with username "<username>" and password "<password>"
      Then an error message should be displayed saying "<message>"

      Examples:
        | username         | password      | message                                                                  |
        | locked_out_user  | secret_sauce  | Epic sadface: Sorry, this user has been locked out.                      |
        | standard_user    | wrong_pass    | Epic sadface: Username and password do not match any user in this service|
        | wrong_user       | secret_sauce  | Epic sadface: Username and password do not match any user in this service|
