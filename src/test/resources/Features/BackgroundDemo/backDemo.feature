Feature: Check HomePage Functinoality.

  Background: User is logged in
    Given User is on login page
    When user enters username and password
    And clicks on login button
    Then user is redirected to dashboard page.

  Scenario: Check Logout link
    When user clicks on user propfile
    Then logout option is displayed

  Scenario: Verify Admin Management page opens successfully.
    When user clicks on Admin link from sidebar
    Then Admin management page opens successfully.
