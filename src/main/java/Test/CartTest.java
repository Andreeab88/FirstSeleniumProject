package Test;

import Page.AccountPage;
import Page.CartPage;
import Page.HomePage;
import Page.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartTest extends BaseTest{

    @Test

    public void deleteProductButtonFromCart() {
       homePage.setSearchField("A TALE OF TWO CITIES");
       homePage.clickSearchButton();
searchResultsPage.isProductInList("A Tale of Two Cities");
searchResultsPage.clickProductFromList("A Tale of Two Cities");
productPage.clickCheckboxField();
productPage.clickForToAddToCartField();
cartPage.clickToRemoveProductFromCart();
cartPage.getAssertText1();
Assert.assertEquals("You have no items in your shopping cart.",cartPage.getAssertText1());



        }

}
