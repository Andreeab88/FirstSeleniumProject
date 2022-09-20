package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {



    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".skip-account")
    private WebElement accountLink;

    @FindBy(css = "[title='Log In']")
    private WebElement loginLink;

    @FindBy(id = "search")
    private WebElement searchField;

    @FindBy(css = ".search-button")
    private WebElement searchButton;

    @FindBy(id = "select-language")
    private WebElement selectLanguageField;

    @FindBy(css  = "[title='Register']")
    private WebElement registerField;



public void clickAccountLink(){
    accountLink.click();
}

public void clickLoginLink(){
    loginLink.click();
}

public void setSearchField(String value){
    searchField.sendKeys(value);
}

public void clickSearchButton(){
    searchButton.click();
}

public void setLanguageField(String value){
   Select selectLanguageDropDown = new Select((driver.findElement(By.id("select-language"))));
    selectLanguageDropDown.selectByVisibleText(value);
    //selectLanguageField.sendKeys(value);
}

public void clickregisteField(){
    registerField.click();
}

}
