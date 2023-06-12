Feature: Book a Multileg, Non-Stop Flight with Hotel and Payment

  Scenario: Book a Multileg, Non-Stop Flight with Hotel and Payment
    Given Go To "https://airprojects.resvoyage.com/airtravel.htm?Idle=true&lang=en-us"
    When I select Multi Destinations
    And I enter "Tirana" in the From field for the first leg
    And I enter "Vienna" in the To field for the first leg
    And I select the departure date month "May" and day "20" for the first leg
    And I type Add Trip on the Plus button for the first leg
    And I enter "Vienna" in the From field for the second leg
    And I enter "Bangkok" in the To field for the second leg
    And I select the departure date month "May" and day "22" for the second leg
    And I type Add Trip on the Plus button for the second leg
    And I enter "Bangkok" in the From field for the third leg
    And I enter "Vienna" in the To field for the third leg
    And I select the departure date month "May" and day "27" for the third leg
    And I select "3" adults and "2" children
    And I select "Economy" cabin class
    And I go to Advanced Search
    And I select "Non-stop Flights" as flight type
    And I go to Preferred Airline 1
    And I enter "Austrian"
    And I click Search
    Then I should see the flight list of only Asutrian Airlines

    When I click on the Price of the first available flight
    And I click Book Now button
    And I enter "Sabina" as the first name of the first adult
    And I enter "Begaj" as the last name of the first adult
    And I enter "sabina.begaj@gmail.com" as Email address field
    And I enter "sabina.begaj@gmail.com" to Confirm Email field
    And I enter "+355686721219" at Phone Number field
    And I enter "Silvi" as the first name of the second adult
    And I enter "Cela" as the last name of the second adult
    And I enter "Adela" as the first name of the third adult
    And I enter "Haxhihyseni" as the last name of the third adult
    And I enter "Mia" as the first name of the first child
    And I enter "Begaj" as the last name of the first child
    And I enter date of birth for the first child
    And I enter "Richie" as the first name of the second child
    And I enter "Begaj" as the last name of the second child
    And I enter date of birth for the second child
    And I select Credit Card payment type and click Add a Hotel
    And I enter credit card information:
      | creditCardNumber  | holderName | expirationDate | cvcCode |
      | 5555341244441115 | Sabina Begaj  | 03/2025        | 737     |

    And I enter "United States of America" as Country
    And I enter "NY" as Billing Address
    And I enter "NY" as City
    And I enter "1001" as ZIP Code
    And I enter "737" as confirmation at Custom Field
    And I click Confirm
    Then I should see the Traveler Information page

    When I click I select a hotel with max price 3500$/night and a max of total 25000$
    And I confirm the booking when the Booking Reference is displayed
    Then I verify that the booking reference number and message are displayed
    And I verify that all the travelers' names are displayed correctly on the booking confirmation page


