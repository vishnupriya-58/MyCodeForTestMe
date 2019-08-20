Feature: My validation on Mercury Tours

  Scenario: My login on Mercury Tours
   Given User has launched
   Then User enters the valid credentials
   And User clicks on submit button
   Then User verifies the login status
   
  Scenario: Guest User Registration in Mercury Tours
   Given User launched the app
   Then user clicks on sign up link
   When user enters valid data in the form 
   And user clicks on submit button available
   Then user verifies the registration status