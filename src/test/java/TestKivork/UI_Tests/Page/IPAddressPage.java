package TestKivork.UI_Tests.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IPAddressPage extends BasePage{
    public IPAddressPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPriceField() {
        return waitElementToBeClickable("//li[@class='action cta']");
    }

    public WebElement clickLoginButton() {
        return driver.findElement(By.xpath("//a[@title= 'Log in to your account']"));
    }
}
