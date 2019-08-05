import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Chromdriver {

    public WebDriver webDriver;

    @BeforeClass
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        webDriver = new ChromeDriver();
    }

    @AfterClass
    public void closeChrome() {
        webDriver.close();
        webDriver.quit();
    }
}
