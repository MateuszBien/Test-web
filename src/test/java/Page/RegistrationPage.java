package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    @FindBy(xpath = "//*[@id=\"user_email\"]")
    private WebElement mail;

    @FindBy(xpath = "//*[@id=\"user_password\"]")
    private WebElement password;

    @FindBy(xpath = "//*[@id=\"user_terms\"]")
    private WebElement accept;

    @FindBy(xpath = "//*[@id=\"new_user\"]/div[5]/input")
    private WebElement submit;

    public RegistrationPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
    public void registreWithUserMailAndPassword(String mail, String password) {
        this.mail.sendKeys(mail);
        this.password.sendKeys(password);
        accept.click();
        submit.click();
    }
}
