package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private By fieldUsername = By.name("username");
    private By fieldPassword = By.name("password");
    private By buttonLogin = By.id("btnLogin");

    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void login(String username, String password) {
        sendKeysToAnElement(fieldUsername, username);
        sendKeysToAnElement(fieldPassword, password);
        clickOnAnElement(buttonLogin);
    }
}
