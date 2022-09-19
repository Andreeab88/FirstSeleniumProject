package Test;

import Page.HomePage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchTest extends BaseTest{

@Test
public void searchForItemSearch(){

        homePage.setSearchField("necklace");
        homePage.clickSearchButton();
        Assert.assertTrue("Product not found!",searchResultsPage.isProductInList("SILVER DESERT NECKLACE"));
}

}
