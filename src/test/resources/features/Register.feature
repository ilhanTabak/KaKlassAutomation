Feature:Register Funktion

  Scenario: The user can make register with valid credentials
    Given The user on the register page
    When The user enter valid credential
    Then The user can make register

  @wip
  Scenario Outline: The user can not make register with invalid credentials
    Given The user on the register page
    When The user enter invalid  "<firstName>","<lastName>","<eMail>","<password>" credential
    Then The user can not make register
    Examples:
      | firstName | lastName | eMail             | password |
      |           | Stone    | abc1234@gmail.com | Test1234 |
      |   Jack    |          | abc1235@gmail.com | Test1234 |
      |   Jack    | Stone    | abc1236gmail.com  | Test1234 |







