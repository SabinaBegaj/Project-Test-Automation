package utils;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {

    private static Driver instanceOfDriver = null;
    private WebDriver driver;
    private final WebDriverWait wait;
    private final Actions actions;
    private final TakesScreenshot screenshot;

    private Driver() {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        screenshot = (TakesScreenshot) driver;
        actions = new Actions(driver);

    }

    public static Driver getInstanceOfDriver() {

        if (instanceOfDriver == null) {
            instanceOfDriver = new Driver();
        }
        return instanceOfDriver;

    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public Actions getActions() {
        return actions;
    }

    public TakesScreenshot getScreenshot() {
        return screenshot;
    }
//
//    // Select One Way option
//    WebElement oneWayOption = driver.findElement(By.id("OneWay"));
//    oneWayOption.click();
//
//    // Enter From and To fields
//    WebElement fromField = driver.findElement(By.id("departure_city"));
//    fromField.sendKeys("Hamburg");
//
//    WebElement toField = driver.findElement(By.id("destination_city"));
//    toField.sendKeys("Munich");
//
//    // Select number of adults
//    WebElement adultsList = driver.findElement(By.id("adult_counter"));
//    adultsList.sendKeys("2");
//
//    // Select Economy cabin
//    WebElement cabinList = driver.findElement(By.id("pref_class"));
//    cabinList.sendKeys("Economy");
//
//
//    WebElement departureDate = driver.findElement(By.xpath("//td[@data-month='0']/a[text()='1']"));
//       departureDate.click();
//
//
//
//    WebElement nextMonthButton = driver.findElement(By.id("departure_date"));
//        nextMonthButton.click();
//
//
//    // Step 5: Select Any business on the prices
//
//
//    // Select Light economy option on prices
//    WebElement economyOption = driver.findElement(By.id("farefamilybtn_5b3c40fd-0ae8-49cd-978d-b35f37446c97_LIGHT-9998_0"));
//    economyOption.click();
//    WebElement cabinPreference = driver.findElement(By.id("pref_class"));
//        cabinPreference.click();
//    WebElement anyBusinessOption = driver.findElement(By.xpath("//div[@id='searchResultWrapper']//div[@class='price-slab'][1]"));
//        anyBusinessOption.click();
//    WebElement flightDetails = driver.findElement(By.className("ui mini light-blue ff-price-padding button"));
//        flightDetails.click();
//
//    // Step 6: Fill all the personal info for travelers
//    WebElement lightEconomy = driver.findElement(By.id("farefamilybtn_a419581f-6c06-4ea8-a235-817c3b950d36_LIGHT-9998_0"));
//        lightEconomy.click();
//    WebElement firstName = driver.findElement(By.id("fname_0"));
//        firstName.sendKeys("Sabina");
//
//    WebElement lastName = driver.findElement(By.id("lname_0']"));
//        lastName.sendKeys("Begaj");
//
//    WebElement emailInput = driver.findElement(By.id("email_0']"));
//        emailInput.sendKeys("sabina.begaj@gmail.com");
//
//    WebElement confirmEmail = driver.findElement(By.id("email_c_0']"));
//        emailInput.sendKeys("sabina.begaj@gmail.com");
//
//        //Fill data for the other passenger
//        WebElement firstName1 = driver.findElement(By.id("fname_1"));
//        firstName.sendKeys("Silvi");
//
//    WebElement lastName1 = driver.findElement(By.id("lname_1']"));
//        lastName.sendKeys("Cela");
//
//    // Select a seat with the number "22A" or any available window seat
//    WebElement seatSelection = driver.findElement(By.id("SeatRow"));
//    seatSelection.sendKeys("22A");
//
//    // Select Cash (Invoice) payment option
//    WebElement paymentOption = driver.findElement(By.id("PaymentMethod"));
//    paymentOption.sendKeys("Cash (Invoice)");
//
//    // Click Confirm Booking button
//    WebElement confirmBookingButton = driver.findElement(By.id("btnCreateBooking"));
//    confirmBookingButton.click();
//
//    // Verify the booking reference number and save it to a variable
//    WebElement bookingReferenceNumber = driver.findElement(By.xpath("//div[contains(text(), 'booking reference number')]"));
//    String bookingNumber = bookingReferenceNumber.getText().split(":")[1].trim();
//
//    // Display the booking reference number on the console
//    System.out.println("Booking reference number: " + bookingNumber);
//
//    // Close the browser
//    driver.quit();
}
