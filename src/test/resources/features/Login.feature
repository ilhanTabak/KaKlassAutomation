Feature: User Login Functionality - I should be able to login with valid credential

  Scenario: Login with username and password (!! This Scenario is for common usage !!)
    Given The user is logging in with valid credentials

  @B7KCLS-115
  Scenario: As a user, I should verify that I can log in by entering the correct information
    Given The user click on the Mein Konto
    Then The user click on the Anmelden
    Then The user enter the correct E-mail und Password
    When The user click the Anmelden button after entering the correct E-Mail and Password
    Then The user should be successfully logged in
