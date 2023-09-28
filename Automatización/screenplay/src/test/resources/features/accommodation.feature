Feature: Accommodation

  Scenario:  Min person params values
  Given The user gets into the accommodation page
    When The user changes the currency
      | currency | destination         | inDate             | outDate        | adults | kids | rooms | stars | minPrice |
      | USD      | Cartagena de Indias | 29 septiembre 2023 | 3 octubre 2023 | 3      | 2    | 3     | 3,4,5 | 200      |
    When The user just deploys person Params
      | currency | destination         | inDate             | outDate        | adults | kids | rooms | stars | minPrice |
      | USD      | Cartagena de Indias | 29 septiembre 2023 | 3 octubre 2023 | 3      | 2    | 3     | 3,4,5 | 200      |
    Then The user can see that the person minimun params buttons are disabled
    | currency | destination         | inDate             | outDate        | adults | kids | rooms | stars | minPrice |
    | USD      | Cartagena de Indias | 29 septiembre 2023 | 3 octubre 2023 | 3      | 2    | 3     | 3,4,5 | 200      |

  Scenario:  Max person params values
  Given The user gets into the accommodation page
    When The user changes the currency
      | currency | destination         | inDate             | outDate        | adults | kids | rooms | stars | minPrice |
      | USD      | Cartagena de Indias | 29 septiembre 2023 | 3 octubre 2023 | 3      | 2    | 3     | 3,4,5 | 200      |
    When The user enters max params
    | currency | destination         | inDate             | outDate        | adults | kids | rooms | stars | minPrice |
    | USD      | Cartagena de Indias | 29 septiembre 2023 | 3 octubre 2023 | 3      | 2    | 3     | 3,4,5 | 200      |
    Then The user can see that the person params buttons are disabled
      | currency | destination         | inDate             | outDate        | adults | kids | rooms | stars | minPrice |
      | USD      | Cartagena de Indias | 29 septiembre 2023 | 3 octubre 2023 | 3      | 2    | 3     | 3,4,5 | 200      |

  Scenario: Search hotel deals with params and filters
  Given The user gets into the accommodation page
  When The user changes the currency
    | currency | destination         | inDate             | outDate        | adults | kids | rooms | stars | minPrice |
    | USD      | Cartagena de Indias | 29 septiembre 2023 | 3 octubre 2023 | 3      | 2    | 3     | 3,4,5 | 200      |
  When The user performs a search at accommodation page
  Then The user can see the destion required popup
    | currency | destination         | inDate             | outDate        | adults | kids | rooms | stars | minPrice |
    | USD      | Cartagena de Indias | 29 septiembre 2023 | 3 octubre 2023 | 3      | 2    | 3     | 3,4,5 | 200      |



  Scenario: Search hotel deals with params and filters
    Given The user gets into the accommodation page
    When The user changes the currency
      | currency | destination         | inDate             | outDate        | adults | kids | rooms | stars | minPrice |
      | USD      | Cartagena de Indias | 29 septiembre 2023 | 3 octubre 2023 | 3      | 2    | 3     | 3,4,5 | 200      |
    When The user enters the person params
      | currency | destination         | inDate             | outDate        | adults | kids | rooms | stars | minPrice |
      | USD      | Cartagena de Indias | 29 septiembre 2023 | 3 octubre 2023 | 3      | 2    | 3     | 3,4,5 | 200      |
    Then The user can see a age select for each kid
      | currency | destination         | inDate             | outDate        | adults | kids | rooms | stars | minPrice |
      | USD      | Cartagena de Indias | 29 septiembre 2023 | 3 octubre 2023 | 3      | 2    | 3     | 3,4,5 | 200      |


  Scenario Outline: Search hotel deals with params and filters
    Given The user gets into the accommodation page
    When The user changes the currency
      | currency | destination         | inDate             | outDate        | adults | kids | rooms | stars | minPrice |
      | USD      | Cartagena de Indias | 29 septiembre 2023 | 3 octubre 2023 | 3      | 2    | 3     | 3,4,5 | 200      |
    When The user enters destination name params
      | destination   |
      | <destination> |
    And The user enters in and out date params
      | inDate   | outDate   |
      | <inDate> | <outDate> |
    And The user enters the person params
      | adults   | kids   | rooms   |
      | <adults> | <kids> | <rooms> |
    And The user performs a search at accommodation page
    When The user filters by stars
      | stars   |
      | <stars> |
    And The user filters by price
      | minPrice   |
      | <minPrice> |
    And the user orders by price
    When The user enters in the hotel offers
    Then The user can the the apllied params
      | adults   | kids     |
      | <adults> | <adults> |
    And The user can see the applied filters

    Examples:
      | currency | destination         | inDate             | outDate        | adults | kids | rooms | stars | minPrice |
      | USD      | Cartagena de Indias | 29 septiembre 2023 | 3 octubre 2023 | 3      | 2    | 3     | 3,4,5 | 200      |
