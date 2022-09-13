import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
    private WebDriver driver;

    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
     driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }
@Test
    public void validRegisterTest(){
        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
driver.findElement(By.id("firstname")).sendKeys("Boboc");
driver.findElement(By.id("middlename")).sendKeys("");
driver.findElement(By.id("lastname")).sendKeys("Andreea");
driver.findElement(By.id("email_address")).sendKeys("andreea1988iusti2015@gmail.com");
driver.findElement(By.id("password")).sendKeys("123456");
driver.findElement(By.id("confirmation")).sendKeys("123456");
driver.findElement(By.id("is_subscribed")).click();
driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();
    WebElement registerText = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.account-create > ul > li > ul > li > span"));
    Assert.assertEquals("There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.", registerText.getText());
    }

    @After

    public void closeDriver(){
        driver.quit();
    }
}
