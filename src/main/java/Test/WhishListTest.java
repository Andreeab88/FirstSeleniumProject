package Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhishListTest {
    private WebDriver driver;

    @Before
    public void initDriver(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }
@Test
public void whishLisHoverOverCategoryTest() {

    //Actions action = new Actions(driver);
    //action.moveToElement(driver.findElement(By.cssSelector("a.level0.has-children"))).perform();
   // WebElement viewAllSale = driver.findElement(By.cssSelector("ul.level0"));

    driver.findElement(By.cssSelector("a.level0.has-children"));
    driver.findElement(By.cssSelector("li.level1 a"));
}

public void wait(int seconds){
        try{
            Thread.sleep(seconds*1000L);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
}

@Test
    public void addProductInWishList(){

   // Actions action = new Actions(driver);
   // action.moveToElement(driver.findElement(By.cssSelector("a.level0.has-children"))).perform();
   // WebElement viewAllSale = driver.findElement(By.cssSelector("ul.level0"));
   /// viewAllSale.click();

    driver.findElement(By.cssSelector("a.level0.has-children"));

  driver.findElement(By.cssSelector("li.level1 a"));
    wait(3);
    driver.findElement(By.cssSelector("h2.product-name a")).click();
   // driver.findElement(By.cssSelector("a.wish-list")).click();
   // driver.findElement(By.id("email")).sendKeys("andreea1988iusti2015@gmail.com");
    //driver.findElement(By.id("pass")).sendKeys("123456");
   // driver.findElement(By.id("send2")).click();

   // WebElement whishListText = driver.findElement(By.cssSelector("#wishlist-table .product-name a"));
   // Assert.assertEquals("MY WISHLIST\n" +
    //        "QTY\tPRICE\t\t\n" +
   //         "Slim fit Dobby Oxford Shirt\t\n" +
     //       "SLIM FIT DOBBY OXFORD SHIRT\n" +
     //       "SKU MSJ003C\n" +
    //        "sddd\n" +
     //       "UPDATE WISHLIST\n" +
     //       "9\n" +
      //      "175,00 RON 140,00 RON\n" +
      //      "ADD TO CART\n" +
      //      "EDIT",whishListText.getText());

    
    }


    @After

    public void closeDriver(){
        driver.quit();
    }
}
