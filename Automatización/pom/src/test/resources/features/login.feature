Feature: Login

  Scenario: Login successful
  Given The user gets into the login page
  When The user enters the credentials
    | email                | password     |
    | senasoft@yopmail.com | Senasoft123. |
  Then The user logs in successfully and can view his account