Feature: Register

  Scenario: Register successful
  Given The user gets into the login page
  When The user enters the data
  Then The user registers himself successfully

  Scenario: Invalid password
    Given The user gets into the login page
    When The user enters the incorrect data
    Then The user password is rejected

  Scenario: Existent user
    Given The user gets into the login page
    When The user enters the existent email
    Then The user redirected to the login page