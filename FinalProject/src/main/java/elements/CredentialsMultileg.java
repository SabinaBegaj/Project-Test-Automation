package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Driver;

import java.util.List;

public class CredentialsMultileg {

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
            lastName1.click();
            lastName1.sendKeys(email);
            Thread.sleep(2000);
            lastName1.sendKeys(Keys.ENTER);
        }

        @FindBy(id = "email_c_0")
        private WebElement emailConfimation1;
        public void selectFirstPassengerEmailConfirmation(String emailConfirmation) throws InterruptedException {
            lastName1.click();
            lastName1.sendKeys(emailConfirmation);
            Thread.sleep(2000);
            lastName1.sendKeys(Keys.ENTER);
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
        public void selectSecondPassengerFName(String fname2)  throws InterruptedException {
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
    private WebElement firstName3;
    public void selectThirdPassengerFName(String fName3) throws InterruptedException {
        firstName3.click();
        firstName3.sendKeys(fName3);
        Thread.sleep(2000);
        firstName3.sendKeys(Keys.ENTER);
    }
    @FindBy(id = "lname_2")
    private WebElement lastName3;
    public void selectThirdPassengerLName(String lName3) throws InterruptedException {
        lastName3.click();
        lastName3.sendKeys(lName3);
        Thread.sleep(2000);
        lastName3.sendKeys(Keys.ENTER);
    }
    @FindBy(id = "fname_2")
    private WebElement childFName1;
    public void selectChildFName1(String chName1) throws InterruptedException {
        childFName1.click();
        childFName1.sendKeys(chName1);
        Thread.sleep(2000);
        childFName1.sendKeys(Keys.ENTER);
    }
    @FindBy(id = "lname_2")
    private WebElement childLName1;
    public void selectChildLName1(String chLastName1) throws InterruptedException {
        childLName1.click();
        childLName1.sendKeys(chLastName1);
        Thread.sleep(2000);
        childLName1.sendKeys(Keys.ENTER);
    }
    @FindBy(id = "fname_2")
    private WebElement childFName2;
    public void selectChildFName2(String chName2) throws InterruptedException {
        childFName2.click();
        childFName2.sendKeys(chName2);
        Thread.sleep(2000);
        childFName2.sendKeys(Keys.ENTER);
    }
    @FindBy(id = "lname_2")
    private WebElement childLName2;
    public void selectChildLName2(String chLastName2) throws InterruptedException {
        childLName2.click();
        childLName2.sendKeys(chLastName2);
        Thread.sleep(2000);
        childLName2.sendKeys(Keys.ENTER);
    }
    @FindBy(id = "employeeProfileField required field nine wide")
    private WebElement firstChildDateOfBirth;
    private WebElement selectDay(int day) {
        return driver.getDriver().findElement(By.id("bdate_d_3" + day + "']"));
    }
    private WebElement selectMonth(int month) {
        return driver.getDriver().findElement(By.id("bdate_m_3" + month + "']"));
    }
    private WebElement selectYear(int year) {
        return driver.getDriver().findElement(By.id("bdate_y_3" + year + "']"));
    }

    public void firstChildDateOfBirth(int month, int day, int year) throws InterruptedException {
        firstChildDateOfBirth.click();
        Thread.sleep(1000);
        public boolean isCalendarDisplayed if (isCalendarDisplayed()) {

            selectDay(day).click();
            selectMonth(month).click();
            selectYear(year).click();
        }
            @FindBy(id = "employeeProfileField required field nine wide")
            private WebElement secondChildDateOfBirth;
            private WebElement selectDay(int day) {
                return driver.getDriver().findElement(By.id("bdate_d_4" + day + "']"));
            }
            private WebElement selectMonth(int month) {
                return driver.getDriver().findElement(By.id("bdate_m_4" + month + "']"));
            }
            private WebElement selectYear(int year) {
                return driver.getDriver().findElement(By.id("bdate_y_4" + year + "']"));
            }

            public void secondChildDateOfBirth(int month, int day, int year) throws InterruptedException {
                firstChildDateOfBirth.click();
                Thread.sleep(1000);
                public boolean isCalendarDisplayed if (isCalendarDisplayed()) {

                    selectDay(day).click();
                    selectMonth(month).click();
                    selectYear(year).click();
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
            cvvCode.sendKeys(number);
            Thread.sleep(2000);
            cvvCode.sendKeys(Keys.ENTER);
        }
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
                public void selectZipCode(String zip) throws InterruptedException {
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


            }


        }
    }



}


