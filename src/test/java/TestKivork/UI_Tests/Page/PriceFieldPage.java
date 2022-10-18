package TestKivork.UI_Tests.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PriceFieldPage extends BasePage{


    public PriceFieldPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getRegisterField() {
        return waitElementToBeClickable("//a[@title='Sign up for the Free Plan']");
    }
}
