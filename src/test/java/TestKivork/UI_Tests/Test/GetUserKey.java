package TestKivork.UI_Tests.Test;

import TestKivork.UI_Tests.Page.AutorizationPage;
import TestKivork.UI_Tests.Page.DashBoardUserPage;
import TestKivork.UI_Tests.Page.HomePage;
import TestKivork.UI_Tests.Page.IPAddressPage;
import org.testng.annotations.Test;

import java.io.FileWriter;
import java.io.IOException;

import static TestKivork.UI_Tests.Page.BasePage.EMAIL;
import static TestKivork.UI_Tests.Page.BasePage.PASSWORD;

public class GetUserKey extends TestInit {
    @Test
    public void getKeyUserRegister() throws IOException {
        new HomePage(driver).openURL();
        new HomePage(driver).clickFreeApiKeyButton().click();
        new IPAddressPage(driver).clickLoginButton().click();
        new AutorizationPage(driver).getEmailField().sendKeys(EMAIL);
        new AutorizationPage(driver).getPasswordField().sendKeys(PASSWORD);
        new AutorizationPage(driver).clickLogInButton().click();
        String userKay = new DashBoardUserPage(driver).getKay().getText();
        FileWriter writer = null;
        try {
            writer = new FileWriter("UserKay.txt", true);
            for (int i = 0; i < userKay.length(); i++) {
                writer.write(userKay.charAt(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            writer.close();
        }
    }
}
