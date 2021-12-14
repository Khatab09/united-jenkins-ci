
  Feature: flight status regression
    Scenario: User searches flight status between from and to destinations
      Given click on flight status link
      And fill iup the flight status drop down
      And click on search button
      Then verify that search flight status take you to destinations

        Scenario: Flight number field should not accept other than numbers
        Given click on flight status link
        And   And fill iup the flight status drop down other than numbers
        And click on search button
        Then verify that flight number field should not accept other than numbers



