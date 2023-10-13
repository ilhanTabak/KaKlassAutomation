@smoke
@B7KCLS-107
Feature: As a user I should be able to search in the search engine

  Background:
    Given The user is logging in with valid credentials

  @B7KCLS-136
  Scenario Outline: Verify that the product is listed, when I search for a product on the website
    Given Click on the search icon
    When Enter the "<Product Name>" in the search bar
    Then Click on the search button
    Then Verify that the searched Product Name is displayed in the search result
    Examples:
      | Product Name |
      | Jogger Hose  |
      | Anzug        |
      | Hemd         |
      | Sakko        |

  @B7KCLS-137
  Scenario Outline: Verify "product not found" message when searching for a product that does not exist
    Given Click on the search icon
    When Enter the "<Product Name>" in the search bar
    Then Click on the search button
    Then Verify that the message 'product not found' is displayed
    Examples:
      | Product Name |
      | Poloshirts   |
      | Sportschuhe  |
      | Krawatte     |
      | Hut          |


