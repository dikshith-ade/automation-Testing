Feature: Login User with incorrect password

Scenario: Login with Invalid Password

Given User should Launch Edge browser
When User should Navigate to url "https://practicetestautomation.com/practice-test-login/"
And User should Verify that login page is visible successfully
Then Enter username "student" in Username field
And Enter password "incorrectPassword" in Password field
When Click "Submit" button
Then Verify that error message is displayed
And Verify that error message text is "Your password is invalid!"