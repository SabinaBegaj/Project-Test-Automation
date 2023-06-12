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
    And I go to Advanced Search
    And I select "Non-stop Flights" as flight type
    And I click Search
    Then I should see search results for the chosen route and dates

    When I click Continue for the first available flight
    And I select Light business for the Outbound flight
    And I select "Light business" for the Return flight
    And I click Continue
   Then I should see the Traveler Information page

    When I enter "Sabina" as the first name of the first adult
    And I enter "Begaj" as the last name of the first adult
    And I enter "sabina.begaj@gmail.com" as Email address field
    And I enter "sabina.begaj@gmail.com" to Confirm Email field
    And I enter "+355686721219" at Phone Number field
    And I enter "Silvi" as the first name of the second adult
    And I enter "Cela" as the last name of the second adult
    And I enter "Mia" as the first name of the infant
    And I enter "Begaj" as the last name of the infant
    And I enter date of birth for the infant
    And I select Credit card as the payment type
    And I click Add a Car in the payment section
    And I enter "Budapest" as the pickup location
    And I select the first available pickup date as the Pickup date
    And I select the last available return date as the Return date
    And I enter "John Doe" as the cardholder name
    And I enter "5555341244441115" as Credit Card number
    And I select "March" as the expiration month
    And I select "2025" as the expiration year
    And I enter "737" CVV number
    And I enter "United States of America" as Country
    And I enter "NY" as Billing Address
    And I enter "NY" as City
    And I enter "1001" as ZIP Code
    And I enter "737" as confirmation at Custom Field
    And I click Continue
    And I verify that “Please, write down or remember this number” pops up
    Then I should see the Booking Confirmation page with all traveler's names

