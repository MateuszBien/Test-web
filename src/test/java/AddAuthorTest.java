import Page.AddAuthor;
import Page.CheckAdd;
import Page.LoginPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AddAuthorTest extends Chromdriver{
    @Test
    public void correctAddAuthor() throws InterruptedException {
        webDriver.navigate().to("https://nakanapie.pl/konto/logowanie");
        LoginPage loginPage=new LoginPage(webDriver);
        loginPage.loginWithUserLoginAndPassword("snopson", "password");
        webDriver.navigate().to("https://nakanapie.pl/autorzy/dodaj");
        AddAuthor addAuthor=new AddAuthor(webDriver);
        addAuthor.addAuthor("Adam","Mickiewicz");
        CheckAdd checkAdd=new CheckAdd(webDriver);
        assertTrue(checkAdd.getTitle().getText().contains("Adam Mickiewicz"));
    }

    @Test
    public void incorrectAddAuthour() throws InterruptedException {
        webDriver.navigate().to("https://nakanapie.pl/konto/logowanie");

        LoginPage loginPage=new LoginPage(webDriver);
        loginPage.loginWithUserLoginAndPassword("Henryk","Kowalski");

        webDriver.navigate().to("https://nakanapie.pl/autorzy/dodaj");
        AddAuthor addAuthor=new AddAuthor(webDriver);

        addAuthor.addAuthor("Julisz","Słowacki");
        assertTrue(webDriver.getCurrentUrl().contains("/dodaj"));
    }
}


