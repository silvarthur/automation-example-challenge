package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.Set;

public class InvoiceListPage extends BasePage {
    public By headerInvoiceListPage = By.cssSelector(("header h2"));
    public By buttonsInvoiceDetails = By.xpath("//a[text()='Invoice Details']");
    public InvoiceListPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPageHeader() {
        return getElement(headerInvoiceListPage);
    }

    public void clickOnInvoiceDetailsButton(int invoiceIndex) {
        clickOnElementFromList(getElements(buttonsInvoiceDetails), invoiceIndex);

        Set<String> windowHandles = driver.getWindowHandles();

        for(String windowHandle : windowHandles) {
            driver.switchTo().window(windowHandle);
        }
    }
}
