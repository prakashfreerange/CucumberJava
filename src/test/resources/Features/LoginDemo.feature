Feature: Test login functionality

  Scenario: Verify login successful with valid credentials
    Given Broweser is open
    And user is on login page
    When User enter login details
    Then User navigated to home page
