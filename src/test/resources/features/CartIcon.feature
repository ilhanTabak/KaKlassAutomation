Feature: As a user, I should be able to manage the cart by clicking the cart icon

  Scenario: Login with username and password (!! This Scenario is for common usage !!)
    Given The user is logging in with valid credentials

  Scenario: As a user, I should be able to see the products added to the cart by clicking the cart icon
    Given  Click on Alle Produkt
    When  choose a product
    Then add to card
    Then check card icon

  Scenario: As a user, I should be able to access the cart from the view cart button
    When Click Cart Tab
    And Click go to Cart
    When Check the cart page
  Scenario: As a user, I should be able to go to the Checkout page from the cart icon and complete the checkout
    When Click Cart Tab
    And Click go to Cart
    Then Click the read icon
    Then Click to Checkout
