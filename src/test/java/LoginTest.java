import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class LoginTest extends BaseTest {
    @ParameterizedTest
    @CsvFileSource(resources = "data/login-data.csv")
    public void shouldLoginSuccessfully(String username, String password) {
        loginPage.login(username, password);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "data/invalid-login-data.csv")
    public void shouldNotLoginWithInvalidCredentials(String username, String password) {
        loginPage.login(username, password);
    }
}
