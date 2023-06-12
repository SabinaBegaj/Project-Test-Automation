package steps;

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

@CucumberOptions(glue = {"src/test/java/steps"})
public class StepsReturn {

    private final SearchPage searchPage;
    private final Results results;
    private final Driver driver = Driver.getInstanceOfDriver();

    public StepsReturn() {
        searchPage = PageFactory.initElements(driver.getDriver(), SearchPage.class);
        results = PageFactory.initElements(driver.getDriver(), Results.class);
    }

    @Given("I go and access airline booking main page {string}")
    public void navigateTo(String url) {
        driver.getDriver().get(url);
    }

    @When("I select Round Trip")
    public void selectRoundTrip() {
        searchPage.clickRoundTrip();
    }


    @And("I enter {string} in the From field")
    public void iEnterInTheFromField(String city) throws InterruptedException {
        searchPage.selectDepartureCity(city);
    }

    @And("I enter {string} in the To field")
    public void iEnterInTheToField(String city) throws InterruptedException {
        searchPage.selectDestinationCity(city);
    }

    @And("I select the departure date month {string} and day {string}")
    public void iSelectTheDateMonthAndDay(String month, String day) throws InterruptedException {
        searchPage.selectDepartureDate(month, Integer.parseInt(day));
    }

    @And("I select the return date month {string} and day {string}")
    public void iSelectTheReturnDateMonthAndDay(String month, String day) throws InterruptedException {
        searchPage.selectReturnDate(month, Integer.parseInt(day));
    }


    @And("I select {string} adults and {string} infant")
    public void iSelectAdultsAndInfant(String adults, String infants) {
        searchPage.selectAdults(Integer.parseInt(adults));
        searchPage.selectInfants(Integer.parseInt(infants));
    }

    @And("I select {string} cabin class")
    public void iSelectCabinClass(String category) {
        searchPage.selectCabinPreference(category);
    }


    @And("I go to Advanced Search")
    public void iGoToAdvancedSearch() {
    }
    @And("I select {string} as flight type")
    public void iSelectAsFlightType(String flightType) {
    }
    @And("I click Search")
    public void iClickSearch() {
        searchPage.clickSearchRoundTrips();
    }

    @Then("I should see search results for the chosen route and dates")
    public void iShouldSeeSearchResultsForTheChosenRouteAndDates() throws InterruptedException {
        Thread.sleep(20000);
        Assert.assertTrue(results.findAllFlights().size() > 0);
    }



}



