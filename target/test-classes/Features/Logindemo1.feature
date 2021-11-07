Feature: Test login functionality

Scenario Outline: check login is successful with valid credentials

Given brower is open
And user is on login page
When user enters <username> and <password>
Then user is navigated 

Examples:
|username||password|
|kapil||12345|
|raghav||12345|