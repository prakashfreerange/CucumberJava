Feature: To test google search functionality.

  Scenario: Validate google search is working.
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And hits enter
    Then User is navigated to search result