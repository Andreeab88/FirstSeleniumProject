package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {




    private WebDriver driver;

    public AccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".hello strong")
    private WebElement welcomeTextParagraph;

    @FindBy(id = "firstname")
    private WebElement firstnameField;

    @FindBy(id = "middlename")
    private WebElement middlenameField;

    @FindBy(id = "lastname")
    private WebElement lastnameField;

    @FindBy(id = "email_address")
    private WebElement emailField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(id = "confirmation")
    private WebElement confirmationField;

    @FindBy(id = "is_subscribed")
    private WebElement subscribedField;

    @FindBy(css = "button.button")
    private WebElement buttonSubmitField;

    @FindBy(css = ".welcome-msg")
    private WebElement welcomeMessage;

    public String getWelcomeText(){
        return welcomeTextParagraph.getText();
    }

    public void setFirstnameField(String value){
       firstnameField.sendKeys("value");
    }

    public void setMiddlenameField(String value){
       middlenameField.sendKeys("value");
    }

    public void setLastnameField(String value){
        lastnameField.sendKeys("value");
    }

    public void setEmailField(String value){
        emailField.sendKeys("value");
    }

    public void setPassField(String value){
       passwordField.sendKeys("value");
    }


    public void setConfirmField(String value){
        confirmationField.sendKeys("value");
    }


    public void clickSubcribedField(){
        subscribedField.click();
    }

    public void clickSubmitField(){
        buttonSubmitField.click();
    }

    public String getWelcomeMessage(){
       return welcomeMessage.getText();
    }
}
