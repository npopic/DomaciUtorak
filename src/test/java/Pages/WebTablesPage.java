package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTablesPage {

    WebDriver driver;
    WebElement firstNameBox;
    WebElement lastNameBox;
    WebElement emailBox;
    WebElement ageBox;
    WebElement salaryBox;
    WebElement departmentBox;

    WebElement submitButton;

    WebElement addButton;
    String firstName, lastName, email, age, salary, department;

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    public WebElement getFirstNameBox() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastNameBox() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmailBox() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getAgeBox() {
        return driver.findElement(By.id("age"));
    }

    public WebElement getSalaryBox() {
        return driver.findElement(By.id("salary"));
    }

    public WebElement getDepartmentBox() {
        return driver.findElement(By.id("department"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public List<WebElement> getField() {
        return driver.findElements(By.className("rt-td"));
    }
    public WebElement textMatch (String text) {
        WebElement input = null;
        for (WebElement element : getField()) {
            if (element.getText().equals(text)) {
                input = element;
                break;
            }
        }
        return input;
    }

//-----------------------

    public void clickOnAddButton() {

        getAddButton().click();
    }

    public void clickOnSubmitButton() {
        getSubmitButton().click();
    }

    public void enterFirstName(String firstName) {

        getFirstNameBox().clear();
        getFirstNameBox().sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        getLastNameBox().clear();
        getLastNameBox().sendKeys(lastName);
    }

    public void enterEmail(String email) {
        getEmailBox().clear();
        getEmailBox().sendKeys(email);
    }

    public void enterAge(String age) {
        getAgeBox().clear();
        getAgeBox().sendKeys(age);
    }

    public void enterSalary(String salary) {
        getSalaryBox().clear();
        getSalaryBox().sendKeys(salary);
    }

    public void enterDepartment(String department) {
        getDepartmentBox().clear();
        getDepartmentBox().sendKeys(department);
    }

}