package com.pages;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LogoutPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"UserSection\"]/li[1]/a/span")
    public WebElement My_Account;
    @FindBy(xpath = "//a[@href=\"/logout\"]")
    public WebElement LogOut;
    @FindBy(xpath = "//a[@href=\"/login\"]")
    public WebElement AnmeldeButton;
    public void hoverover() {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(My_Account).perform();
    }
    public void LogOut() {
        BrowserUtils.waitFor(2);
        LogOut.click();
    }
    public void msg() {
        String Verifiymsg = AnmeldeButton.getText();
        String ExpectedText = "Anmelden";
        BrowserUtils.waitFor(2);
        Assert.assertEquals(Verifiymsg, "Anmelden");
        Assert.assertTrue(ExpectedText.contains(Verifiymsg));
    }
}
