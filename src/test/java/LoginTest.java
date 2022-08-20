import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class LoginTest extends BaseTest {
    @ParameterizedTest
    @CsvFileSource(resources = "data/login-data.csv")
    public void shouldLoginSuccessfully(String username, String password) {
        loginPage.login(username, password);
    }
}
