Feature: Tourist Atracttions

  Scenario: The user performs a search
  Given The user gets into the tourist atracttions
  When The user performs a search
  Then The user can see the city attractions and dates they select.

  Scenario: The user performs a search
    Given The user gets into the tourist atracttions
    When The user performs a search
    Then The user can see the button to sort by lower price

  Scenario: The user performs a search
    Given The user gets into the tourist atracttions
    When The user performs a search
    And The user sort by price
    Then The user can see the price from low to high