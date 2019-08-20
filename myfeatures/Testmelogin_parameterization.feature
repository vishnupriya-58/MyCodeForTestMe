Feature: Validation on TestMeApp

  Background: Testmeapp is launched
    Given TestMe App is launched
    Then User clicks on SignIn link

  Scenario Outline: Login validation for multiple users
    When User enters valid username "<username>"
    And user enters valid password "<password>"
    And clicks on login button
    Then verify the login status
    And clicks on signout

    Examples: 
      | username | password    |
      | irfan123 |      123456 |
      | lalitha  | password123 |
      
