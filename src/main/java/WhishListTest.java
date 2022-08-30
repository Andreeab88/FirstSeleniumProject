import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhishListTest {

    public void validWhishList(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(2) > a")).click();
driver.findElement(By.id("email")).sendKeys("andreea1988iusti2015@gmail.com");
driver.findElement(By.id("pass")).sendKeys("123456");
//driver.findElement(By.cssSelector("#login-form > div > div.col-2.registered-users > div.content.fieldset > ul > li:nth-child(3) > a")).click();
//driver.findElement(By.id("email_address")).sendKeys("andreea1988iusti2015@gmail.com");
//driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
driver.findElement(By.id("send2")).click();
driver.quit();


    }
}
