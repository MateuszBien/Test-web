package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckAdd {


    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }


    @FindBy(xpath = "//h1[@class='h hb mb-0']")
    private WebElement title;

    public CheckAdd(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
    public WebElement getTitle(){

        return this.title;
    }
}
