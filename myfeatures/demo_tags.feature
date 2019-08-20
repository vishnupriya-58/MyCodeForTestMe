Feature: Understanding of tags
@Smoke, @Sanity
  Scenario: Login validation on Flipkart
    Given Launch the Flipkart App
    And Enter credentials
    Then click on login
@Regression
  Scenario: User access to items in the portal
    Given User searching the product with code
    Then user able to add it to cart
@Smoke
  Scenario: User access to remove from cart
    Given user able to see the items count on cart
    Then User decides to remove an  item
@Sanity
  Scenario: user wanted to track the order
    Given User has active order
    Then User verifies the status of the order
   