@B7KCLS-109
Feature: As a user, I should be able to change the password by clicking the Password tab under the My Account module

  Background:
    Given The user is logging in with valid credentials

  @B7KCLS-147
  Scenario: Verify that I can change the password as a user
    Given Hover over on Mein Konto
    Then Click on the Mein Konto Button
    Then Click on the Password Andern Button
    Then Enter old password
    Then Enter new password
    Then Enter new password again
    Then Click on the Password Andern Confirm Button
    And Verify that you can successfully change the password

  @B7KCLS-148
  Scenario: Verify that the password must be at least 6 characters, when I enter a new password as a user
    Given Hover over on Mein Konto
    Then Click on the Mein Konto Button
    Then Click on the Password Andern Button
    Then Enter old password
    Then Enter new password-five characters
    Then Enter new password again-five characters
    Then Click on the Password Andern Confirm Button
    And Verify the error message that the passport must be at least six characters

  @B7KCLS-149
  Scenario: Verify that the password must be no more than 20 characters, when I enter a new password as a user
    Given Hover over on Mein Konto
    Then Click on the Mein Konto Button
    Then Click on the Password Andern Button
    Then Enter old password
    Then Enter new password-twenty one characters
    Then Enter new password again-twenty one characters
    Then Click on the Password Andern Confirm Button
    And Verify the error message stating that the password must be no more than twenty characters

  @B7KCLS-150
  Scenario: Verify I get error message when I cannot verify the password
    Given Hover over on Mein Konto
    Then Click on the Mein Konto Button
    Then Click on the Password Andern Button
    Then Enter old password
    Then Enter new password-ten characters
    Then Enter new password again-twelve characters
    Then Click on the Password Andern Confirm Button
    And Verify that an error message should be received when the new password cannot be verified