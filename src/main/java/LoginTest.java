import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTest {

    private WebDriver driver;

    @Before
    public void initDriver(){

        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    @Test
    public void validLoginTest(){
        driver.findElement(By.cssSelector(".skip-account")).click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("andreea1988iusti2015@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("123456");
        driver.findElement(By.id("send2")).click();
        WebElement welcomeText = driver.findElement(By.cssSelector(".hello strong"));
        Assert.assertEquals("Hello, Boboc Andreea!",welcomeText.getText());
    }

@Test
public void changeLanguage(){
        Select selectLanguageDropDown = new Select(driver.findElement(By.id("select-language")));
    selectLanguageDropDown.selectByVisibleText("German");


}
@After

    public void closeDriver(){
        driver.quit();
}



}
