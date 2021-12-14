Feature: Flight regression test

  Scenario: round trip option should have departing and return date fields
    Given in flight part click on round trip radio button
    Then verify that round trip have departing and return date fields

  Scenario: Choosing one way flight option should only have
    Given click on on way radio button
    Then verify that one way radio button has only depart text field

  Scenario: User should be able to increment traveler count up to 9
    Given click on travelers text field
    Then verify that travelers has nine number

  Scenario: User can select one traveler from every single passenger type
    Given click on travelers text field
    Then verify that user can increment every passenger type

  Scenario:book flight switching arrows
  Leaving from and going to fields should switch when click on switch icon in the middle
    Given click on switch icon between from and to
    Then verify that from an to text field has ben switched

  Scenario:  remove leaving from location value
  User should be able to remove leaving from location value
    Given verify that user can remove leaving from value

  Scenario:  remove going to location value
    Given User should be able to remove going to location value


  Scenario:  select  Economy, Premium economy, Business or First
  User can select different flight classes such as Economy, Premium economy, Business or Firs
    Given verify user select class as economy
    And verify user select class as Premium economy
    Then verify user select class as  Business or First

  Scenario: Minimum one traveler should be selected
    Given in traveler text filed verify that one traveler has been selected


  Scenario: User can only travel with one pet
    Given click on traveler text field
   Then click on travel with pet
    Then click on select number of pet and verify that one pet

    Scenario: Advance search should open a separate page with more advanced search fields
      Given click on advance search
      Then verify that search open one page

    Scenario: Checking flexible dates option should change the Dates field to month dropdown only
      Given click on flexible dates
      Then verify that date has been changed