package automateNowPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class PopUpsPage extends BasePage{

    @FindBy (xpath = "//*[@id=\"post-36\"]/div/div[2]/div/div[3]/div[1]/div/a")
    private WebElement popUpMenu;

    @FindBy (xpath = "//*[@id=\"alert\"]")
    private WebElement firstAlert;

    @FindBy (xpath = "//*[@id=\"confirm\"]")
    private WebElement confirmAlert;

    @FindBy (xpath = "//*[@id=\"prompt\"]")
    private WebElement promptAlert;

    @FindBy (xpath = "//*[@id=\"header\"]/div/a")
    private WebElement homePageButton;

    public PopUpsPage(WebDriver driver) {
        super(driver);
    }

    public void allPopUpsFromThePage(){
        goToPopUpMenu();
        firstAlert();
        confirmAlert();
        elementsHelper.threadSleep(200);
        promptAlert();
        goBackToHomePage();
    }

    public void goToPopUpMenu(){
        Actions actions = new Actions(driver);
        actions.scrollToElement(popUpMenu).perform();
        elementsHelper.clickElement(popUpMenu);
    }

    public void firstAlert(){
        elementsHelper.clickElement(firstAlert);
        alertHelpers.acceptAlert();
    }

    public void confirmAlert(){
        elementsHelper.clickElement(confirmAlert);
        alertHelpers.waitForAlert();
        alertHelpers.acceptAlert();
    }

    public void promptAlert(){
        elementsHelper.clickElement(promptAlert);
        alertHelpers.promptAlert("Gabriela");
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
