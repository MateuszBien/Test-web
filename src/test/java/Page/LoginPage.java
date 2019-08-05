package Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    @FindBy(xpath = "//input[@id='user_login']")
    private WebElement login;

    @FindBy(xpath = "//input[@id='user_password']")
    private WebElement password;

    @FindBy(xpath = "//input[@name='commit']")
    private WebElement submit;

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
    public void loginWithUserLoginAndPassword(String login, String password) {
        this.login.sendKeys(login);
        this.password.sendKeys(password);
        submit.click();
    }
}
