package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Driver;

import java.time.LocalDate;

public class OneWay {

    private final Driver driver = Driver.getInstanceOfDriver();

    @FindBy(id = "OneWay")
    private WebElement oneWay;

    @FindBy(id = "departure_city")
    private WebElement departureCity;

    @FindBy(id = "destination_city")
    private WebElement destinationCity;

    @FindBy(id = "departure_date")
    private WebElement departureDate;

    @FindBy(id = "adult-counter")
    private WebElement adults;

    @FindBy(id = "pref_class")
    private WebElement cabinPreference;

    @FindBy(id = "submitBTN")
    private WebElement searchOneWay;

    @FindBy(id = "ui-datepicker-div")
    private WebElement calendar;

    @FindBy(xpath = ".//*[@id='ui-datepicker-div']//a[@class='ui-datepicker-next ui-corner-all']")
    private WebElement nextMonth;


    public void clickOneWay() {
        oneWay.click();
    }

    public void selectDepartureCity(String city) throws InterruptedException {
        departureCity.click();
        departureCity.sendKeys(city);
        Thread.sleep(2000);
        departureCity.sendKeys(Keys.ENTER);
    }

    public void selectDestinationCity(String city) throws InterruptedException {
        destinationCity.click();
        destinationCity.sendKeys(city);
        Thread.sleep(2000);
        destinationCity.sendKeys(Keys.ENTER);
    }

    public boolean isCalendarDisplayed() {
        return calendar.isDisplayed();
    }

    private boolean isNextMonth() {
        String month = LocalDate.now().getMonth().toString();

        return nextMonth.getText().equalsIgnoreCase(month);
    }

    private WebElement selectDay(int day) {
        return driver.getDriver().findElement(By.xpath(".//*[@id='ui-datepicker-div']//a[text()='" + day + "']"));
    }

    public void selectDepartureDate(String month, int day) throws InterruptedException {
        departureDate.click();
        Thread.sleep(1000);
        if (isCalendarDisplayed()) {
            while (!nextMonth.getText().equalsIgnoreCase(month)) {
                nextMonth.click();
            }

            selectDay(day).click();
        }
    }


    public void selectAdults(int number) {
        adults.click();
        selectAdultsNumber(number).click();
    }


    public void selectCabinPreference(String category) {
        cabinPreference.click();
        selectCabin(category).click();
    }

    private WebElement selectAdultsNumber(int number) {
        return driver.getDriver().findElement(By.xpath(".//*[@id='adult-counter']//option[text()='" + number + "']"));
    }


    private WebElement selectCabin(String category) {
        return driver.getDriver().findElement(By.xpath(".//*[@id='pref_class']//option[text()='" + category + "']"));
    }

    public void clickSearchOneWayTrips() {
        searchOneWay.click();
    }
}



