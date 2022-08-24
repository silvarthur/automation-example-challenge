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
        String elementText = getElementText(fieldHostelName);

        return elementText.equals(expectedHostelName);
    }

    public boolean validateFieldInvoiceNumber(String expectedInvoiceNumber) {
        String elementText = getElementText(fieldInvoiceNumber);

        return elementText.contains(expectedInvoiceNumber);
    }

    public boolean validateInvoiceDate(String expectedInvoiceDate) {
        String elementText = getElementText(fieldInvoiceDate);

        return elementText.contains(expectedInvoiceDate);
    }

    public boolean validateDueDate(String expectedDueDate) {
        String elementText = getElementText(fieldDueDate);

        return elementText.contains(expectedDueDate);
    }

    public boolean validateBookingCode(String expectedBookingCode) {
        String elementText = getElementText(fieldBookingCode);

        return elementText.equals(expectedBookingCode);
    }

    public boolean validateRoom(String expectedRoom) {
        String elementText = getElementText(fieldRoom);

        return elementText.equals(expectedRoom);
    }

    public boolean validateTotalStayCount(String expectedTotalStayCount) {
        String elementText = getElementText(fieldTotalStayCount);

        return elementText.equals(expectedTotalStayCount);
    }

    public boolean validateTotalStayAmount(String expectedTotalStayAmount) {
        String elementText = getElementText(fieldTotalStayAmount);

        return elementText.equals(expectedTotalStayAmount);
    }

    public boolean validateCheckIn(String expectedCheckIn) {
        String elementText = getElementText(fieldCheckIn);

        return elementText.equals(expectedCheckIn);
    }

    public boolean validateCheckOut(String expectedCheckOut) {
        String elementText = getElementText(fieldCheckOut);

        return elementText.equals(expectedCheckOut);
    }

    public boolean validateCustomerDetails(String expectedCustomerDetails) {
        String elementText = getElementText(fieldCustomerDetails);

        return elementText.replace('\n', ' ').equals(expectedCustomerDetails);
    }

    public boolean validateDepositNow(String expectedDepositNow) {
        String elementText = getElementText(fieldDepositNow);

        return elementText.equals(expectedDepositNow);
    }

    public boolean validateTaxAndVat(String expectedTaxAndVat) {
        String elementText = getElementText(fieldTaxAndVat);

        return elementText.equals(expectedTaxAndVat);
    }

    public boolean validateTotalAmount(String expectedTotalAmount) {
        String elementText = getElementText(fieldTotalAmount);

        return elementText.equals(expectedTotalAmount);
    }
}
