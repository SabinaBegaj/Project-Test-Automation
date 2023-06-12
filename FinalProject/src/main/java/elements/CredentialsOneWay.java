package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Driver;

import java.time.LocalDate;
import java.util.List;

public class CredentialsOneWay {


        private final Driver driver = Driver.getInstanceOfDriver();
        public List<WebElement> findAllFlights() {
            return driver.getDriver().findElements(By.xpath(".//*[@id='AirSearchResultContent']//div[@class='row flightDetails']"));
        }

        @FindBy(className= "ui mini light-blue ff-price-padding button")
        private WebElement priceTab;
        public void clickPriceTab() {
            priceTab.click();
        }

        @FindBy(id = "farefamilybtn_878a1860-ceb5-4a13-97cc-4dc0c175a5ce_BUSINESS-9981_0")
        private WebElement businessFare;
        public void businessFare() {
            businessFare.click();
        }

        @FindBy(className= "ui button red  ")
        private WebElement bookNow;
        public void bookNow() {
            bookNow.click();
        }

        @FindBy(className = "ui segment white passengerForm")
        private WebElement firstPassengerData;
        public boolean isFirstPasengerFormDisplayed() {
            return firstPassengerData.isDisplayed();
        }

        @FindBy(id = "fname_0")
        private WebElement firstName1;

        public void selectFirstPassengerFName(String fName1) throws InterruptedException {
            firstName1.click();
            firstName1.sendKeys(fName1);
            Thread.sleep(2000);
            firstName1.sendKeys(Keys.ENTER);
        }

        @FindBy(id = "lname_0")
        private WebElement lastName1;
        public void selectFirstPassengerLName(String lName1) throws InterruptedException {
            lastName1.click();
            lastName1.sendKeys(lName1);
            Thread.sleep(2000);
            lastName1.sendKeys(Keys.ENTER);
        }

        @FindBy(id = "email_0")
        private WebElement email1;
    public void selectFirstPassengerEmail(String email) throws InterruptedException {
        email1.click();
        email1.sendKeys(email);
        Thread.sleep(2000);
        email1.sendKeys(Keys.ENTER);
    }

        @FindBy(id = "email_c_0")
        private WebElement emailConfimation1;
    public void selectFirstPassengerEmailConfirmation(String emailConfirmation) throws InterruptedException {
        emailConfimation1.click();
        emailConfimation1.sendKeys(emailConfirmation);
        Thread.sleep(2000);
        emailConfimation1.sendKeys(Keys.ENTER);
    }
@FindBy (id = "phone_0")
private WebElement phoneNumber;
    public void selectPhoneNumber(String phNumber) throws InterruptedException {
        phoneNumber.click();
        phoneNumber.sendKeys(phNumber);
        Thread.sleep(2000);
        phoneNumber.sendKeys(Keys.ENTER);

        @FindBy(className = "ui dividing header")
        private WebElement secondPassengerData;

    public boolean isSecondPasengerFormDisplayed() {
        return secondPassengerData.isDisplayed();
    }
        @FindBy(id = "fname_1")
        private WebElement firstName2;

    public void selectSecondPassengerFName(String fName2) throws InterruptedException {
        firstName2.click();
        firstName2.sendKeys(fName2);
        Thread.sleep(2000);
        firstName2.sendKeys(Keys.ENTER);
    }
        @FindBy(id = "lname_1")
        private WebElement lastName2;

    public void selectSecondPassengerLName(String lName2) throws InterruptedException {
        lastName2.click();
        lastName2.sendKeys(lName2);
        Thread.sleep(2000);
        lastName2.sendKeys(Keys.ENTER);
    }

            @FindBy(id = "seatSelectionBtn")
            private WebElement seatSelection;

        public void selectSeatSelection(String seat) {
            seatSelection.click();
            selectSeatCategory(seat).click();
        }
        private WebElement selectSeatCategory(String seat) {
            return driver.getDriver().findElement(By.xpath(".//*[@id='adult-counter']//option[text()='" + seat + "']"));
        }


        }
            @FindBy(id = "CashRadioButton") //hipothetically if Cash option would exits
            private WebElement paymentCash;
    public void clickPaymentCash() {
        paymentCash.click();
    }
    @FindBy (id = "btnCreateBooking")
private WebElement confirmBooking;
    public void clickConfirm() {
        confirmBooking.click();
    }

    }



