import io.github.bonigarcia.wdm.WebDriverManager;
import model.LoginPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class BaseTest {
    private static WebDriver driver;
    protected static LoginPage loginPage;

    @BeforeAll
    public static void initAll() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        loginPage = new LoginPage(driver);
    }

    @BeforeEach
    public void init() {
        driver.get("https://automation-sandbox.herokuapp.com/");
    }

    @AfterAll
    public static  void tearDownAll() {
        driver.close();
    }
}
