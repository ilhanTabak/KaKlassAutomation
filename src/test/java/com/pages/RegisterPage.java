package com.pages;

import com.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

    LoginPage loginpage=new LoginPage();



    @FindBy(css = "[class=' icon-user-follow']")
    public WebElement anmeldung;

    public void registerPageMethod(){

        BrowserUtils.waitFor(2);
        loginpage.acceptButton.click();
        BrowserUtils.waitFor(2);
        loginpage.userBox.click();
        BrowserUtils.waitFor(2);
        anmeldung.click();

    }




}
