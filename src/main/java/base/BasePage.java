package base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import utils.DriverFactory;
import utils.DriverUtils;

import java.io.FileInputStream;
import java.util.Properties;

public class BasePage
{

    public static WebDriver driver;
    public static HomePage homePage;
    public static LoginPage loginPage;
    public static RegisterPage registerPage;
    public static DriverUtils driverUtils;


    public static void initPages()
    {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        homePage = new HomePage(DriverFactory.driver);
        loginPage = new LoginPage(DriverFactory.driver);
        registerPage = new RegisterPage(DriverFactory.driver);
        driverUtils = new DriverUtils();
    }



//    @After
//    public static void tearDown()
//    {
//        driver.close();
//    }
//


}
