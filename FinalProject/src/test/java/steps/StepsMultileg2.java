package steps;

import elements.CredentialsMultileg;
import elements.Results;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Driver;

@CucumberOptions(glue = {"src/test/java/steps"})

public class StepsMultileg2 {
    StepsMultileg2() {
        credentialsMultileg = PageFactory.initElements(driver.getDriver(), CredentialsMultileg.class);

        results = PageFactory.initElements(driver.getDriver(), Results.class);
    }


    private final CredentialsMultileg credentialsMultileg;
    private final Results results;
    private final Driver driver = Driver.getInstanceOfDriver();


    @When("I click on the Price of the first available flight")
    public void iClickOnThePriceOfTheFirstAvailableFlight() {
    }

    @And("I click Book Now button")
    public void iClickBookNowButton() {
    }

    @And("I enter {string} as the first name of the first adult")
    public void iEnterAsTheFirstNameOfTheFirstAdult(String fname1) {
        credentialsMultileg.selectFirstPassengerFName(fname1);
    }

    @And("I enter {string} as the last name of the first adult")
    public void iEnterAsTheLastNameOfTheFirstAdult(String lname1) {
        credentialsMultileg.selectFirstPassengerFName(lname1);
    }
    @And("I enter {string} as Email address field")
    public void iEnterAsEmailAddressField(String email1) {
        credentialsMultileg.selectFirstPassengerEmail(email1);
    }

    @And("I enter {string} to Confirm Email field")
    public void iEnterToConfirmEmailField(String econfi) {
        credentialsMultileg.selectFirstPassengerEmailConfirmation(econfi);
    }

    @And("I enter {string} at Phone Number field")
    public void iEnterAtPhoneNumberField(String phNumber) {
        credentialsMultileg.selectPhoneNumber(phNumber);
    }


    @And("I enter {string} as the first name of the second adult")
    public void iEnterAsTheFirstNameOfTheSecondAdult(String fname2) {
        credentialsMultileg.selectSecondPassengerFName(fname2);

    }

    @And("I enter {string} as the last name of the second adult")
    public void iEnterAsTheLastNameOfTheSecondAdult(String lname2) {
        credentialsMultileg.selectSecondPassengerFName(lname2);
    }

    @And("I enter {string} as the first name of the third adult")
    public void iEnterAsTheFirstNameOfTheThirdAdult(String fname3) {
        credentialsMultileg.selectThirdPassengerFName(fname3);
    }

    @And("I enter {string} as the last name of the third adult")
    public void iEnterAsTheLastNameOfTheThirdAdult(String lname3) {
        credentialsMultileg.selectThirdPassengerLName(lname3);
    }

    @And("I enter {string} as the first name of the first child")
    public void iEnterAsTheFirstNameOfTheFirstChild(String chFName1) {
        credentialsMultileg.selectChildFName1(chFName1);
    }

    @And("I enter {string} as the last name of the first child")
    public void iEnterAsTheLastNameOfTheFirstChild(String chLName1) {
        credentialsMultileg.selectChildLName1(chLName1);
    }

    @And("I enter date of birth for the first child")
    public void iEnterDateOfBirthForTheFirstChild() {
    }

    @And("I enter {string} as the first name of the second child")
    public void iEnterAsTheFirstNameOfTheSecondChild(String chFName2) {
        credentialsMultileg.selectChildFName2(chFName2);
    }

    @And("I enter {string} as the last name of the second child")
    public void iEnterAsTheLastNameOfTheSecondChild(String chLName2) {
        credentialsMultileg.selectChildLName2(chLName2);
    }

    @And("I enter date of birth for the second child")
    public void iEnterDateOfBirthForTheSecondChild() {
        throws InterruptedException {
            credentialsMultileg.selectReturnDate(month, Integer.parseInt(day));
    }


    @And("I select Credit Card payment type and click {string}")
    public void iSelectCreditCardPaymentTypeAndClick(String creditCard) {
        credentialsMultileg.selectPaymentSelection (creditCard);
    }

    @And("I enter credit card information:")
    public void iEnterCreditCardInformation() {
        credentialsMultileg.
    }

    @And("I enter {string} as Country")
    public void iEnterAsCountry(String cardCountry) {
        credentialsMultileg.selectCardCountry(cardCountry);
    }

    @And("I enter {string} as Billing Address")
    public void iEnterAsBillingAddress(String bAddress) {
        credentialsMultileg.selectBillingAddress (bAddress);
    }

    @And("I enter {string} as City")
    public void iEnterAsCity(String cCity) {
        credentialsMultileg.selectCardCity (cCity);
    }

    @And("I enter {string} as ZIP Code")
    public void iEnterAsZIPCode(String zip) {
        credentialsMultileg.selectZipCode (zip);
    }

    @And("I enter {string} as confirmation at Custom Field")
    public void iEnterAsConfirmationAtCustomField(String cCVV) {
        credentialsMultileg.selectConfirmCVV (cCVV);

    }

    @And("I click Confirm")
    public void iClickConfirm() {
        credentialsMultileg.clickCreateBooking();
    }

    @Then("I should see the Traveler Information page")
    public void iShouldSeeTheTravelerInformationPage() throws InterruptedException {
            Thread.sleep(20000);
            Assert.assertTrue(results.showBookingData().size() > 0);
    }
}
