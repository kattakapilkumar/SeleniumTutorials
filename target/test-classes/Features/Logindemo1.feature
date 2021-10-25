Feature: Test login functionality

Scenario Outline: check login is successful with valid credentials

Given brower is open
And user is on login page
When user enters <username> and <password>
Then user is navigated 

Examples:
|username||password|
|Raghav||12345|
|kapil||12345|