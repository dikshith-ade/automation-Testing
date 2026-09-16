Feature: Login functionality

  Scenario: Successful login

    Given User is on login page
    When User enters valid username and password
    Then User should be logged in successfully