import Page.SearchBook;
import org.testng.annotations.Test;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

public class SearchBookTest extends Chromdriver {

    @Test
    public void searchbooktest() {
        webDriver.navigate().to("https://nakanapie.pl/szukaj/ksiazki");
        SearchBook searchbook = new SearchBook(webDriver);
        searchbook.Searchbook("Jeszcze będziemy szczęśliwi");
        assertNotNull(searchbook.getAuthor());
    }
}