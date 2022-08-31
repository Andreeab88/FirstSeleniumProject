import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddProductInWishListTest {

   

public void hoverOverCategoryTest(){

    System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("http://testfasttrackit.info/selenium-test/");
    Actions action = new Actions(driver);


    action.moveToElement(driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a"))).perform();

WebElement viewAllSale = driver.findElement(By.cssSelector ("#nav > ol > li.level0.nav-5.parent > ul > li.level1.view-all > a"));
viewAllSale.click();
    driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li > div > div.actions > a")).click();
    driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > ul.add-to-links > li:nth-child(1) > a")).click();
   driver.findElement(By.id("email")).sendKeys("andreea1988iusti2015@gmail.com");
    driver.findElement(By.id("pass")).sendKeys("123456");
   driver.findElement(By.id("send2")).click();
driver.quit();

    }


}
