package org.proiectfinal.proiectfinaltests;

import org.proiectfinal.FillFormPage;
import org.proiectfinal.HomePage;
import org.testng.annotations.Test;

public class AutomationExerciseTest extends TestPage {
    @Test
    public void testSite() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.isPageLoaded();
        homePage.setAcceptCookies();
        homePage.isPageLoaded();
        homePage.clickOnSignUpButton();
        FillFormPage fillFormPage = new FillFormPage(driver);
        fillFormPage.fillEntireForm();
    }
}
