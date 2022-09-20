package Test;

import Page.AccountPage;
import Page.HomePage;
import Page.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutTest extends BaseTest{


    @Test
    public void addProductInCartTest(){

        homePage.setSearchField("A TALE OF TWO CITIES");
        homePage.clickSearchButton();
        searchResultsPage.isProductInList("A Tale of Two Cities");
        searchResultsPage.clickProductFromList("A Tale of Two Cities");
        productPage.clickCheckboxField();
        productPage.clickForToAddToCartField();
        checkoutPage.clickCheckoutField();
        homePage.clickAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField("andreea1988iusti2015@gmail.com");
        loginPage.setPasswordField("123456");
        loginPage.clickSubmitButton();
    }
}
