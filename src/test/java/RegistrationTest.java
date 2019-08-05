import Page.RegistrationPage;
import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class RegistrationTest extends Chromdriver {
    @Test
    public void registrationtest(){
        webDriver.navigate().to("https://nakanapie.pl/konto/rejestracja");
        RegistrationPage registrationPage = new RegistrationPage(webDriver);
        registrationPage.registreWithUserMailAndPassword("snopsxxzon","d122133dd");
        assertTrue(webDriver.getCurrentUrl().contains("/zarejestrowany"));
    }
    @Test
    public void registrationTestIfIncorrectData(){
        webDriver.navigate().to("https://nakanapie.pl/konto/rejestracja");
        RegistrationPage registrationPage = new RegistrationPage(webDriver);
        registrationPage.registreWithUserMailAndPassword("Piotr@wp.pl","piter20t");
        assertFalse(webDriver.getCurrentUrl().contains("/zarejestrowany"));
    }
}