package Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest extends BaseTest{

@Test
    public void validRegisterTest() {

    homePage.clickAccountLink();
    homePage.clickregisteField();
    accountPage.setFirstnameField("Boboc");
    accountPage.setMiddlenameField("");
    accountPage.setLastnameField("Andreea");
    accountPage.setEmailField("andreea1988iusti2015@gmail.com");
    accountPage.setPassField("123456");
    accountPage.setConfirmField("123456");
    accountPage.clickSubcribedField();
    accountPage.clickSubmitField();
    Assert.assertEquals("WELCOME", accountPage.getWelcomeMessage());


}
}
