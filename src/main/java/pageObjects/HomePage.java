package pageObjects;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage
{
    WebDriver driver;
    WebDriverWait wait;

    //locators
    @FindBy(linkText = "Register") public WebElement registerLink;
//    @FindBy(linkText = "Register") public WebElement registerLink;
    @FindBy(linkText = "Login") public WebElement loginLink;
    @FindBy(linkText = "Raspberry Pi") public WebElement RaspberryPiLink;
    @FindBy(linkText = "Feather") public WebElement FeatherLink;
    @FindBy(linkText = "micro:bit") public WebElement microbitLink;
    @FindBy(linkText = "Arduino") public WebElement ArduinoLink;
    @FindBy(linkText = "Kits") public WebElement KitsLink;
    @FindBy(linkText = "Breakouts") public WebElement BreakoutsLink;
    @FindBy(linkText = "Components") public WebElement ComponentsLink;
    @FindBy(linkText = "Tools") public WebElement ToolsLink;
    @FindBy(linkText = "Kids") public WebElement KidsLink;
    @FindBy(id="search_input") public WebElement searchTextBox;
    @FindBy(className = "submit") public WebElement SubmitBtn;
    @FindBy(partialLinkText = "display: inline-block;") public WebElement currencyOption;
    @FindBy(xpath = "//a[@data-currency='GBP']") public WebElement currencyGBP;
    @FindBy(xpath = "//a[@data-currency='USD']") public WebElement currencyUSD;

    //data-currency="USD"
    //Create a Pimoroni Shop account;
    @FindBy(className="search-box-button") public WebElement searchBtn;

    @FindBy(linkText = "Log out") public WebElement logoutLink;

   public HomePage(WebDriver driver)
   {
       this.driver=driver;
       PageFactory.initElements(driver,this);
   }
    //actions
   public void clickRegisterLink()
   {
       registerLink.click();
   }

    public void clickLoginLink()
    {
       loginLink.click();
    }

    public void enterSearchText(String productName)
    {
        searchTextBox.sendKeys(productName);
    }

    public void clickRaspberryPiLink()
    {
        RaspberryPiLink.click();
    }
    public void clickFeatherLink()
    {
        FeatherLink.click();
    }
    public void clickmicrobitLink()
    {
        microbitLink.click();
    }
    public void clickArduinoLink()
    {
        ArduinoLink.click();
    }
    public void clickKitsLink()
    {
        KitsLink.click();
    }
    public void clickBreakoutsLink()
    {
        BreakoutsLink.click();
    }
    public void clickComponentsLink()
    {
        ComponentsLink.click();
    }
    public void clickToolsLink()
    {
        ToolsLink.click();
    }
    public void clickKidsLink()
    {
        KidsLink.click();
    }
    public void clickcurrencyOption()
    {
        currencyOption.click();
    }
    public void clickcurrencyGBP()
    {
        currencyGBP.click();
    }
    public void clickcurrencyUSD()
    {
        currencyUSD.click();
    }

//    public void clickSearchButton()
//    {
//        SubmitBtn.click();
//    }
//    public void clickSearchButton()
//    {
//        SubmitBtn.click();
//    }
//    public void clickSearchButton()
//    {
//        SubmitBtn.click();
//    }
    public void clickSearchButton()
    {
        SubmitBtn.click();
    }





   public  void verifyLogout()
   {
       wait = new WebDriverWait(driver,30);
       wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
       logoutLink.click();
   }




    public void navigateToUrl(String url)
    {
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }



}
