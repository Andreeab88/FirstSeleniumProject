package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    private WebDriver driver;

    public ProductPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    @FindBy(css = "input[type=checkbox")
    private WebElement checkboxField;

    @FindBy(css = ".add-to-cart-buttons")
    private WebElement addProductToCartField;



    public void clickCheckboxField(){
        checkboxField.click();
    }

    public void clickForToAddToCartField(){
addProductToCartField.click();
    }
}

