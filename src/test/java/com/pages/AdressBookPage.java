package com.pages;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
public class AdressBookPage extends BasePage {
   
    @FindBy(css = "[href=\"/customer/info\"]")
    public WebElement MyAccountTab;
    @FindBy(xpath = "//*[@id=\"block-account-navigation\"]/ul/li[2]/a/span")
    public WebElement Adresses;
    @FindBy(css = "[onclick=\"location.href='/customer/addressadd'\"]")
    public WebElement Add_New_Adress;
    @FindBy(css = "[type=\"email\"]")
    public WebElement EmailCredantial;
    @FindBy(css = "[id=\"Address_FirstName\"]")
    public WebElement NameCredantial;
    @FindBy(css = "[id=\"Address_LastName\"]")
    public WebElement LastNameCredantial;
    @FindBy(css = "id=\"Address_CountryId\"")
    public WebElement CountryCredantial;
    @FindBy(css = "[id=\"Address_Address1\"]")
    public WebElement AdressCredantial;
    @FindBy(css = "[id=\"Address_PhoneNumber\"]")
    public WebElement PhoneCredantial;
    @FindBy(css = "[name=\"Address.ZipPostalCode\"]")
    public WebElement ZipCodeCredantial;
    @FindBy(xpath = "//*[@class='btn btn-info save-address-button']")
    public WebElement SaveButton;
    @FindBy(xpath = "//*[@id=\"customerAccount\"]/div/div/div[2]/div/div/div/div[1]")
    public WebElement VerifyMsg;
    @FindBy(css = "[class=\"fl col-12 Delete\"]")
    public WebElement Delete;

    public void myAdressBookmthd() {
        MyAccountTab.click();
    }

    public void gotoAdresses() {
        Adresses.click();
    }

    public void newaddressadd(String EMail, String Name, String LastName,  String Adress, String Phone, String ZipCode) {

        EmailCredantial.sendKeys(EMail);
        NameCredantial.sendKeys(Name);
        LastNameCredantial.sendKeys(LastName);
//       Select select = new Select(CountryCredantial);
//        select.selectByVisibleText(Country);
        WebDriver driver = Driver.get();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700);");
        AdressCredantial.sendKeys(Adress);
        PhoneCredantial.sendKeys(Phone);
        JavascriptExecutor jss = (JavascriptExecutor) driver;
        jss.executeScript("window.scrollBy(0,200);");
        ZipCodeCredantial.sendKeys(ZipCode);
        SaveButton.click();
       // WebElement popupElement=driver.findElement(By)
    }

}
