Feature: Login functionality

  @login
  Scenario: Validate successful login
    Given user enters login credentials
    |username |standard_user|
    |password |secret_sauce|
    When user clicks on the login button
    Then user should land on the product page

   @login
    Scenario Outline: Validate invalid login attempts
      When user logs in with username "<username>" and password "<password>"
      Then an error message should be displayed saying "<message>"

      Examples:
        | username         | password      | message                                                                  |
        | locked_out_user  | secret_sauce  | Epic sadface: Sorry, this user has been locked out.                      |
        | standard_user    | wrong_pass    | Epic sadface: Username and password do not match any user in this service|
        | wrong_user       | secret_sauce  | Epic sadface: Username and password do not match any user in this service|
