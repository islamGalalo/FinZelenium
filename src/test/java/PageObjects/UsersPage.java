package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UsersPage {
    WebDriver driver;
    By clickUserManagement = By.xpath("//span[normalize-space()='User Mangement']");
    By clickUsers = By.xpath("//span[normalize-space()='Users']");
    By clickCreateUser = By.xpath("//span[normalize-space()='Create New']");
    By addUsername = By.id("userName");
    By addUserType = By.xpath("//span[@aria-label='User Type']");
    By chooseUserType = By.xpath("//span[normalize-space()='System Admin']");
    By addNameEn = By.id("englishFirstName");
    By addNameAR = By.id("arabicFirstName");
    By addEmail = By.id("emailAddress");
    By addPhone = By.id("phoneNumber");
    By addPassword = By.xpath("//input[@placeholder='Enter your password...']");
    By addConfirmPassword = By.id("confirmPassword");

    By clickSave = By.xpath("//span[normalize-space()='Save']");


    public UsersPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickUserManagement() {
        driver.findElement(clickUserManagement).click();
        driver.findElement(clickUsers).click();
    }

    public void clickCreateUser() {
        driver.findElement(clickCreateUser).click();
    }

    public void addUsername() {
        driver.findElement(addUsername).sendKeys("mohamed");
    }

    public void addUserType() {
        driver.findElement(addUserType).click();
        driver.findElement(chooseUserType).click();
    }

    public void addNameEn() {
        driver.findElement(addNameEn).sendKeys("MOH");
    }

    public void addNameAR() {
        driver.findElement(addNameAR).sendKeys("محمد");
    }

    public void addEmail() {
        driver.findElement(addEmail).sendKeys("isl@gmail.com");
    }

    public void addPhone() {
        driver.findElement(addPhone).sendKeys("555444888");
    }

    public void addPassword() {
        driver.findElement(addPassword).sendKeys("@dm!n@C0r$95");
    }

    public void addConfirmPassword() {
        driver.findElement(addConfirmPassword).sendKeys("@dm!n@C0r$95");
    }

    public void clickSave() {
        driver.findElement(clickSave).click();
    }

}
