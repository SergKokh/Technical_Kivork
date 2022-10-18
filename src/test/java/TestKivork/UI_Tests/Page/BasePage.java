package TestKivork.UI_Tests.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    protected static WebDriver driver;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }
    public final static String EMAIL = "ivanTest147@gmail.com";
    public final static String PASSWORD = "27112003";
    public final static String FIRSTNAME = "Ivan";
    public final static String LASTNAME = "Ivanov";
    public final static String ADDRESS = "Grushevskogo st.";
    public final static String POSTCODE = "07400";
    public final static String COUNTRY = "Ukraine";
    public final static String CITY = "Brovary";

    private static final Duration BASIC_TIME = Duration.ofSeconds(15);

    public List<WebElement> waitVisibilityOfAllElementsLocatedBy(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, BASIC_TIME);
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
    }
    public WebElement waitElementToBeClickable(String locator) {
        WebDriverWait wait = new WebDriverWait(driver, BASIC_TIME);
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }
}
