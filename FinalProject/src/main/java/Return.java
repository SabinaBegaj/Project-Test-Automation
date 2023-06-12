import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Return {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://airprojects.resvoyage.com/airtravel.htm?Idle=true&lang=en-us");

        // Step 1: Select Return and Non-stop flights
        WebElement returnRadio = driver.findElement(By.xpath("//input[@value='RT']"));
        returnRadio.click();

        WebElement nonStopCheckbox = driver.findElement(By.xpath("//input[@id='optNonstop']"));
        nonStopCheckbox.click();

        // Step 2: Enter route from Frankfurt to Budapest
        WebElement fromInput = driver.findElement(By.xpath("//input[@id='from']"));
        fromInput.sendKeys("Frankfurt");

        WebElement toInput = driver.findElement(By.xpath("//input[@id='to']"));
        toInput.sendKeys("Budapest");

        WebElement searchBtn = driver.findElement(By.xpath("//button[@class='search btn btn-primary']"));
        searchBtn.click();

        // Step 3: Add travelers (2 Adults, 1 Infant) and select Business class
        WebElement passengersDropdown = driver.findElement(By.xpath("//select[@id='searchPassenger']"));
        Select passengersSelect = new Select(passengersDropdown);
        passengersSelect.selectByVisibleText("2 Adults, 1 Infant");

        WebElement cabinDropdown = driver.findElement(By.xpath("//select[@id='searchCabin']"));
        Select cabinSelect = new Select(cabinDropdown);
        cabinSelect.selectByVisibleText("Business");

        // Step 4: Select travel dates (First Date the present month, return date next month)
        WebElement departureDateInput = driver.findElement(By.xpath("//input[@id='departureDate']"));
        departureDateInput.click();

        WebElement firstDate = driver.findElement(By.xpath("//td[@data-month='0']/a[text()='1']"));
        firstDate.click();

        WebElement returnDateInput = driver.findElement(By.xpath("//input[@id='returnDate']"));
        returnDateInput.click();

        WebElement nextMonthBtn = driver.findElement(By.xpath("//div[@class='datepicker--nav-action']/span[text()='Next']"));
        nextMonthBtn.click();

        WebElement secondDate = driver.findElement(By.xpath("//td[@data-month='1']/a[text()='2']"));
        secondDate.click();

        // Step 5: Select Any business on the prices
        WebElement anyBusinessOption = driver.findElement(By.xpath("//div[@id='searchResultWrapper']//div[@class='price-slab'][1]"));
        anyBusinessOption.click();

        // Step 6: Fulfill all the personal info’s for travelers
        WebElement firstNameInput = driver.findElement(By.xpath("//input[@id='firstname0']"));
        firstNameInput.sendKeys("John");

        WebElement lastNameInput = driver.findElement(By.xpath("//input[@id='lastname0']"));
        lastNameInput.sendKeys("Begaj");

        WebElement emailInput = driver.findElement(By.xpath("//input[@id='email']"));
        emailInput.sendKeys("sabina.begaj@gmail.com");

        // Step 7: Add car rental for the dates and the location you will be
        WebElement carRentalCheckbox = driver.findElement(By.xpath("//input[@id='optRental']"));
        carRentalCheckbox.click();

        WebElement pickupLocationInput = driver.findElement(By.xpath("//input[@id='rentalPickup']"));
    }
}
