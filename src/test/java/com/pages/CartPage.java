package com.pages;

import com.utilities.BrowserUtils;
import com.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CartPage extends BasePage {

    
    WebDriver driver;
    @FindBy(xpath = "//a[@id=\"64d943d5db5ea1d2fa4aa00f-menu\"]")
    public WebElement Alle_Produkte;
    @FindBy(css = "[alt='Blazer - Grün']")
    public WebElement AddProduct;
    @FindBy(xpath = "//*[@id='sizeList']/div[3]/label/span[2]")
    public WebElement SizeAdd;
    @FindBy(css = "[data-productid='64d945acdb5ea1d2faf3c7d5']")
    public WebElement AddtoCart;

    @FindBy(css = "[class='fl col-12 sPrice']")
    public WebElement VerifyCart;
    @FindBy(css = "[class='removeBtn']")
    public WebElement Löschen;
    @FindBy(css = "[class='Cart']")
    public WebElement CartIcon_Tikla;
    @FindBy(css = "[class='fl col-12 text-center SubTitle']")
    public WebElement CartIcon_TextVerify;
    @FindBy(css = "[class='btn btn-go']")
    public WebElement zu_kaufskorb_gehen;
    @FindBy(css = "[onclick='DeleteShopItem(this);']")
    public WebElement Remove;


    public void clickAlleProduckt() {
        Alle_Produkte.click();
    }

    public void chooseeaddcheck() {

        driver = Driver.get();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700);");
        AddProduct.click();

        BrowserUtils.waitFor(2);
        SizeAdd.click();
        BrowserUtils.waitFor(2);
        AddtoCart.click();

    }

    public void msg() {
        String actuelText = VerifyCart.getText();
        String expectedText = "€229,99";
        BrowserUtils.waitFor(2);
        Assert.assertEquals(actuelText, expectedText);
        BrowserUtils.waitFor(2);
        Löschen.click();

    }

    public void cartview() {
        CartIcon_Tikla.click();

    }

    public void cartviewText() {
        String actuelText = CartIcon_TextVerify.getText();
        String expectedText = "Sie haben keine Artikel in Ihrem Warenkorb.";
        BrowserUtils.waitFor(2);
        Assert.assertEquals(actuelText, expectedText);
        BrowserUtils.waitFor(2);
    }

    public void Checkout() {
        String actuelText = VerifyCart.getText();
        String expectedText = "€229,99";
        BrowserUtils.waitFor(2);
        Assert.assertEquals(actuelText, expectedText);
        BrowserUtils.waitFor(2);

    }

    public void complete_Checkout() {
        zu_kaufskorb_gehen.click();
        Remove.click();
        Remove.click();
    }
}
