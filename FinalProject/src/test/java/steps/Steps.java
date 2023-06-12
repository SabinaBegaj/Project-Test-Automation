package steps;

import elements.Results;
import elements.OneWay;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Driver;

@CucumberOptions(glue = {"src/test/java/steps"})
public class Steps {
    public Steps() {

        oneWay =PageFactory.initElements(driver.getDriver(),OneWay.class);

        results =PageFactory.initElements(driver.getDriver(),Results.class);
    }
    private final OneWay oneWay;
    private final Results results;
    private final Driver driver = Driver.getInstanceOfDriver();

    @Given("Go To {string}")
    public void goTo(String url) {

        driver.get(url);


    }

    @And("Enter data:")
    public void enterData(DataTable table) {
        String frm = table.cell(0, 0);
    }

    @When("I select One Way option")
    public void iSelectOneWayOption() {
        oneWay.clickOneWay();
    }

    @And("I enter {string} in the From field")
    public void iEnterInTheField(String city) throws InterruptedException {
        oneWay.selectDepartureCity(city);
    }
    @And("I enter {string} in the To field")
    public void iEnterInTheToField(String city) throws InterruptedException {
        oneWay.selectDestinationCity(city);
    }
    @And("I select the departure date month {string} and day {string}")
    public void iSelectTheDepartureDateMonth(String month, String day) throws InterruptedException {
        oneWay.selectDepartureDate(month, Integer.parseInt(day));

    }

    @And("I select {string} adults")
    public void iSelectAdults(String adults) {
        oneWay.selectAdults(Integer.parseInt(adults));
        
    }

    @And("I select {string} cabin")
    public void iSelectCabin(String category)  {
        oneWay.selectCabinPreference(category)
        
    }
    @And("I click Search")
    public void iClickSearch() {
        oneWay.clickSearch();
    }

    @Then("List of flights should be displayed for the chosen route and date")
    public void listOfFlightsShouldBeDisplayedForTheChosenRouteAndDate() throws InterruptedException {
        Thread.sleep(20000);
        Assert.assertTrue(results.findAllFlights().size() > 0);
    }
    
}
