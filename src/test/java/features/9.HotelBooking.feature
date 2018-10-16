Feature: Hotel Booking
  Scenario: Hotel Booking
    Given User is on PHP Travels page with hotels list
    When User Picks chosen Hotel by Picture/LinkText/DetailsButton
    Then Hotel Details displayed
    Then User picks one of the available rooms by modifying options
    And User clicks Book button