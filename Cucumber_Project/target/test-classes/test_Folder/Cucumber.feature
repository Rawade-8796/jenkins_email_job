Feature: Login Functionality
Scenario: Login with valid credentials

Given User is at login screen
When User Enters usernme
And User Enter Password
And User click on login button
Then User should be logged in
