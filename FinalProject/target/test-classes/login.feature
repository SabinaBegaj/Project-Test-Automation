Feature: Booking One Way
  Scenario: One Way Economy Flight
    Given Go To "https://airprojects.resvoyage.com/airtravel.htm?Idle=true&lang=en-us"
    And Enter data:
    | From | To |
    | HAM | MUN |
    When I select "One Way" option
    And I enter "Hamburg" in the "From" field
    And I enter "Munich" in the "To" field
    And I select "2" adults
    And I select "Economy" cabin
    And I select "Light economy" option on prices
    And I select a seat with the number "22A" or any available window seat
    And I select "Cash (Invoice)" payment option
    And I click the "Confirm Booking" button
    Then I should see the "booking reference number" and "Please, write down or remember this number" message
    And I save the booking reference number to a variable
    And I display the booking reference number on the console

