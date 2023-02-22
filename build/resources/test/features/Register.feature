Feature: Register
  @Register
  Scenario: Successful Registration
    Given He is on the web page
    When he goes to register a user
    And he enters the user data, password and password verification
    And he agree the terms and conditions and he registers
    Then he validates that he is already on the home page