
@wip
Feature: Wish List

  Background: Given The user is logging in with valid credentials


  Scenario: The user can see products in the wish list
    Given The user on the all product page
    When The user select a products wish button
    Then The user see produkt in the wish list