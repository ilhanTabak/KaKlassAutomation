package com.pages;

import com.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(xpath = "//a[@id=\"64d943d5db5ea1d2fa4aa00f-menu\"]")
    public WebElement Alle_Produkte;
    @FindBy(xpath = "//*[@id=\"productList-64d945d9db5ea1d2fa0267ca\"]/a[1]/span/picture/img")
    public WebElement AddProduct;
    @FindBy(xpath = "/html/body/form[2]/div/div[1]/div[1]/div[2]/div[2]/div[2]/div/div[3]")
    public WebElement SizeAdd;
    @FindBy(xpath = "/html/body/form[2]/div/div[1]/div[1]/div[2]/div[3]/div[2]/button")
    public WebElement AddtoCart;
    @FindBy(xpath = "/html/body/div[9]/div[2]/div[4]/input")
    public WebElement ZumWarenKorbgehen ;
    @FindBy(xpath = "//*[@id=\"CartLeft\"]/div/div[1]/div[1]")
    public WebElement VerifyCart;
    @FindBy(xpath = "//*[@id=\"CartLeft\"]/div/div[2]/div[5]/button")
    public WebElement Löschen ;


public void clickAlleProduckt(){
    Alle_Produkte.click();
}
public void chooseeaddcheck(){
    AddProduct.click();
    BrowserUtils.waitFor(2);
    SizeAdd.click();
    BrowserUtils.waitFor(2);
    AddtoCart.click();
    BrowserUtils.waitFor(2);
    ZumWarenKorbgehen.click();

}
    public void msg() {
        String Verifiymsg = VerifyCart.getText();
        String ExpectedText = "Produkt";
        BrowserUtils.waitFor(2);
        Assert.assertEquals(ExpectedText, Verifiymsg);
       // Assert.assertTrue(ExpectedText.contains(Verifiymsg));
        BrowserUtils.waitFor(2);
        Löschen.click();
        Löschen.click();

    }
}
