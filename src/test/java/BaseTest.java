import io.github.bonigarcia.wdm.WebDriverManager;
import model.InvoiceDetailsPage;
import model.InvoiceListPage;
import model.LoginPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    private static WebDriver driver;
    protected static LoginPage loginPage;
    protected static InvoiceListPage invoiceListPage;
    protected static InvoiceDetailsPage invoiceDetailsPage;

    @BeforeAll
    public static void initAll() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        loginPage = new LoginPage(driver);
        invoiceListPage = new InvoiceListPage(driver);
        invoiceDetailsPage = new InvoiceDetailsPage(driver);
    }

    @BeforeEach
    public void init() {
        driver.get("https://automation-sandbox.herokuapp.com/");
    }

    @AfterEach
    public void tearDown() {
        driver.manage().deleteAllCookies();
    }

    @AfterAll
    public static void tearDownAll() {
        driver.quit();
    }
}
