package com.pages;

import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    WebDriver driver;


    @FindBy(css = "[id='cookie-ok']")
    public WebElement acceptButton;

@FindBy(css = "[class='icon-user']")
    public WebElement userBox;

    @FindBy(css = "[class='userlink-login']")
    public WebElement userLogin;

    @FindBy(css = "[type='email']")
    public WebElement userName;
    @FindBy(css = "[type='password']")
    public WebElement password;

    @FindBy(css = "[id='LoginBtn']")
    public WebElement submit;


    public void loginMethod(){

      acceptButton.click();
        BrowserUtils.waitFor(2);
       userBox.click();
        BrowserUtils.waitFor(2);
      userLogin.click();

        driver= Driver.get();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200);");

        userName.sendKeys(ConfigurationReader.get("username"));
        password.sendKeys(ConfigurationReader.get("password"));
        BrowserUtils.waitFor(2);
        submit.click();




    }






}
