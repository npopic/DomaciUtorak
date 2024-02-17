package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTest {


    @BeforeMethod

    public void pageSetUp() {

        driver.get("https://demoqa.com/");
    }


    @Test

    public void addingNewAccountFromExcel() throws InterruptedException {

        String firstName = excelReader.getStringData("QASheet", 2, 0);
        String lastName = excelReader.getStringData("QASheet", 2, 1);
        String email = excelReader.getStringData("QASheet", 2, 2);
        String age = String.valueOf(excelReader.getIntegerData("QASheet", 2, 3));
        String salary = String.valueOf(excelReader.getIntegerData("QASheet", 2, 4));
        String department = excelReader.getStringData("QASheet", 2, 5);


        homePage.clickOnElementsCard();
        sideBarPage.clickOnSideBarButton("Web Tables");
        webTablesPage.clickOnAddButton();
        webTablesPage.enterFirstName(firstName);
        webTablesPage.enterLastName(lastName);
        webTablesPage.enterEmail(email);
        webTablesPage.enterAge(age);
        webTablesPage.enterSalary(salary);
        webTablesPage.enterDepartment(department);
        webTablesPage.clickOnSubmitButton();

        Assert.assertTrue(webTablesPage.textMatch(firstName).isDisplayed());
        Assert.assertTrue(webTablesPage.textMatch(lastName).isDisplayed());
        Assert.assertTrue(webTablesPage.textMatch(age).isDisplayed());
        Assert.assertTrue(webTablesPage.textMatch(salary).isDisplayed());
        Assert.assertTrue(webTablesPage.textMatch(department).isDisplayed());


    }
}
