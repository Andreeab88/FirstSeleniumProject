import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {

    public void validRegisterTest(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");

        driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
driver.findElement(By.id("firstname")).sendKeys("Boboc");
driver.findElement(By.id("middlename"));
driver.findElement(By.id("lastname")).sendKeys("Andreea");
driver.findElement(By.id("email_address")).sendKeys("andreea1988iusti2015@gmail.com");
driver.findElement(By.id("password")).sendKeys("123456");
driver.findElement(By.id("confirmation")).sendKeys("123456");
driver.findElement(By.id("is_subscribed")).click();
driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button")).click();
driver.quit();

    }
}
