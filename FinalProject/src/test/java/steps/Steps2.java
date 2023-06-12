package steps;

import elements.OneWay;
import elements.Results;
import elements.CredentialsOneWay;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

@CucumberOptions(glue = {"src/test/java/steps"})
public class Steps2 {
    private final CredentialsOneWay credentialsOneWay;
    private final Results results;
    private final Driver driver = Driver.getInstanceOfDriver();

    public Steps2() {

        credentialsOneWay = PageFactory.initElements(driver.getDriver(), CredentialsOneWay.class);

        results = PageFactory.initElements(driver.getDriver(), Results.class);
    }



    @When("I click on the price of the first available flight")
    public void iClickOnThePriceOfTheFirstAvailableFlight() {
        credentialsOneWay.selectPriceTab();
    }

    @And("I select Light Economy for the Outbound flight and Book Now button")
    public void iSelectLightEconomyForTheOutboundFlightAndBookNowButton() {
        credentialsOneWay.selectBusinessFare();
        credentialsOneWay.selectBookNow();

    }

    @And("I enter {string} as first adult traveler name")
    public void iEnterAsFirstAdultTravelerName(String fname1) throws InterruptedException {
        credentialsOneWay.selectFirstPassengerFName(fname1);

    }

    @And("I enter {string} as first adult traveler last name")
    public void iEnterAsFirstAdultTravelerLastName(String lname1) throws InterruptedException {
        credentialsOneWay.selectFirstPassengerLName(lname1);
    }

    @And("I enter {string} as Email address field")
    public void iEnterAsEmailAddressField(String email1) throws InterruptedException {
        credentialsOneWay.selectFirstPassengerEmail(email1);

    }

    @And("I enter {string} to Confirm Email field")
    public void iEnterToConfirmEmailField(String econfi) throws InterruptedException {
        credentialsOneWay.selectFirstPassengerEmailConfirmation(econfi);
    }

    @And("I enter {string} at Phone Number field")
    public void iEnterAtPhoneNumberField(String phNumber) throws InterruptedException {
credentialsOneWay.selectPhoneNumber(phNumber);
    }

    @And("I enter {string} as second adult traveler name")
    public void iEnterAsSecondAdultTravelerName(String fname2) throws InterruptedException {
        credentialsOneWay.selectSecondPassengerFName(fname2);
    }

    @And("I enter {string} as second adult traveler last name")
    public void iEnterAsSecondAdultTravelerLastName(String lname2) throws InterruptedException {
        credentialsOneWay.seleSecondPassengerLName(lname2);
    }


    @And("I select seat {string} if available, or any available window seat")
    public void iSelectSeatIfAvailableOrAnyAvailableWindowSeat(String seat) throws InterruptedException {
    credentialsOneWay.selectSeatSelection (seat);
    }


    @And("I choose Cash as form of payment")
    public void iChooseCashAsFormOfPayment() {
        public void iClickCash() {
            credentialsOneWay.clickPaymentCash();
        }
    }

    @And("I click Continue")
    public void iClickContinue() {
        public void iClickSearch() {
            credentialsOneWay.clickConfirm();
        }
    }

    @And("I verify that “Please, write down or remember this number” pops up")
    public void iVerifyThatPleaseWriteDownOrRememberThisNumberPopsUp() {
    }

    @Then("I should see the PNR as final booking phase")
    public void iShouldSeeThePNRAsFinalBookingPhase() {
    }
}
