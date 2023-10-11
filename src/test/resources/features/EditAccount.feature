@smoke
Feature: As a user, I should be able to update the user information by clicking the Edit Account tab under the My Account module

  Scenario: Login with username and password (!! This Scenario is for common usage !!)
    Given The user is logging in with valid credentials

  Scenario Outline:Verify that the user can update their account information
    Given  Hover over the My Account tab
    When  Click to My Account Tab
    Then The user enter valid Customer Information credential "<Name>", "<Last_Name>","<E_Mail>","<Phone>"
    Then Click to Save Button
    Then Verify that Customer Information

    Examples:
      | Name     | Last_Name | E_Mail | Phone            |
      | Gulnihal | Aydan     | Koch   | Liboristraße 33a |

  Scenario Outline: The user verify that the error message is displayed when the user incorrectly fills in or does not fill in the required field.
    Given  Hover over the My Account tab
    When  Click to My Account Tab
    Then The user enter valid Customer Information credential "<Name>", "<Last_Name>","<E_Mail>","<Phone>","<VerifyMessage>"
    Then Click to Save Button
    Then Verify that Customer Information

    Examples:
      | Name     | Last_Name | E_Mail | Phone            |VerifyMessage|
      | Gulnihal | Aydan     | Koch   | Liboristraße 33a |             |
      | Gulnihal | Aydan     | Koch   | Liboristraße 33a |             |
      | Gulnihal | Aydan     | Koch   | Liboristraße 33a |             |
      | Gulnihal | Aydan     | Koch   | Liboristraße 33a |             |
      | Gulnihal | Aydan     | Koch   | Liboristraße 33a |             |
      | Gulnihal | Aydan     | Koch   | Liboristraße 33a |             |
