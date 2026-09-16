Feature: Register User

  Scenario: Register a new user successfully

    Given User launches the browser
    And User navigates to "http://automationexercise.com"
    And User verifies that the home page is visible successfully
    When User clicks on "Signup / Login" button
    Then User verifies that "New User Signup!" is visible
    When User enters name and email address
    And User clicks on "Signup" button
    Then User verifies that "ENTER ACCOUNT INFORMATION" is visible
    When User fills the account information with title, name, email, password and date of birth
    And User selects "Sign up for our newsletter!" checkbox
    And User selects "Receive special offers from our partners!" checkbox
    And User fills address information with first name, last name, company, address, country, state, city, zipcode and mobile number
    And User clicks on "Create Account" button
    Then User verifies that "ACCOUNT CREATED!" is visible
    When User clicks on "Continue" button
    Then User verifies that "Logged in as username" is visible
    When User clicks on "Delete Account" button
    Then User verifies that "ACCOUNT DELETED!" is visible
    And User clicks on "Continue" button