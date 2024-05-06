Feature: User Login Function
WebDriver driver;

Scenario: Valid Login
Given User is on Login Page
When  User enter Credentials
Then Should display Success Msg
