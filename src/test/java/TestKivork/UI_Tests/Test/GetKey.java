package TestKivork.UI_Tests.Test;

import TestKivork.UI_Tests.Page.RegistrationPage;
import TestKivork.UI_Tests.Page.HomePage;
import TestKivork.UI_Tests.Page.IPAddressPage;
import TestKivork.UI_Tests.Page.PriceFieldPage;
import org.testng.annotations.Test;

import static TestKivork.UI_Tests.Page.BasePage.*;

public class GetKey extends TestInit {

    @Test
    public void getAndWriteKey() {
        new HomePage(driver).openURL();
        new HomePage(driver).clickFreeApiKeyButton().click();
        new IPAddressPage(driver).getPriceField().click();
        new PriceFieldPage(driver).getRegisterField().click();
        new RegistrationPage(driver).getEmailField().sendKeys(EMAIL);
        new RegistrationPage(driver).getPasswordField().sendKeys(PASSWORD);
        new RegistrationPage(driver).getFirstNameField().sendKeys(FIRSTNAME);
        new RegistrationPage(driver).getLastNameField().sendKeys(LASTNAME);
        new RegistrationPage(driver).getAddressField().sendKeys(ADDRESS);
        new RegistrationPage(driver).getPostCodeField().sendKeys(POSTCODE);
        new RegistrationPage(driver).getCountryField().sendKeys(COUNTRY);
        new RegistrationPage(driver).getCityField().sendKeys(CITY);
        sleep(10);
        new RegistrationPage(driver).clickSignUpButton().click();


    }
}
