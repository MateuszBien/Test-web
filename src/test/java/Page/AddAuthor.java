package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddAuthor {

    private WebDriver webDriver;

    public WebDriver getWebDriver() {
        return webDriver;
    }


    @FindBy(xpath = "//input[@name='first_name']")
    private WebElement nameImput;

    @FindBy(xpath = "//input[@name='last_name']")
    private WebElement surnameImput;

    @FindBy(xpath ="//button[@class='btn btn-primary']")
    private WebElement submit;




    public AddAuthor(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }



    public void addAuthor(String name, String surname) throws InterruptedException {
        this.nameImput.sendKeys(name);
        this.surnameImput.sendKeys(surname);
        this.submit.click();
    }

    public void addAuthor(String name) throws InterruptedException {
        this.nameImput.sendKeys(name);
        this.submit.click();
    }

}
