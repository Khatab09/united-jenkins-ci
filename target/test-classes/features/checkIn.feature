Feature: Check in


  Scenario: Empty flight check-in form should show error messages when searched without filling up
    Given click on check in link
    And  click on check in search button
    Then verify that error message is appeared

    Scenario: There should be a check-in details link and navigates to correct page
     Given click on check in link
      Then verify that link navigate to correct page

    Scenario: There should be a check-in with MilesPlus link and navigates to correct page
      Given click on check in link
      And click on check in with your mile
      Then verify that link take you to next page
