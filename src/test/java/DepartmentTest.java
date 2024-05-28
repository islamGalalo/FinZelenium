import PageObjects.DepartmentPage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class DepartmentTest extends LoginPageTest {


    DepartmentPage departmentPage;


    @Test (priority = 1 , alwaysRun = true)
    public void AddDepartment() throws InterruptedException {
        search();
        departmentPage = new DepartmentPage(driver);
        departmentPage.clickMasterData().click();
        departmentPage.clickDepartment().click();
        departmentPage.clickCreateNew().click();
        departmentPage.addEngTitle().sendKeys("titleDesc1");

        departmentPage.addArabicTitle().sendKeys("تفاصيل العنوان");
        departmentPage.clickSave().click();
        Thread.sleep(2000);

    }

    @Test (priority = 2)
    public void EditDepartment() {
        departmentPage = new DepartmentPage(driver);
        departmentPage.depCode().click();
        departmentPage.editDepart().click();
        departmentPage.editEnglishDescription().sendKeys("edited");
        departmentPage.addArabicTitle().clear();
        departmentPage.editArabicDescription().sendKeys("تفاصيل العنوانت");
        departmentPage.clickSave().click();
    }

}


