package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage {

    WebDriver driver;
    List<WebElement> cardElements;
    JavascriptExecutor js;

    WebElement elementsCard;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    public List<WebElement> getElementsCard() {
        return driver.findElements(By.cssSelector(".card.mt-4.top-card"));

    }
//----------

    public void clickOnElementsCard() throws InterruptedException {

        for (WebElement cardElement : getElementsCard()) {
            if (cardElement.getText().equalsIgnoreCase("Elements")) {

                cardElement.click();

                break;
            }

        }
    }
}