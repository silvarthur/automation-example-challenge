import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class InvoiceTest extends BaseTest {
    @ParameterizedTest
    @CsvFileSource(resources = "data/invoice-list-data.csv")
    public void shouldDisplayInvoiceSuccessfully(String username, String password, String hostelName,
                                                 String invoiceDate, String dueDate, String invoiceNumber,
                                                 String bookingCode, String customerDetails, String room,
                                                 String checkIn, String checkOut, String totalStayCount,
                                                 String totalStayAmount, String depositNow, String taxAndVat,
                                                 String totalAmount) {
        loginPage.login(username, password);

        invoiceListPage.clickOnInvoiceDetailsButton(0);

        assertTrue(invoiceDetailsPage.getElementByText(hostelName).isDisplayed());
        assertTrue(invoiceDetailsPage.getElementByText(invoiceDate).isDisplayed());
        assertTrue(invoiceDetailsPage.getElementByText(dueDate).isDisplayed());
        assertTrue(invoiceDetailsPage.getElementByText(invoiceNumber).isDisplayed());
        // assertTrue(invoiceDetailsPage.getElementByText(bookingCode).isDisplayed());
        // assertTrue(invoiceDetailsPage.getElementByText(customerDetails).isDisplayed());
        // assertTrue(invoiceDetailsPage.getElementByText(room).isDisplayed());
        // assertTrue(invoiceDetailsPage.getElementByText(checkIn).isDisplayed());
        // assertTrue(invoiceDetailsPage.getElementByText(checkOut).isDisplayed());
        // assertTrue(invoiceDetailsPage.getElementByText(totalStayCount).isDisplayed());
        // assertTrue(invoiceDetailsPage.getElementByText(totalStayAmount).isDisplayed());
        // assertTrue(invoiceDetailsPage.getElementByText(depositNow).isDisplayed());
        // assertTrue(invoiceDetailsPage.getElementByText(taxAndVat).isDisplayed());
        // assertTrue(invoiceDetailsPage.getElementByText(totalAmount).isDisplayed());
    }
}
