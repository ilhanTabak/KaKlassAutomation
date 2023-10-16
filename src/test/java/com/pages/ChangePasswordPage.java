package com.pages;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ChangePasswordPage extends BasePage {
    @FindBy(css = "[class='icon-user']")
    public WebElement meinKontoHoverOver;

    @FindBy(css = "[href=\"/customer/info\"]")
    public WebElement meinKontoButton;

    @FindBy(xpath = "//span[text()='Passwort ändern']")
    public WebElement PasswordAndernButton;

    @FindBy(xpath = "//*[@id=\"OldPassword\"]")
    public WebElement oldPasswordBox;

    @FindBy(xpath = "//*[@id=\"NewPassword\"]")
    public WebElement newPasswordBox;

    @FindBy(xpath = "//*[@id=\"ConfirmNewPassword\"]")
    public WebElement confirmNewPasswordBox;

    @FindBy(xpath = "//input[@value='Passwort ändern']")
    public WebElement PasswordAndernConfirmButton;

    @FindBy(xpath = "//*[@id=\"customerAccount\"]/div/div/div[2]/form/section")
    public WebElement successfullyMessage;

    @FindBy(css = "[class='field-validation-error']")
    public WebElement errorMessageFiveCharacter;

    @FindBy(xpath = "//*[@id=\"customerAccount\"]/div/div/div[2]/form/div/div[6]/span")
    public WebElement ErrorMessageDifferentPassword;


    public void hoveroverMeinKOnto() {
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(meinKontoHoverOver).perform();
    }

    public void verifyChangePasswordSuccessfullyMessage(){
        BrowserUtils.verifyElementDisplayed(successfullyMessage);
    }

    public void verifyErrorMessageForFiveCharacters(){
        BrowserUtils.verifyElementDisplayed(errorMessageFiveCharacter);
    }

    public void verifyErrorMessageForTwentyOneCharacters(){
        String actuelText = successfullyMessage.getText();
        String expectedText = "Ihr Passwort muss maximal 20 Zeichen enthalten.";
        BrowserUtils.waitFor(2);
        Assert.assertEquals(actuelText, expectedText);
    }

    public void verifyErrorMessageDifferentPassword(){
        BrowserUtils.verifyElementDisplayed(ErrorMessageDifferentPassword);
    }

}
