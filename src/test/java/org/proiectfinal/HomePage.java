package org.proiectfinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div[2]/div[2]/button[1]")
    private WebElement acceptCookies;

    @FindBy (css = "#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(4) > a > i")
    private WebElement signUpButton;
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/form/button")
    private WebElement createAccountButton;


    public void setAcceptCookies(){
   elementsHelper.clickElement(acceptCookies);
    }

    public void clickOnSignUpButton(){
        elementsHelper.clickElement(signUpButton);
    }

    public void clickOnCreateAccountButton(){
        elementsHelper.clickElement(createAccountButton);
    }

    @Override
    public void isPageLoaded() {

    }
}
