Feature: Cars form should have following fields: Pickup location, Drop off location, Pickup time, Drop offtime,
  return car to same location, primary driver is 25 or older, book with miles, find cars

  Scenario: Car has drop down field is displayed
    Given click on car tab
    Then verify that all drop down is displayed


  Scenario: Drop off location should disappear if return car to same location checkbox is checked
    Given click on drop off location radio button
    Then verify that drop off location it disappeared

    Scenario: Age field should disappear if primary driver is 25 or older checkbox is checked
      Given click on car tab
      And click on Primary driver is 25 or older check box
      Then verify that age field disappeared

    Scenario: Finding a car after filling up the form should navigate to a separate tab
      Given click on car tab
      And fill up the car drop down form
      And click on find car button
      Then verify that navigate to a separate tab

    Scenario: Finding a car with book with miles checked should return result with miles only
    Then fill up the car drop down form
    And click on book with mile check box
    And click on find car button
    Then verify that result with only mile

    Scenario: Searching for a rental car with an age of 21 should not return any search result
      Given Given click on car tab
      And fill up the car drop down form with age less than 21
      Then verify that no search result

