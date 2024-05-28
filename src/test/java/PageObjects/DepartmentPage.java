package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DepartmentPage {
    WebDriver driver;
    By clickMasterData = By.xpath("//span[normalize-space()='Master Data']");
    By clickDepartment = By.xpath("//span[normalize-space()='Departments']");
    By clickCreateNew = By.xpath("//span[normalize-space()='Create New']");
    By addEngTitle = By.cssSelector("input[formcontrolname='titleEn']");
    By addArabicTitle = By.cssSelector("input[formcontrolname='titleAr']");

    By clickSave = By.xpath("//span[normalize-space()='Save']");

    By departmentCode = By.xpath("//a[normalize-space()='0013']");
    By editDepartment = By.xpath("//span[normalize-space()='Edit']");
    By editEnglishDesc = By.xpath("//input[@placeholder='English Description']");
    By editArabicDesc = By.xpath("//input[@placeholder='Arabic Description']");

    public DepartmentPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement clickMasterData() {
        return driver.findElement(clickMasterData);

    }
    public WebElement clickDepartment() {
        return driver.findElement(clickDepartment);

    }
    public WebElement clickCreateNew() {
        return driver.findElement(clickCreateNew);

    }
    public WebElement addEngTitle() {
        return driver.findElement(addEngTitle);

    }
    public WebElement addArabicTitle() {
        return driver.findElement(addArabicTitle);

    }


    public WebElement clickSave() {
        return driver.findElement(clickSave);

    }
    public WebElement depCode() {
        return driver.findElement(departmentCode);

    }
    public WebElement editDepart() {
        return driver.findElement(editDepartment);

    }
    public WebElement  editEnglishDescription() {
        return driver.findElement(editEnglishDesc);

    }
    public WebElement  editArabicDescription() {
        return driver.findElement(editArabicDesc);

    }

}
