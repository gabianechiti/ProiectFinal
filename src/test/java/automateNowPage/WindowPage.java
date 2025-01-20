package automateNowPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class WindowPage extends BasePage{

    @FindBy (xpath = "//*[@id=\"post-36\"]/div/div[2]/div/div[2]/div[3]/div/a")
    private WebElement windowMenu;

    @FindBy (xpath = "//*[@id=\"post-1147\"]/div/p[3]/button")
    private WebElement newTabButton;

    @FindBy (xpath = "//*[@id=\"post-1147\"]/div/p[5]/button")
    private WebElement replaceWindowButton;

    @FindBy (xpath = "//*[@id=\"post-1147\"]/div/p[7]/button")
    private WebElement newWindowButton;

    @FindBy (id = "to-top")
    private WebElement moveToTop;

    @FindBy (xpath = "//*[@id=\"header\"]/div/a")
    private WebElement homePageButton;

    public WindowPage(WebDriver driver) {
        super(driver);
    }

    public void actionsOnWindowPage() {
        selectWindowMenu();
        clickOnNewTabButton();
        clickOnReplaceButton();
        clickOnNewWindowButton();
        returnToTheTopPage();
        goBackToHomePage();
    }

    public void selectWindowMenu(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(windowMenu).perform();
        elementsHelper.clickElement(windowMenu);
    }

    public void clickOnNewTabButton() {
        elementsHelper.clickElement(newTabButton);
        windowHelpers.switchToWindow(1);
        windowHelpers.closeWindowOrTab();
        windowHelpers.switchToWindow(0);
    }

    public void clickOnReplaceButton(){
        elementsHelper.clickElement(replaceWindowButton);
        driver.navigate().back();
    }

    public void clickOnNewWindowButton(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(newWindowButton).perform();
        elementsHelper.clickElement(newWindowButton);
        windowHelpers.switchToWindow(1);
        windowHelpers.closeWindowOrTab();
        windowHelpers.switchToWindow(0);
    }

    public void goBackToHomePage(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(homePageButton);
        elementsHelper.clickElement(homePageButton);
    }

    public void returnToTheTopPage(){
        elementsHelper.clickElement(moveToTop);
    }

    @Override
    public void isPageLoaded() {

    }
}
