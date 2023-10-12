@B7KCLS-112
Feature: User Log out Functionality - I should be able to log out

  Background:Login with username and password (!! This Scenario is for common usage !!)
    Given The user is logging in with valid credentials

  @B7KCLS-122
  Scenario:  As a user, Verify that the user has securely terminated the session
    Given Hover over  on My Account
    When Click on the Log out
    Then Verify that you are logged out

  @B7KCLS-123
  Scenario: As a user, Verify that there is no re-login with "Back to page" icon in browser
    Given Hover over  on My Account
    When Click on the Log out
    Then Click Back to page icon in browser
    Then Verify that you are logged out

