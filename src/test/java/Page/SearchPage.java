package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    private WebDriver webDriver;


    public WebDriver getWebDriver() {
        return webDriver;
    }

    @FindBy(xpath = "//input[@id='q']")
    private WebElement search;

    @FindBy(xpath = "/html/body/div[4]/div/form/div/div[2]/button")
    private WebElement submit;


    public SearchPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
    public void Search(String title) {
        this.search.sendKeys(title);
        submit.click();
    }
}
