Feature: Login User with incorrect username

Scenario: Login with Invalid Username

Given User should Launch Edge browser
When User should Navigate to url "https://practicetestautomation.com/practice-test-login/"
And User should Verify that login page is visible successfully
Then Enter username "incorrectUser" in Username field
And Enter password "Password123" in Password field
When Click "Submit" button
Then Verify that error message is displayed
And Verify that error message text is "Your username is invalid!"