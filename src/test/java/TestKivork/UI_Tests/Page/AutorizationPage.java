package TestKivork.UI_Tests.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutorizationPage extends BasePage{
    public AutorizationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailField() {
        return driver.findElement(By.id("email"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    public WebElement clickLogInButton() {
        return waitElementToBeClickable("//label[@class= 'submit']");
    }
}
