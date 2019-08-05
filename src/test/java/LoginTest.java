import Page.LoginPage;
import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class LoginTest extends Chromdriver {
        @Test
        public void loginTest(){
            webDriver.navigate().to("https://nakanapie.pl/konto/logowanie");
            LoginPage loginPage=new LoginPage(webDriver);
            loginPage.loginWithUserLoginAndPassword("snopson","password");
            assertTrue(webDriver.getCurrentUrl().contains("/pulpit"));}
        @Test
        public void loginTestIfIncorrectData() {
            webDriver.navigate().to("https://nakanapie.pl/konto/logowanie");
            LoginPage loginPage = new LoginPage(webDriver);
            loginPage.loginWithUserLoginAndPassword("Miotssssr@wp.pl","piter20t");
            assertFalse(webDriver.getCurrentUrl().contains("/incorrect)"));
        }
}
