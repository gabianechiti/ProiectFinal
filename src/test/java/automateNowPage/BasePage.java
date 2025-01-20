package automateNowPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import webHelper.AlertHelpers;
import webHelper.ElementsHelper;
import webHelper.FrameHelpers;
import webHelper.WindowHelpers;

public abstract class BasePage {

    //Vom folosi aceasta variabila in toate paginile care o sa mostenita Base Page;
    public WebDriver driver;
    public ElementsHelper elementsHelper;
    public AlertHelpers alertHelpers;
    public FrameHelpers frameHelpers;
    public WindowHelpers windowHelpers;

    //Facem un constructor care sa initializeze driver-ul;
    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.elementsHelper = new ElementsHelper(driver);
        this.alertHelpers = new AlertHelpers(driver);
        this.frameHelpers = new FrameHelpers(driver);
        this.windowHelpers = new WindowHelpers(driver);
        PageFactory.initElements(driver, this);
    }

    //Facem o metoda abstracta pe care fiecare pagina trebuie sa o implementeze pt a verifica daca pagina este incarcata corect;
    abstract void isPageLoaded();
}
