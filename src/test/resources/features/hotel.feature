
  Feature: Hotel regression test

    Scenario: Panel should have following fields: Going to, check-in, check-out, number of rooms, number of travelers
      Given click on hotel link
      Then verify that all field are their

     Scenario: One room and 1 travelers should be selected by default
       Given click on hotel link
       Then verify that one room and one traveler they selected by defult

     Scenario: User can select maximum 8 adult and 8 children travelers, 16 in total
       Given click on number of travelers text field
       Then verify that eight adult and eight children has been selected

      Scenario: User should be able to maximum 8 rooms
        Given click on hotel link
        And click on number of room text filed
        Then verify that uer have maximum 8 rooms

        Scenario: Number of travelers field should disappear when number of rooms is more than one
          Given choose more than one room in number of room text field
          Then verify that number of travelers field it disappeared


      Scenario: User should see result when finding for a hotel with all the form fields filled properly
        Given click on hotel link
        And fill up hotel drop down form
        And click on find hotel button
        Then verify that all hotels result are displayed











