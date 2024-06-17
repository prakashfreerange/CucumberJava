Feature: Feature to test login functinoality.

  Scenario Outline: Chcek login is successful with valid login details.
    Given browser is open now.
    And user is on login page now.
    When enters <username> and <password>
    And clicks on login button now.
    Then user is navigated to the home page now

    Examples: 
      | username | password   |
      | Admin    | admin123   |

