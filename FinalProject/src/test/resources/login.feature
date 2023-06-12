Feature: Booking One Way
  Scenario: One Way Economy Flight
    Given Go To "https://airprojects.resvoyage.com/airtravel.htm?Idle=true&lang=en-us"
    And Enter data:
    | From | To |
    | HAM | MUN |
    When I select One Way option
    And I enter "Hamburg" in the From field
    And I enter "Munich" in the To field
    And I select the departure date month "June" and day "5"
    And I select "2" adults
    And I select "Economy" cabin
    And I click Search
    Then List of flights should be displayed for the chosen route and date

    When I click on the price of the first available flight
    And I select Light Economy for the Outbound flight and Book Now button
    And I enter "Sabina" as first adult traveler name
    And I enter "Begaj" as first adult traveler last name
    And I enter "sabina.begaj@gmail.com" as Email address field
    And I enter "sabina.begaj@gmail.com" to Confirm Email field
    And I enter "+355686721219" at Phone Number field
    And I enter "Silvi" as second adult traveler name
    And I enter "Cela" as second adult traveler last name
    And I select seat "22A" if available, or any available window seat
    And I choose Cash as form of payment
    And I click Continue
    And I verify that “Please, write down or remember this number” pops up
    Then I should see the PNR as final booking phase


