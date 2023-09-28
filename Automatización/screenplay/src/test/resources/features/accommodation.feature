Feature: Accommodation

  Scenario Outline: Search hotel deals with params and filters
  Given The user gets into the accommodation page
  When The user changes the currency
    |example|example2|
    |<example>|<example2>|
  When The user enters destination name params
    And The user enters in and out date params
    And The user enters the person params
    And The user performs a search at accommodation page
  When The user filters by stars
    And The user filters by price
    And the user orders by price
  When The user enters in the hotel offers
  Then The user can the the apllied params
    And The user can see the applied filters

    Examples:
    |example|example2|
    |a      |a       |
