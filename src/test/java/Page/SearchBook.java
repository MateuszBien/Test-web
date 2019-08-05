package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBook {

    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }

    @FindBy(xpath = "//input[@id='q']")
    private WebElement search;

    @FindBy(xpath = "/html/body/div[4]/div/form/div/div[2]/button")
    private WebElement submit;

    @FindBy(tagName = "/html/body/div[5]/div[2]/div/div[2]/text()")
    private WebElement author;

    @FindBy(tagName = "/html/body/div[5]/div[2]/div/div[2]/strong/a")
    private WebElement title;
    public SearchBook(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
    public void Searchbook(String title) {
        this.search.sendKeys(title);
        submit.click();

    }

    public WebElement getAuthor() {
       return  author;
    }
}

