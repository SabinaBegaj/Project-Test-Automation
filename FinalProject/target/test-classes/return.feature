Feature: Booking a Return Flight with Car Rental

  Scenario: Book a Return Flight with Car Rental and Credit Card Payment

    Given I go and access airline booking main page "https://airprojects.resvoyage.com/airtravel.htm?Idle=true&lang=en-us"
    When I select Round Trip
    And I enter "Frankfurt" in the From field
    And I enter "Budapest" in the To field
    And I select the departure date month "May" and day "20"
    And I select the return date month "June" and day "2"
    And I select "2" adults and "1" infant
    And I select "Business" cabin class
    And I click Search
    Then I should see search results for the chosen route and dates

#    When I click "Continue" for the first available flight
#    And I select "Light business" for the outbound flight
#    And I select "Light business" for the return flight
#    And I select seat "22A" if available, or any available window seat
#    And I click "Continue"
#    Then I should see the "Traveler Information" page
#
#    When I enter "John" as the first name of the first adult traveler
#    And I enter "Doe" as the last name of the first adult traveler
#    And I enter "Jane" as the first name of the second adult traveler
#    And I enter "Doe" as the last name of the second adult traveler
#    And I enter "Baby" as the first name of the infant traveler
#    And I enter "Doe" as the last name of the infant traveler
#    And I click "Continue"
#    Then I should see the "Add Car Rental" page
#
#    When I enter "Budapest" as the pickup location
#    And I select the first available pickup date as the "Pickup date"
#    And I select the last available return date as the "Return date"
#    And I click "Add Car"
#    Then I should see the car rental details in the "Add Car Rental" page
#
#    When I select "Credit card" as the payment type
#    And I click "Add a Car" in the payment section
#    And I enter "John Doe" as the cardholder name
#    And I enter a valid credit card number
#    And I select the current month as the expiration month
#    And I select the next year as the expiration year
#    And I enter a valid CVV number
#    And I click "Continue"
#    Then I should see the "Confirmation" page
#
#    When I verify that the "booking reference number" is displayed
#    And I verify that the "Please, write down or remember this number" message is displayed
#    Then I should see the booking number on the console
#
#    And I should see "John Doe" and "Jane Doe" and "Baby Doe" as the travelers' names on the booking successful page
