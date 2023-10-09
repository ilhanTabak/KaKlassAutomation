Feature: Wish List




  Scenario: The user can see products in the wish list
    Given The user is logging in with valid credentials
    Given The user on the all product page
    When The user select a products wish button
    Then The user see produkt in the wish list