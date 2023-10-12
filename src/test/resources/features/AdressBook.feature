
Feature: As a user, I should be able to update the address information by clicking the Address Book tab under the My Account module.

  Background: Login with username and password (!! This Scenario is for common usage !!)
    Given The user is logging in with valid credentials

  Scenario Outline:The user Verify that the user can update the address
    Given Hover over  on My Account
    Then Click to My Account Tab
    And Click the Addresses icon
    Then Click the Add New Button
    Then The user enter valid new Address Book credential "<EMail>", "<Name>","<LastName>","<Adress>","<Phone>","<ZipCode>",
    And  The user should be see "<Verify_Message>",
    Examples:
      | EMail              | Name  | LastName | Adress     | Phone    | ZipCode | Verify_Message |
      | Gulnihal@gmail.com | Aydan | Koch     | Bredenborn | 16012345 | 376     | Aydan Koch     |
