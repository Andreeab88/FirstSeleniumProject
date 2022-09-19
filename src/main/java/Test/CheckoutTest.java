package Test;

import Page.AccountPage;
import Page.HomePage;
import Page.LoginPage;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckoutTest {
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountPage accountPage;

    @Before
    public void initDriver(){

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);

        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    public void addProductInCartTest(){
        homePage.clickAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField("andreea1988iusti2015@gmail.com");
        loginPage.setPasswordField("123456");
        loginPage.clickSubmitButton();
    }
}
