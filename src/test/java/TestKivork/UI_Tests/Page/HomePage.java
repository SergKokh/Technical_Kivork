package TestKivork.UI_Tests.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void openURL(){
        driver.get("https://freegeoip.io/");
    }
    public WebElement clickFreeApiKeyButton(){
        return waitElementToBeClickable("//a[@class='go']");
    }
}
