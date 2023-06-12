package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Driver;

import java.util.List;

public class Results {

    private final Driver driver = Driver.getInstanceOfDriver();

    @FindBy(id = "closeSearch")
    private WebElement closeSearch;

    public List<WebElement> findAllFlights() {
        return driver.getDriver().findElements(By.xpath(".//*[@id='AirSearchResultContent']//div[@class='row flightDetails']"));
    }
    public List<WebElement> showBookingData() {
        return driver.getDriver().findElements(By.xpath(".//*[@id='PassengerData']//div[@class='row bookingDetails']"));
    }
    public WebElement getCloseSearch() {
        return closeSearch;
    }
}
