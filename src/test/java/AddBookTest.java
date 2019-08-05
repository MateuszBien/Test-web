import Page.AddBook;
import Page.LoginPage;
import org.testng.annotations.Test;

public class AddBookTest extends Chromdriver {

    @Test
    public void addBook() throws InterruptedException {
        webDriver.navigate().to("https://nakanapie.pl/konto/logowanie");
        LoginPage loginPage = new LoginPage(webDriver);
        loginPage.loginWithUserLoginAndPassword("snopson", "password");
        webDriver.navigate().to("https://nakanapie.pl/ksiazka/dodaj");
        AddBook addBook = new AddBook(webDriver);
        addBook.addBook("Atak Rozppaczy", "Ksiązka dziennie",
                "C:\\Users\\mateusz\\Desktop\\atak_rozpoaczy");
    }

    @Test
    public void addBookIncorect() throws InterruptedException {
        webDriver.navigate().to("https://nakanapie.pl/konto/logowanie");
        LoginPage loginPage=new LoginPage(webDriver);
        loginPage.loginWithUserLoginAndPassword("Henryk","Kowalski");
        webDriver.navigate().to("https://nakanapie.pl/ksiazka/dodaj");
        AddBook addBookPage=new AddBook(webDriver);
        addBookPage.addBook("","","");
    }
}
