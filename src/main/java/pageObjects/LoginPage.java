package pageObjects;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage
{
    WebDriver driver;


    @FindBy(id="Email") public WebElement emailTextBox;

    @FindBy(id="Password") public WebElement passwordTextBox;

    @FindBy(className="login-button") public WebElement loginBtn;




    public LoginPage(WebDriver driver)
    {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }


    public void loginToApp(String em,String pw)
    {
        emailTextBox.sendKeys(em);
        passwordTextBox.sendKeys(pw);
        loginBtn.click();

    }


    public void enterEmail(String em)
    {
        emailTextBox.sendKeys(em);


    }

    public void enterPassword(String pw)
    {

        passwordTextBox.sendKeys(pw);


    }

    public void clickLogin()
    {

        loginBtn.click();

    }






}
