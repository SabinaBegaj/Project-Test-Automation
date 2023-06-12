Feature: Book a Multileg, Non-Stop Flight with Hotel and Payment

  Scenario: Book a Multileg, Non-Stop Flight with Hotel and Payment
    Given I am on the Air Travel homepage
    When I select "Multileg" type and "Non stop" flights under "Advanced options"
    And I enter "Tirana" and "Vienna" and "Bangkok" and "Vienna" as the route "TIA-VIE-BKK-VIE"
    And I select "Non stop" flights and "Austrian" as the preferred airline
    Then I verify that "Austrian Airlines" is the carrier airline
    And I select 3 adults and 2 children for the travelers
    And I select "Economy" cabin class
    And I select a 7-day trip
    And I select "Any Economy" compartment on the prices
    And I enter personal information for all travelers including date of birth for children
    And I select "Credit card" payment type and click "Add a hotel"
    And I select a hotel with max price 3500$/night and a max of total 25000$
    And I enter credit card information:
      | creditCardNumber  | holderName | expirationDate | cvcCode |
      | 5555341244441115 | John Doe   | 03/2023        | 737     |
    And I confirm the booking
    Then I verify that the booking reference number and message are displayed
    And I verify that all the travelers' names are displayed correctly on the booking confirmation page


