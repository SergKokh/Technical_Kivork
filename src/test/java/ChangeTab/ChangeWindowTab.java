package ChangeTab;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class ChangeWindowTab {

    WebDriver driver;

    public void changeTab() {
//        Створюємо лист "tabs" відкритих вкладок та заповнюємо його
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
//        за допомогою метода "switchTo()" переключємось на потрібну вкладку,
//        потрібну обираємо вказуючи в параметрі
//        метода "get" індекс необхідної
//        тобто, якщо треба переключитись на другу, то і = 2-1=1;
        driver.switchTo().window(String.valueOf(tabs.get(1)));

    }
}
