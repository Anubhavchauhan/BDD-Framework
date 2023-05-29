Feature: feature to test login functinality

@smoketest
  Scenario: Check login is successful with valid credential
   
    Given user is on login page
    When user enters <username> and <password>
    When  clicks on login button
    When verify user is on homapage
    Then user is navigated to the home

 Examples:
  | username | password |
  | resting| 123456@#Ab |
 