package steps;
import elements.CredentialsReturn;
import elements.Results;
import elements.SearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Driver;

import io.cucumber.java.en.When;
@CucumberOptions(glue = {"src/test/java/steps"})

public class StepsReturn2 {
    private final SearchPage credentialsReturn;
    private final Results results;
    private final Driver driver = Driver.getInstanceOfDriver();

    public StepsReturn2() {
        credentialsReturn = PageFactory.initElements(driver.getDriver(), CredentialsReturn.class);
        results = PageFactory.initElements(driver.getDriver(), Results.class);
    }
    @And("I enter {string} as the first name of the first adult")
    public void iEnterAsTheFirstNameOfTheFirstAdult(String fname1 ) {
        credentialsReturn.selectFirstPassengerFName(fname1);
    }

    @And("I enter {string} as the last name of the first adult")
    public void iEnterAsTheLastNameOfTheFirstAdult(String lname1) {
        credentialsReturn.selectFirstPassengerLName(lname1);

    }
    @And("I enter {string} as Email address field")
    public void iEnterAsEmailAddressField(String email1) {
        credentialsReturn.selectFirstPassengerEmail(email1);
    }

    @And("I enter {string} to Confirm Email field")
    public void iEnterToConfirmEmailField(String econfi) {
        credentialsReturn.selectFirstPassengerEmailConfirmation(econfi);
    }

    @And("I enter {string} at Phone Number field")
    public void iEnterAtPhoneNumberField(String arg0) {
    }
    credentialsReturn.selectPh

    @And("I enter {string} as the first name of the second adult")
    public void iEnterAsTheFirstNameOfTheSecondAdult(String arg0) {
    }
    credentialsReturn.

    @And("I enter {string} as the last name of the second adult")
    public void iEnterAsTheLastNameOfTheSecondAdult(String arg0) {
    }
    credentialsReturn.

    @And("I enter {string} as the first name of the infant")
    public void iEnterAsTheFirstNameOfTheInfant(String arg0) {
    }
    credentialsReturn.


    @And("I enter {string} as the last name of the infant")
    public void iEnterAsTheLastNameOfTheInfant(String arg0) {
    }
    credentialsReturn.


    @And("I enter date of birth for the infant")
    public void iEnterDateOfBirthForTheInfant() {
    }
    credentialsReturn.
    @And("I select Credit card as the payment type")
    public void iSelectCreditCardAsThePaymentType() {
    }
    credentialsReturn.
    @And("I enter {string} as the cardholder name")
    public void iEnterAsTheCardholderName(String arg0) {
    }
    credentialsReturn.
    @And("I enter {string} as Credit Card number")
    public void iEnterAsCreditCardNumber(String arg0) {
    }
    credentialsReturn.

    @And("I select {string} as the expiration month")
    public void iSelectAsTheExpirationMonth(String arg0) {
    }
    credentialsReturn.

    @And("I select {string} as the expiration year")
    public void iSelectAsTheExpirationYear(String arg0) {
    }
    @And("I enter {string} CVV number")
    public void iEnterCVVNumber(String arg0) {
        credentialsReturn.
    }

    @And("I enter {string} as Country")
    public void iEnterAsCountry(String cardCountry) {
        credentialsReturn.selectCardCountry(cardCountry);
    }


    @And("I enter {string} as Billing Address")
    public void iEnterAsBillingAddress(String bAddress) {
        credentialsReturn.selectBillingAddress (bAddress);
    }


    @And("I enter {string} as City")
    public void iEnterAsCity(String arg0) {
    }
    credentialsReturn.

    @And("I enter {string} as ZIP Code")
    public void iEnterAsZIPCode(String arg0) {
    }
    credentialsReturn.

    @And("I enter {string} as confirmation at Custom Field")
    public void iEnterAsConfirmationAtCustomField(String arg0) {
    }
    credentialsReturn.

    @And("I click Continue")
    public void iClickContinue() {
    }



}

