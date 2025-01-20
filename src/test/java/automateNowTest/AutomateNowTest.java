package automateNowTest;

import automateNowPage.CalendarsPage;
import automateNowPage.FillFormPage;
import automateNowPage.PopUpsPage;
import automateNowPage.WindowPage;
import org.testng.annotations.Test;

public class AutomateNowTest extends TestPage{

    @Test
    public void automateNowTest()  {
        FillFormPage fillFormPage = new FillFormPage(driver);
        fillFormPage.isPageLoaded();
        fillFormPage.FillEntireForm();
        PopUpsPage popUpsPage = new PopUpsPage(driver);
        popUpsPage.isPageLoaded();
        popUpsPage.allPopUpsFromThePage();
        WindowPage windowPage = new WindowPage(driver);
        windowPage.isPageLoaded();
        windowPage.actionsOnWindowPage();
        CalendarsPage calendarsPage = new CalendarsPage(driver);
        calendarsPage.isPageLoaded();
        calendarsPage.actionsOnCalendarsMenu();
    }
}
