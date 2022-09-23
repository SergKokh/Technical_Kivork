package StaleElementReferenceException;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * Використовую для написання чистового кода;
 */
//  class  StaleElementReferenceException extends WebDriverException;
public class HandlingStaleElementReferenceException {
    WebDriver driver;
    WebDriverWait wait;
    private final int BASE_WAIT = 10;

    public HandlingStaleElementReferenceException(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(BASE_WAIT));
    }

    public WebElement waitClickableElement(String locator) {
        try {
            return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
        } catch (WebDriverException e) {
            throw new WebDriverException(e);
        }
    }

//    Порада: розміщати локатор в метод і використовувати
//    викликом цього метода
//    Ex: public WebElement getCart() {
//        return waitClickableElement("id='cart'");


    /**
     * Використовую для написання чернового кода;
     */
    public void sleep(long millisecond) {
        try {
            Thread.sleep(millisecond * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
