Feature: As a user, I should be able to update the address information by clicking the Address Book tab under the My Account module.

  Background: Login with username and password (!! This Scenario is for common usage !!)
    Given The user is logging in with valid credentials
  @B7KCLS-143
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
  @B7KCLS-144
  Scenario Outline:The user Verify that the user can add the new address
    Given Hover over  on My Account
    Then Click to My Account Tab
    And Click the Addresses icon
    Then Click the Add New Button
    Then The user enter valid new Address Book credential "<EMail>", "<Name>","<LastName>","<Adress>","<Phone>","<ZipCode>",
    And  The user should be see "<Verify_Message>",
    Examples:
      | EMail           | Name   | LastName | Adress     | Phone    | ZipCode | Verify_Message |
      | KKlas@gmail.com | KKlass | Classik  | Dusseldorf | 26012345 | 350     | KKlass Classik |
  @B7KCLS-145
  Scenario Outline:Verify that the error message is displayed when the user incorrectly fills in or does not fill in the required field
    Given Hover over  on My Account
    Then Click to My Account Tab
    And Click the Addresses icon
    Then Click the Add New Button
    Then The user enter valid new Address Book credential "<EMail>", "<Name>","<LastName>","<Adress>","<Phone>","<ZipCode>",
    And  The user should be displayed "<Error_Message>",
    Examples:
      | EMail           | Name | LastName | Adress     | Phone    | ZipCode | Error_Message           |
      | KKlas@gmail.com |      | Classik  | Dusseldorf | 26012345 | 350     | Name ist obligatorisch! |