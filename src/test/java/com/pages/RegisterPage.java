package com.pages;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class RegisterPage extends BasePage{

 WebDriver driver;

    LoginPage loginpage=new LoginPage();
    Random randomNum2 = new Random();



    @FindBy(css = "[class=' icon-user-follow']")
    public WebElement anmeldung;

    @FindBy(css = "[id='FirstName']")
    public WebElement firstName;

    @FindBy(css = "[id='LastName']")
    public WebElement lastName;

    @FindBy(css = "[id='Email']")
    public WebElement eMail;

    @FindBy(css = "[id='Password']")
    public WebElement PasswordRegister;

    @FindBy(css = "[id='ConfirmPassword']")
    public WebElement confirmPassword;

    @FindBy(xpath = "//*[@id='T1']/div[6]/div/label/span[1]")
    public WebElement stimmeClick;



    public void registerPageMethod(){

        BrowserUtils.waitFor(2);
        loginpage.acceptButton.click();
        BrowserUtils.waitFor(2);
        loginpage.userBox.click();
        BrowserUtils.waitFor(2);
        anmeldung.click();
        driver= Driver.get();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200);");
        firstName.sendKeys("Soft");
        lastName.sendKeys("Skill");
        int randomNummer = randomSayi();
        eMail.sendKeys("abc" + randomNummer + "@gmail.com");


    }
    public int randomSayi() {
        int randomNummer2 = randomNum2.nextInt(10000);
        return randomNummer2;
    }




}
