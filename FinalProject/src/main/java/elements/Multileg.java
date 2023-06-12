package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Driver;

import java.time.LocalDate;
package elements;

public class Multileg {


        private final Driver driver = Driver.getInstanceOfDriver();

        @FindBy(id = "MultiDestination")
        private WebElement multiDestinations;

        @FindBy(id = "departure_city_0")
        private WebElement departureCity0;


        @FindBy(id = "destination_city_0")
        private WebElement destinationCity0;


        @FindBy(id = "departure_city_1")
        private WebElement departureCity1;

        @FindBy(id = "destination_city_1")
        private WebElement destinationCity1;

        @FindBy(id = "departure_city_2")
        private WebElement departureCity2;

        @FindBy(id = "destination_city_2")
        private WebElement destinationCity2;
    @FindBy(id = "departure_date_0")
    private WebElement departureDate0;
    @FindBy(id = "departure_date_1")
    private WebElement departureDate1;
        @FindBy(id = "departure_date_2")
        private WebElement departureDate2;
        @FindBy(id = "adult-counter")
        private WebElement adults;

        @FindBy(id = "child-counter")
        private WebElement child;

        @FindBy(id = "pref_class")
        private WebElement cabinPreference;

        @FindBy(id = "submitBTN")
        private WebElement searchMultiDestinations;

        @FindBy(id = "ui-datepicker-div")
        private WebElement calendar;

        @FindBy(xpath = ".//*[@id='ui-datepicker-div']//span[@class='ui-datepicker-month']")
        private WebElement calendarMonth;

        @FindBy(xpath = ".//*[@id='ui-datepicker-div']//a[@class='ui-datepicker-next ui-corner-all']")
        private WebElement nextMonth;


        public void clickMultiDestinations() {
            multiDestinations.click();
        }

        public void selectDepartureCity0(String city0) throws InterruptedException {
            departureCity0.click();
            departureCity0.sendKeys(city0);
            Thread.sleep(2000);
            departureCity0.sendKeys(Keys.ENTER);
        }

        public void selectDestinationCity0(String dcity0) throws InterruptedException {
            destinationCity0.click();
            destinationCity0.sendKeys(dcity0);
            Thread.sleep(2000);
            destinationCity0.sendKeys(Keys.ENTER);
        }

        public boolean isCalendarDisplayed() {
            return calendar.isDisplayed();
        }

        private boolean isSameMonth() {
            String month = LocalDate.now().getMonth().toString();

            return calendarMonth.getText().equalsIgnoreCase(month);
        }

        private WebElement selectDay(int day) {
            return driver.getDriver().findElement(By.xpath(".//*[@id='ui-datepicker-div']//a[text()='" + day + "']"));
        }

        public void selectDepartureDate0(String month, int day) throws InterruptedException {
            departureDate0.click();
            Thread.sleep(1000);
            if (isCalendarDisplayed()) {
                while (!calendarMonth.getText().equalsIgnoreCase(month)) {
                    nextMonth.click();
                }

                selectDay(day).click();
            }
        }

    public void selectDepartureDate1(String month, int day) throws InterruptedException {
        departureDate1.click();
        Thread.sleep(1000);
        if (isCalendarDisplayed()) {
            while (!calendarMonth.getText().equalsIgnoreCase(month)) {
                nextMonth.click();
            }

            selectDay(day).click();
        }
    }
    public void selectDepartureDate2(String month, int day) throws InterruptedException {
        departureDate2.click();
        Thread.sleep(1000);
        if (isCalendarDisplayed()) {
            while (!calendarMonth.getText().equalsIgnoreCase(month)) {
                nextMonth.click();
            }

            selectDay(day).click();
        }
    }

        public void selectAdults(int number) {
            adults.click();
            selectAdultsNumber(number).click();
        }

        public void selectChild(int number) {
            child.click();
            selectChildNumber(number).click();
        }

        public void selectCabinPreference(String category) {
            cabinPreference.click();
            selectCabin(category).click();
        }

        private WebElement selectAdultsNumber(int number) {
            return driver.getDriver().findElement(By.xpath(".//*[@id='adult-counter']//option[text()='" + number + "']"));
        }

        private WebElement selectChildNumber(int number) {
            return driver.getDriver().findElement(By.xpath(".//*[@id='infant-counter']//option[text()='" + number + "']"));
        }

        private WebElement selectCabin(String category) {
            return driver.getDriver().findElement(By.xpath(".//*[@id='pref_class']//option[text()='" + category + "']"));
        }

        public void clickSearch() {
            searchMultiDestinations.click();
        }
    }

