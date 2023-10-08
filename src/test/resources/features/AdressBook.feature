Feature: As a user, I should be able to update the address information by clicking the Address Book tab under the My Account module.

  Scenario: Login with username and password (!! This Scenario is for common usage !!)
    Given The user is logging in with valid credentials

  Scenario Outline:The user Verify that the user can update the address
    When Hover over the My Account tab
    Then Click to My Account Tab
    Then Click the Addresses icon
    Then Click the Add New Button
    Then The user enter valid new Address Book credential "<E-Mail>", "<Name>","<Last_Name>","<Country>","<Address>","<City>","<District>","<Phone>","<Zip_Code>","<Verify_Message>"
    And  The user should be see "<Verify_Message>",
    Examples:
      | E-Mail   | Name  | Last_Name | Country          | Address    | City          | District | Phone   | Zip_Code            | Verify_Message                           |
      | Gulnihal | Aydan | Koch      | Liboristraße 33a | Bredenborn | Marienmunster | 37696    | Germany | Nordrhein-Westfalen | Your address has been successfully added |


  Scenario Outline: The user verify that the error message is displayed when the user incorrectly fills in or does not fill in the required field.
    When Hover over the My Account tab
    Then Click to My Account Tab
    Then Click the Addresses icon
    Then Click to Edit icon
    Then The user enters invalid or empty Address Book credential "<E-Mail>", "<Name>","<Last_Name>","<Country>","<Address>","<City>","<District>","<Phone>","<Zip_Code>","<Verify_Message>"
    And The user can be see "<error_message>",
    Examples:
      | E-Mail   | Name  | Last_Name | Country          | Address    | City          | District | Phone   | Zip_Code            | error_message                           |
      | Gulnihal | Aydan | Koch      | Liboristraße 33a | Bredenborn | Marienmunster | 37696    | Germany | Nordrhein-Westfalen | Your address has been successfully added |