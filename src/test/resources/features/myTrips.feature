Feature: My tips


  Scenario: There should be a link to find United Travel Credits page
    Given click on my tips
    Then verify that find travel link is present

    Scenario: Empty My Trips form should show error messages when searched without filling up
      Given click on my tips
      And click on my trip search button
      Then error messages it's appear

    Scenario: There should be a link to find my trips sign in page
    Given click on my tips
    Then verify that sign in button is displayed