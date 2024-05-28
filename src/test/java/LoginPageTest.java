import PageObjects.LoginPage;
import org.testng.annotations.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageTest extends base {

    LoginPage loginPage;


    @Test
    public void search() {
        loginPage = new LoginPage(driver);
        loginPage.Username().sendKeys("admin");
        loginPage.Password().sendKeys("@dm!n@C0r$951%");
        loginPage.Submit().click();

    }

}
