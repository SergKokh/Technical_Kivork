package TestKivork.UI_Tests.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoardUserPage extends BasePage{
    public DashBoardUserPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getKay() {
        return driver.findElement(By.xpath("//div[@class= 'alert_inner fw_400']"));
    }
}
