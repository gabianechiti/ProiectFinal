package org.proiectfinal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import javax.xml.xpath.XPath;
import java.util.ArrayList;
import java.util.List;

public class FillFormPage extends BasePage{
    @FindBy(xpath = "//input[@type='text']")
    private WebElement newUserName;
    @FindBy(xpath= "//input[@data-qa='signup-email']")
    private WebElement newUserEmail;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    private WebElement signUpNewUser;
    @FindBy(xpath = "//*[@id=\"id_gender2\"]")
    private WebElement femaleGenderElement;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement fillPassword;
    @FindBy(xpath = "//*[@id=\"days\"]")
    private WebElement dayOfBirth;
    @FindBy(xpath = "//*[@id=\"newsletter\"]")
    private WebElement newsletter;
    @FindAll({
            @FindBy(id = "days"),
            @FindBy(id = "months"),
            @FindBy(id = "years")
    })
    private List<WebElement> dateOfBirth;

    @FindBy(xpath = "//*[@id=\"optin\"]")
    private WebElement specialOffers;

    @FindBy(xpath = "//*[@id=\"first_name\"]")
    private WebElement firstName;

    @FindBy(xpath = "//*[@id=\"last_name\"]")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id=\"company\"]")
    private WebElement company;

    @FindBy(xpath = "//*[@id=\"address1\"]")
    private WebElement address1;


    @FindBy(xpath = "//*[@id=\"address2\"]")
    private WebElement address2;

    @FindBy(xpath = "//*[@id=\"state\"]")
    private WebElement state;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement city;

    @FindBy(xpath = "//*[@id=\"zipcode\"]")
    private WebElement zipCode;

    @FindBy(xpath = "//*[@id=\"mobile_number\"]")
    private WebElement mobileNumber;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/form/button")
    private WebElement createAccount;

    @FindBy(xpath = "//*[@id=\"country\"]")
    private WebElement unitedStates;

    @FindBy(xpath = "//*[@href=\"/delete_account\"]")
    private WebElement deleteAccount;

    @FindBy(xpath = "//*[@id=\"dismiss-button\"]/div/span")
    private WebElement closeAdd;

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a")
    private WebElement confirmationCreatingAccount;



    public FillFormPage(WebDriver driver) {
        super(driver);
    }

    public void fillEntireForm() throws InterruptedException {
        fillNewUserName();
        fillNewUSerEmail();
        clickSignUpButton();
        selectGender("Mrs.");
        fillPassword();
        setDateOfBirth("28", "September", "1982");
        elementsHelper.scrollDown();
        clickOnNewsletter();
        clickOnSpecialOffers();
        fillFirstName();
        fillLastName();
        elementsHelper.scrollDown();
        fillCompanyName();
        fillInAddress1();
        elementsHelper.scrollDown();
        fillInAddress2();
        fillInState();
        fillInCity();
        fillInZipCode();
        elementsHelper.scrollDown();
        fillInMobilePhone();
        clickOnCreateAccountButton();
//        selectCountry();
        driver.wait(60);
        closeAdd();
        configurareChrom();

        continueButton();
//        deleteAccount();


    }

    public void fillNewUserName(){
        elementsHelper.fillElement(newUserName, "Starlight");
    }
    public void fillNewUSerEmail(){
        elementsHelper.fillElement(newUserEmail, "starttttllliiiight@yet.com");
    }
    public void clickSignUpButton(){
        elementsHelper.clickElement(signUpNewUser);
    }
    public void selectGender(String s) {
        elementsHelper.clickElement(femaleGenderElement); }
    public void fillPassword(){
        elementsHelper.fillElement(fillPassword, "starlight");}
    public void setDateOfBirth(String day, String month, String year){
        dateOfBirth.get(0).sendKeys(day);
        dateOfBirth.get(1).sendKeys(month);
        dateOfBirth.get(2).sendKeys(year);
        Assert.assertEquals(dateOfBirth.size(), 3);
    }
    public void clickOnNewsletter(){
        elementsHelper.clickElement(newsletter);
    }
    public void clickOnSpecialOffers(){
        elementsHelper.clickElement(specialOffers);
    }
    public void fillFirstName(){
        elementsHelper.fillElement(firstName,"StarDust");
    }
    public void fillLastName(){
        elementsHelper.fillElement(lastName, "Popescu");
    }

    public void fillCompanyName(){
        elementsHelper.fillElement(company, "Companie");
    }
    public void fillInAddress1(){
        elementsHelper.fillElement(address1, "Giurgiu");
    }
    public void fillInAddress2(){
        elementsHelper.fillElement(address2, "Giurgiu2");
    }
    public void fillInState(){
        elementsHelper.fillElement(state, "Romania");
    }
    public void fillInCity(){
        elementsHelper.fillElement(city, "Giurgiu");
    }
    public void fillInZipCode(){
        elementsHelper.fillElement(zipCode, "080013");
    }
    public void fillInMobilePhone(){
        elementsHelper.fillElement(mobileNumber, "0721223344");
    }
    public void clickOnCreateAccountButton(){
        elementsHelper.clickElement(createAccount);
    }
    public void selectCountry(){
        unitedStates.click();
        unitedStates.sendKeys("unitedStates");
    }

    public void closeAdd(){
        elementsHelper.clickElement(closeAdd);
    }

    public void continueButton(){
        elementsHelper.clickElement(confirmationCreatingAccount);
    }

    public void configurareChrom() {
        // Setează calea către driverul Chrome
        System.setProperty("webdriver.chrome.driver", "C:\\Tools\\chromedriver\\chromedriver.exe");

        // Creează obiect ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // Dezactivează salvarea parolelor și alte popup-uri
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-notifications");

        // Creează driverul Chrome cu opțiunile setate
        WebDriver driver = new ChromeDriver(options);

        // Navighează pe site
        driver.get("https://www.automationexercise.com/");

        // Continuă cu pașii de automatizare...
    }

//    public void deleteAccount(){
//        elementsHelper.clickElement(deleteAccount);
//    }
    @Override
    void isPageLoaded() {
    }

}

