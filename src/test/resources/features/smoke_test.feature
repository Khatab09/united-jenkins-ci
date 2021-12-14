Feature: Smoke test

  @jenkins
  Scenario: app load
    Given verify app load with booking window tabs

  Scenario: Available flights are displayed when user searches for round trip basic economy ticket
    Given click on round trip button
    Then fill up from and to text field
    And click on find flight button
    Then verify that flight is displayed

  Scenario: checks out one way flight ticket
  User checks out one way flight ticket for the date of Jan 15, 2022
    Given click on one way radio button
    Then fill up from and to text field
    And click on date text field and choose date
    And click on find flight button
    Then verify that one way flight ticket has been checked out

  Scenario:  checks out 3 round trip flight tickets
  User checks out 3 round trip flight tickets: 2 adults, 1 infant for the date of Feb 15, 2022
    Given click on round trip radio button
    Then fill up from and to text field
    And click on date text field and choose date above in this scenario
    And click on travelers text field
    And click on addition twice
    And click on find flight button
    Then verify that round trip flight has been checked out
