package org.proiectfinal.proiectfinaltests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.proiectfinal.FillFormPage;
import org.proiectfinal.HomePage;
import org.testng.annotations.BeforeMethod;

public class TestPage {
public WebDriver driver;
public HomePage homePage;
public FillFormPage fillFormPage;



    @BeforeMethod

    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        homePage= new HomePage(driver);
        fillFormPage = new FillFormPage(driver);

        //Facem fereastra la dimensiunea maxima:
        driver.manage().window().maximize();

        //Facem fereastra la dimensiunea dorita: 1980 cu 1080
        // driver.manage().window().setSize(new Dimension(1980, 1080));

    }
//    @AfterMethod
//    public void quitBrowser(){
//        if (driver != null){
//            driver.quit();
//        }
//    }
}
