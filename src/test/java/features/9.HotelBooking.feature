Feature: Hotel Booking
  Scenario: Hotel Booking
    Given User is on PHP Travels page with hotels list
    When User Picks chosen Hotel by Picture or LinkText or DetailsButton
    Then Hotel Details displayed
    Then User Chose option of the available rooms
    And User picks room and clicks Book button