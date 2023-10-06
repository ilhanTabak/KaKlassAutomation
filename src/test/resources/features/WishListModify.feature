Feature: Wish list modifiy

  Background:
    Given The user is logging in with valid credentials


  Scenario: The user should be able to reach wish list on My wish list page
    Given The user on the all product page
    When The user select a products wish button
    Then The user see produkt in the wish list

  Scenario: Verify that the user should be able to add the products from wish list to cart
    Given The user on the all product page
    When The user select a products wish button
    Then The user see produkt in the wish list
