package TestKivork.UI_Tests.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }


    public WebElement getEmailField() {
        return driver.findElement(By.xpath("//input[@id='email']"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.xpath("//input[@id='password']"));
    }

    public WebElement getFirstNameField() {
        return driver.findElement(By.xpath("//input[@id='first_name']"));
    }

    public WebElement getLastNameField() {
        return driver.findElement(By.xpath("//input[@id='last_name']"));
    }

    public WebElement getAddressField() {
        return driver.findElement(By.xpath("//input[@id='address']"));
    }

    public WebElement getPostCodeField() {
        return driver.findElement(By.xpath("//input[@id='post_code']"));
    }
    public WebElement getCountryField() {
        return driver.findElement(By.xpath("//select[@id='country_code']"));
    }

    public WebElement getCityField() {
        return driver.findElement(By.xpath("//input[@id='city']"));
    }
    public WebElement clickRecaptchaBox(){
        return waitElementToBeClickable("(//div[@class='g-recaptcha'])[1]]");
    }

    public WebElement clickSignUpButton() {
        return waitElementToBeClickable("//label[@class= 'submit enabled']");
    }
}
