package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Driver;

import java.time.LocalDate;
import java.util.List;

public class CredentialsReturn {


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

        @FindBy(id = "email_c_0")
        private WebElement emailConfimation1;

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
        @FindBy(id = "fname_2")
        private WebElement infantFName;
    public void selectInfantFName(String fName) throws InterruptedException {
        infantFName.click();
        infantFName.sendKeys(fName);
        Thread.sleep(2000);
        infantFName.sendKeys(Keys.ENTER);
    }
        @FindBy(id = "lname_2")
        private WebElement infantLName;
    public void selectInfantLName(String lName) throws InterruptedException {
        infantLName.click();
        infantLName.sendKeys(lName);
        Thread.sleep(2000);
        infantLName.sendKeys(Keys.ENTER);
    }
    @FindBy(id = "employeeProfileField required field nine wide")
    private WebElement infantDateOfBirth;
    private WebElement selectDay(int day) {
        return driver.getDriver().findElement(By.id("bdate_d_2" + day + "']"));
    }
    private WebElement selectMonth(int month) {
        return driver.getDriver().findElement(By.id("bdate_m_2" + month + "']"));
    }
    private WebElement selectYear(int year) {
        return driver.getDriver().findElement(By.id("bdate_y_2" + year + "']"));
    }

    public void infantDateOfBirth(int month, int day, int year) throws InterruptedException {
        infantDateOfBirth.click();
        Thread.sleep(1000);
        if (isCalendarDisplayed()) {

                selectDay(day).click();
            selectMonth(month).click();
            selectYear(year).click();
            }


        }
    }


        @FindBy(xpath = ".//*[@id='ui-datepicker-div']//span[@class='ui-datepicker-month']")
        private WebElement calendarMonth;

        @FindBy(xpath = ".//*[@id='ui-datepicker-div']//a[@class='ui-datepicker-next ui-corner-all']")
        private WebElement nextMonth;

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
    @FindBy(id = "B2CCreditCardRadioButton")
    private WebElement paymentSelection;
    public void clickPaymentSelection () {
        paymentSelection.click();
    }
    @FindBy(id = "AIRcnN_0")
    private WebElement cardNumber;
    public void selectCardNumber(int number) throws InterruptedException {
        cardNumber.click();
        cardNumber.sendKeys(number);
        Thread.sleep(2000);
        cardNumber.sendKeys(Keys.ENTER);}
    @FindBy(id = "AIRcvv_0")
    private WebElement cvvCode;
    public void selectCvvCode(int cvv) throws InterruptedException {
        cvvCode.click();
        cvvCode.sendKeys(cvv);
        Thread.sleep(2000);
        cvvCode.sendKeys(Keys.ENTER);}
    @FindBy(id = "AIRexp_m_0")
    private WebElement expiryMonth;
        () {
                return calendar.isDisplayed();
                }
private WebElement expiryMonth ( int xmonth){
        return driver.getDriver().findElement(By.id("AIRexp_m_0" + xmonth + "']"));
public void selectExpiryMonth ( int month)throws InterruptedException {
        if (isCalendarDisplayed()) {
        expiryMonth.click();
        Thread.sleep(1000);

        selectMonth(month).click();
        }
        }


@FindBy(id = "AIRexp_y_0")
private WebElement expiryYear;
private WebElement selectYear ( int xyear){
        return driver.getDriver().findElement(By.id("AIRexp_y_0" + xyear + "']"));
        }
public void selectExpiryYear ( int xyear)throws InterruptedException {
        if (isCalendarDisplayed()) {
        expiryYear.click();
        Thread.sleep(1000);

        selectMonth(month).click();
        }
@FindBy(id = "cname_0")
private WebElement cardName;
public void selectCardName(String cName) throws InterruptedException {
        cardName.click();
        cardName.sendKeys(cName);
        Thread.sleep(2000);
        cardName.sendKeys(Keys.ENTER);}
@FindBy(id = "AIRcntry_0")
private WebElement cardCountry;

public void selectCardCountry(String Country) throws InterruptedException {
        cardCountry.click();
        cardCountry.sendKeys(Country);
        Thread.sleep(2000);
        cardCountry.sendKeys(Keys.ENTER);
        }

@FindBy(id = "AIRstr_0")
private WebElement billingAddress;
public void selectBillingAddress(String bAddress) throws InterruptedException {
        billingAddress.click();
        billingAddress.sendKeys(bAddress);
        Thread.sleep(2000);
        billingAddress.sendKeys(Keys.ENTER);}
@FindBy(id = "cty_0")
private WebElement cardCity;
public void clickCardCity() {
        cardCity.click();
        }
@FindBy(id = "AIRstate_0")
private WebElement cardState;
public void selectCardState(String state) throws InterruptedException {
        cardState.click();
        cardState.sendKeys(state);
        Thread.sleep(2000);
        cardState.sendKeys(Keys.ENTER);
        }
@FindBy(id = "AIRzip_0")
private WebElement zipCode;
public void selectZipCode(int zip) throws InterruptedException {
        zipCode.click();
        zipCode.sendKeys(zip);
        Thread.sleep(2000);
        zipCode.sendKeys(Keys.ENTER);
        }

@FindBy(id = "CUSTOM_FIELD_834-0")
private WebElement confirmCVV;
public void selectConfirmCVV(String cVV) throws InterruptedException {
        confirmCVV.click();
        confirmCVV.sendKeys(cVV);
        Thread.sleep(2000);
        confirmCVV.sendKeys(Keys.ENTER);
        }
@FindBy(id = "cbRules")
private WebElement rulesAgreement;
public void clickRulesAgreement () {
        rulesAgreement.click();
        }

@FindBy(id = "btnCreateBooking")
private WebElement createBooking;
public void clickCreateBooking () {
        createBooking.click();
        }

        public void clickSearchRoundTrips() {
            searchRound.click();
        }
    }
}
