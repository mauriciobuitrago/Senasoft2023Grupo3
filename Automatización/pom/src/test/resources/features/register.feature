Feature: Register

  Scenario: Register successful
  Given The user gets into the login page
  When The user enters the data
    | email                  | password      |
    | senasoft10@yopmail.com | Senasoft9876* |
  Then The user registers himself successfully

  Scenario: Invalid password
    Given The user gets into the login page
    When The user enters the incorrect data
      | email                | password |
      | senasoft12@yopmail.com | sena     |
    Then The user password is rejected

  Scenario: Existent user
    Given The user gets into the login page
    When The user enters the existent email
      | email                 | password      |
      | senasoft2@yopmail.com | Senasoft9876* |
    Then The user redirected to the login page