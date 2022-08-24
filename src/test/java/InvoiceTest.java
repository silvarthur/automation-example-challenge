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

        assertTrue(invoiceDetailsPage.validateFieldHostelName(hostelName));
        assertTrue(invoiceDetailsPage.validateInvoiceDate(invoiceDate));
        assertTrue(invoiceDetailsPage.validateDueDate(dueDate));
        assertTrue(invoiceDetailsPage.validateFieldInvoiceNumber(invoiceNumber));
        assertTrue(invoiceDetailsPage.validateBookingCode(bookingCode));
        assertTrue(invoiceDetailsPage.validateRoom(room));
        assertTrue(invoiceDetailsPage.validateTotalStayCount(totalStayCount));
        assertTrue(invoiceDetailsPage.validateTotalStayAmount(totalStayAmount));
        assertTrue(invoiceDetailsPage.validateCheckIn(checkIn));
        assertTrue(invoiceDetailsPage.validateCheckOut(checkOut));
        assertTrue(invoiceDetailsPage.validateCustomerDetails(customerDetails));
        assertTrue(invoiceDetailsPage.validateDepositNow(depositNow));
        assertTrue(invoiceDetailsPage.validateTaxAndVat(taxAndVat));
        assertTrue(invoiceDetailsPage.validateTotalAmount(totalAmount));
    }
}
