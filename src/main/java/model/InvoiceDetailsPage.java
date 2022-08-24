package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InvoiceDetailsPage extends BasePage {
    public By fieldHostelName = By.tagName("h4");
    public By fieldInvoiceNumber = By.tagName("h6");
    public By fieldInvoiceDate = By.xpath("//span[text()='Invoice Date:']/..");
    public By fieldDueDate = By.xpath("//span[text()='Due Date:']/..");
    public By fieldBookingCode = By.xpath("//td[text()='Booking Code']/following-sibling::td");
    public By fieldRoom = By.xpath("//td[text()='Room']/following-sibling::td");
    public By fieldTotalStayCount = By.xpath("//td[text()='Total Stay Count']/following-sibling::td");
    public By fieldTotalStayAmount = By.xpath("//td[text()='Total Stay Amount']/following-sibling::td");
    public By fieldCheckIn = By.xpath("//td[text()='Check-In']/following-sibling::td");
    public By fieldCheckOut = By.xpath("//td[text()='Check-Out']/following-sibling::td");
    public By fieldCustomerDetails = By.xpath("//h5[text()='Customer Details']/following::div");
    public By fieldDepositNow = By.xpath("//h5[text()='Billing Details']/following::thead/following-sibling::tbody/tr/td[1]");
    public By fieldTaxAndVat = By.xpath("//h5[text()='Billing Details']/following::thead/following-sibling::tbody/tr/td[2]");
    public By fieldTotalAmount = By.xpath("//h5[text()='Billing Details']/following::thead/following-sibling::tbody/tr/td[3]");

    public InvoiceDetailsPage(WebDriver driver) {
        super(driver);
    }

    public boolean validateFieldHostelName(String expectedHostelName) {
        return driver.findElement(fieldHostelName).getText().equals(expectedHostelName);
    }

    public boolean validateFieldInvoiceNumber(String expectedInvoiceNumber) {
        return driver.findElement(fieldInvoiceNumber).getText().contains(expectedInvoiceNumber);
    }

    public boolean validateInvoiceDate(String expectedInvoiceDate) {
        return driver.findElement(fieldInvoiceDate).getText().contains(expectedInvoiceDate);
    }

    public boolean validateDueDate(String expectedDueDate) {
        return driver.findElement(fieldDueDate).getText().contains(expectedDueDate);
    }

    public boolean validateBookingCode(String expectedBookingCode) {
        return driver.findElement(fieldBookingCode).getText().equals(expectedBookingCode);
    }

    public boolean validateRoom(String expectedRoom) {
        return driver.findElement(fieldRoom).getText().equals(expectedRoom);
    }

    public boolean validateTotalStayCount(String expectedTotalStayCount) {
        return driver.findElement(fieldTotalStayCount).getText().equals(expectedTotalStayCount);
    }

    public boolean validateTotalStayAmount(String expectedTotalStayAmount) {
        return driver.findElement(fieldTotalStayAmount).getText().equals(expectedTotalStayAmount);
    }

    public boolean validateCheckIn(String expectedCheckIn) {
        return driver.findElement(fieldCheckIn).getText().equals(expectedCheckIn);
    }

    public boolean validateCheckOut(String expectedCheckOut) {
        return driver.findElement(fieldCheckOut).getText().equals(expectedCheckOut);
    }

    public boolean validateCustomerDetails(String expectedCustomerDetails) {
        return driver.findElement(fieldCustomerDetails).getText().replace('\n', ' ').equals(expectedCustomerDetails);
    }

    public boolean validateDepositNow(String expectedDepositNow) {
        return driver.findElement(fieldDepositNow).getText().equals(expectedDepositNow);
    }

    public boolean validateTaxAndVat(String expectedTaxAndVat) {
        return driver.findElement(fieldTaxAndVat).getText().equals(expectedTaxAndVat);
    }

    public boolean validateTotalAmount(String expectedTotalAmount) {
        return driver.findElement(fieldTotalAmount).getText().equals(expectedTotalAmount);
    }
}
