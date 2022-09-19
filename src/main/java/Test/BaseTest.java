package Test;

import Page.AccountPage;
import Page.HomePage;
import Page.LoginPage;
import Page.SearchResultsPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    public WebDriver driver;
    public HomePage homePage;
    public LoginPage loginPage;
    public AccountPage accountPage;
    public SearchResultsPage searchResultsPage;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        accountPage = new AccountPage(driver);
        searchResultsPage = new SearchResultsPage(driver);

        driver.get("http://testfasttrackit.info/selenium-test/");
    }


    public void wait(int seconds){
        try{
            Thread.sleep(seconds*1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @After

    public void closeDriver(){
        driver.quit();
    }

}
