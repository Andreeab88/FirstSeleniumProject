package Test;

import Page.AccountPage;
import Page.HomePage;
import Page.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTest extends BaseTest{


    @Test
    public void validLoginTest(){
        homePage.clickAccountLink();
        homePage.clickLoginLink();
        loginPage.setEmailField("andreea1988iusti2015@gmail.com");
        loginPage.setPasswordField("123456");
        loginPage.clickSubmitButton();
        Assert.assertEquals("Hello, Boboc Andreea!",accountPage.getWelcomeText());

    }

@Test
public void changeLanguage(){
        homePage.setLanguageField("German");



}



}
