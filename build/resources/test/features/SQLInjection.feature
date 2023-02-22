Feature: SQLInjection
  @SQLInjection
  Scenario: Successful SQL Injection
    Given He is on the web page
    When He registers correctly and he validates that he is already on the home page
    And He goes to section five of the injection advanced section
    And He verifies that he is in the test login
    And He queries until he finds the key
    Then He verifies that he has successfully logged

