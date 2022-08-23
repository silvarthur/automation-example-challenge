import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest extends BaseTest {
    @ParameterizedTest
    @CsvFileSource(resources = "data/login-data.csv")
    public void shouldLoginSuccessfully(String username, String password) {
        loginPage.login(username, password);

        assertEquals("Invoice List", invoiceListPage.getPageHeader().getText());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "data/invalid-login-data.csv")
    public void shouldNotLoginWithInvalidCredentials(String username, String password) {
        loginPage.login(username, password);

        assertEquals("Wrong username or password.", loginPage.getErrorMessage());
    }
}
