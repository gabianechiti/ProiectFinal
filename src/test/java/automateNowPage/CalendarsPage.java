package automateNowPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CalendarsPage extends BasePage{

    @FindBy (xpath = "//*[@id=\"post-36\"]/div/div[2]/div/div[2]/div[2]/div/a")
    private WebElement calendarsMenu;

    @FindBy (id = "g1065-selectorenteradate")
    private WebElement dateOfBirthInput;

    @FindBy (xpath = "//*[@id=\"header\"]/div/a")
    private WebElement homePageButton;

    @FindBy(xpath = "//*[@id=\"contact-form-1065\"]/form/p[1]/button")
    private WebElement submitButton;

    @FindBy (id = "to-top")
    private WebElement moveToTop;

    public CalendarsPage(WebDriver driver) {
        super(driver);
    }

    public void actionsOnCalendarsMenu(){
    clickOnCalendarsMenu();
    fillDateOfBirthInput();
    clickOnSubmitButton();
    returnToTheTopPage();
    goBackToHomePage();
    }

    public void clickOnCalendarsMenu(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(calendarsMenu).perform();
        elementsHelper.clickElement(calendarsMenu);
    }

    public void fillDateOfBirthInput(){
        elementsHelper.fillElement(dateOfBirthInput, "1982-09-28");
    }

    public void clickOnSubmitButton(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(submitButton).perform();
        elementsHelper.clickElement(submitButton);
    }


    public void returnToTheTopPage(){
        elementsHelper.clickElement(moveToTop);
    }

    public void goBackToHomePage(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(homePageButton).perform();
        elementsHelper.clickElement(homePageButton);
    }

    @Override
   public void isPageLoaded() {

    }
}
