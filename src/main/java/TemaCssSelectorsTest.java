import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TemaCssSelectorsTest {
    private WebDriver driver;

    @Before
    public void initDriver() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }

    //Creati CSS selectori pentru elementele din pozele de mai jos.
    //In crearea lor nu va limitati la poza de mai jos a elementului,
    // ci navigati in pagina la elementul respectiv si testati ca acel selector functioneaza.

    //1. Search icon:
// https://content.screencast.com/users/CosminDanCiocan/folders/Jing/media/9944a725-0a21-4f2f-8efb-06ed7c06bcb9/00000186.png
    @Test
    public void searchProduct() {
        driver.findElement(By.id("search")).sendKeys("women dress");
        driver.findElement(By.cssSelector("[title='Search']")).click();
        driver.findElement(By.cssSelector("[title='Lafayette Convertible Dress']")).click();


    }

    public static void wait(int seconds) {
        try {
            Thread.sleep(seconds * 2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @After
    public void closeDriver() {
        driver.quit();
    }

    //2. Delete product button(doar primul):
    // https://content.screencast.com/users/CosminDanCiocan/folders/Jing/media/206319dc-b933-452a-b29e-4c1c380bd4e5/00000187.png
    @Test
    public void deleteProductButton() {
        driver.findElement(By.id("search")).sendKeys("A TALE OF TWO CITIES");
        driver.findElement(By.cssSelector("[title='Search']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,-350)", "A Tale of Two Cities");
        driver.findElement(By.cssSelector("[title='A Tale of Two Cities']")).click();
driver.findElement(By.cssSelector("input[type=\"checkbox\"]")).click();
driver.findElement(By.cssSelector(".add-to-cart-buttons")).click();
driver.findElement(By.cssSelector(".btn-remove2 "));
        driver.findElement(By.cssSelector(".btn-remove")).submit();
        WebElement emptyCart= driver.findElement(By.cssSelector("p"));
        //Assert.assertEquals("You have no items in your shopping cart.","This is a demo store. Any orders placed through this store will not be honored or fulfilled.");

//3. Butonul proceed to checkout(doar cel de jos):
// https://content.screencast.com/users/CosminDanCiocan/folders/Jing/media/69ed1420-0b49-4d0d-871b-bf02ba5d9696/00000188.png
    driver.findElement(By.cssSelector(".cart .button")).click();

 //4. Select-ul de la Sort By(doar cel de sus):
        // https://content.screencast.com/users/CosminDanCiocan/folders/Jing/media/acc98dbc-4088-481b-b9fe-37aa59deb860/00000189.png
    driver.findElement(By.cssSelector("select")).click();
    }
}

