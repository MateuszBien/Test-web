import Page.SearchPage;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;


public class SearchTest extends Chromdriver {
    @Test
    public void search() {
        webDriver.navigate().to("https://nakanapie.pl/szukaj/ksiazki");
        SearchPage searchPage = new SearchPage(webDriver);
        searchPage.Search("Das");
        assertTrue(webDriver.getTitle().contains("Das"));
    }
}