package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class BasePage {
    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }

    public WebElement getElement(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver.findElement(by);
    }

    public List<WebElement> getElements(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver.findElements(by);
    }

    public String getElementText(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver.findElement(by).getText();
    }

    public WebElement getElementByText(String text) {
        By by = By.xpath(String.format("//*[contains(text(), %s)]", text));

        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return driver.findElement(by);
    }

    protected void sendKeysToAnElement(By by, String input) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        driver.findElement(by).sendKeys(input);
    }

    protected void clickOnAnElement(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        driver.findElement(by).click();
    }

    protected void clickOnElementFromList(List<WebElement> listOfElements, int index) {
        listOfElements.get(index).click();
    }
}
