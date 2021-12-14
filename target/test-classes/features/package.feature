Feature: package regression test

  Scenario: User should see vacation search result with all fields filled properly
    Given click on package link
    And fill up package drop down form
    And click on find trip button
    Then verify that search result it's displayed

  Scenario: Vacation form should have only up to 4 rooms
    Given click on package link
    And fill up package drop down form
    And choose at least four room
    Then verify that four room has ben select


    Scenario: Rooms container should say “rooms” if room count is bigger than one
      Given click on package link
    And fill up package drop down form
      And choose more than one room
      Then verify that room text field contain rooms

    Scenario: Clicking cruise link should navigate to United Cruises page
      Given click on cruise link
      Then verify that link navigate to united cruises page
