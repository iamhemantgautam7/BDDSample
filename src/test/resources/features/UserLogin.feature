Feature: User Login Function
WebDriver driver;


#First Example:-
#Scenario: Valid Login
#Given User is on Login Page
#When  User enters "tomsmith" And "SuperSecretPassword!"
#Then Should display Success Msg


#Second Example :-
#Scenario Outline: Valid Login
#Given User is on Login Page
#When  User enters "<username>" And "<password>"
#Then Should display Success Msg

#Examples:

#|username|password|
#|tomsmith|SuperSecretPassword!|
#|testuser1|pass1|
#|testuser2|password2|

#Third Example:-
Scenario: Valid Login
Given User is on Login Page
When  User enters credentials 
										|tomsmith|SuperSecretPassword!|
Then Should display Success Msg

