
Feature: sanity test

  Scenario: all book flight should be displayed
    Given verify that flight tabs displayed
@test
  Scenario: change language
  user should be able to change language
    Given click on globe Language icon
    And click on select language text field
    And choose the language
    Then verify that language has been change successfully

  Scenario: Top header tabs should show correct panels when clicked
    Given in header click on book tab
    Then verify that book tabs are displayed
    And in header click on my trips tabs
    Then verify that my trips tabs is displayed
    And click on travel info
    Then verify that travel info is displayed
    And click on mealg plus program
    Then verify that mealg plus program is displayed
    And click deal link in header section
    Then verify that deal link has been displayed successfully
    And click on help link in header section
    Then verify that help link is displayed

    Scenario: Advisory top section should display info with links
    Given verify that advisory in top of home page is displayed

    Scenario: Footer links should not be broken
      Given in footer section verify that all links it's not broken
