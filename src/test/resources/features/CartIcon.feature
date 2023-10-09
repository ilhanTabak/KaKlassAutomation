
@bayram
Feature: As a user, I should be able to manage the cart by clicking the cart icon

 Background: Login with username and password (!! This Scenario is for common usage !!)
    Given The user is logging in with valid credentials

  Scenario: As a user, I should be able to see the products added to the cart by clicking the cart icon
    Given  Click on Alle Produkt
    When  choose a product
    Then check card icon


