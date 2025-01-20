package automateNowPage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class FillFormPage extends BasePage{

    @FindBy (xpath = "//*[@id=\"post-36\"]/div/div[2]/div/div[2]/div[1]/div/a")
    private WebElement clickOnFormMenu;

    @FindBy (id = "name-input")
    private WebElement nameInput;

    @FindBy (xpath = "//*[@id=\"feedbackForm\"]/label[2]/input")
    private WebElement passwordInput;

    @FindBy (id = "drink3")
    private WebElement coffeeCheckBox;

    @FindBy (id = "drink4")
    private WebElement wineCheckBox;

    @FindBy (id = "color2")
    private WebElement favoriteColorCheckBox;

    @FindBy (id = "automation")
    private WebElement doYouLikeAutomation;

    @FindBy (id = "email")
    private WebElement emailInput;

    @FindBy (id = "message")
    private WebElement messageInput;

    @FindBy (id = "submit-btn")
    private WebElement submitButton;

    @FindBy (id = "to-top")
    private WebElement moveToTop;

    @FindBy (xpath = "//*[@id=\"header\"]/div/a")
    private WebElement homePageButton;

    public FillFormPage(WebDriver driver) {
        super(driver);
    }

    public void FillEntireForm(){
        selectMenu();
        fillNameInput();
        fillPasswordInput();
        favoriteDrinksCheckBox();
        favoriteColorCheckBox();
        doYouLikeAutomation();
        fillEmailInput();
        fillMessageInput();
        clickOnSubmitButton();
        returnToTheTopPage();
        elementsHelper.threadSleep(2000);
        goBackToHomePage();
    }

    public void selectMenu(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(clickOnFormMenu).perform();
        elementsHelper.clickElement(clickOnFormMenu);
    }

    public void fillNameInput(){
        elementsHelper.fillElement(nameInput, "Star Light");
    }

    public void fillPasswordInput(){
        elementsHelper.fillElement(passwordInput, "TestareAutomata2025");
    }

    public void favoriteDrinksCheckBox(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(coffeeCheckBox).perform();
        elementsHelper.clickElement(coffeeCheckBox);
        actions.scrollToElement(wineCheckBox).perform();
        elementsHelper.clickElement(wineCheckBox);
    }

    public void favoriteColorCheckBox(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(favoriteColorCheckBox).perform();
        elementsHelper.clickElement(favoriteColorCheckBox);
    }

    public void doYouLikeAutomation(){
        Actions actions = new Actions(driver);
        actions.moveToElement(doYouLikeAutomation).perform(); // Mută cursorul către element
        doYouLikeAutomation.click();
        elementsHelper.keyboardEnters(doYouLikeAutomation, Keys.ARROW_DOWN);
        elementsHelper.keyboardEnters(doYouLikeAutomation, Keys.ENTER);
    }

    public void fillEmailInput(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(emailInput).perform();
        elementsHelper.fillElement(emailInput, "starlight@gmail.com");
    }

    public void fillMessageInput(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(messageInput).perform();
        elementsHelper.fillElement(messageInput, "Hello");
    }

    public void clickOnSubmitButton(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(submitButton).perform();
        elementsHelper.clickElement(submitButton);
        alertHelpers.acceptAlert();
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
