    @ilhan
    @B7KCLS-111
    Feature: Sub Category Control

    @B7KCLS-132
  Scenario:
    Given The user is logging in with valid credentials
    When The user navigate the Sub-Category Page Login
    Then The user can see SubCategorys product
    @B7KCLS-133
  Scenario:
    Given The user on the main page
    When The user navigate the Sub-Category Page without Login
    Then The user can see the SubCategorys product



