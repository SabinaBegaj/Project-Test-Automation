package steps;

import elements.*;
import io.cucumber.java.en.Given;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

@CucumberOptions(glue = {"src/test/java/steps"})

public class StepsMultileg {

    public StepsMultileg() {

        multileg = PageFactory.initElements(driver.getDriver(), Multileg.class);

        results = PageFactory.initElements(driver.getDriver(), Results.class);
    }

    private final Multileg multileg;
    private final Results results;
    private final Driver driver = Driver.getInstanceOfDriver();

    @Given("Go To {string}")
    public void goTo(String url) {
        driver.get(url);

    }

    @When("I select Multi Destinations")
    public void iSelectMultiDestinations() {
        multileg.clickMultiDestinations();
    }
    @And("I enter {string} in the From field")
    public void iEnterInTheFromField(String city) throws InterruptedException {
        multileg.selectDepartureCity(city);
    }

    @And("I enter {string} in the To field")
    public void iEnterInTheToField(String city) throws InterruptedException {
        multileg.selectDestinationCity(city);
    }

    @And("I type Add Trip on the Plus button")
    public void iTypeAddTripOnThePlusButton() {
    }
}
