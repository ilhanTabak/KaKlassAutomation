package com.pages;

import com.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchIconPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"SearchBtn\"]/i")
    public WebElement searchIcon;

    @FindBy(id="search-input")
    public WebElement searchInput;

    @FindBy(id="search-btn")
    public WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"productList-64d94508db5ea1d2fabbedab\"]/div[1]/a")
    public WebElement searchedProductText;

    @FindBy(xpath = "//*[@id=\"productList-64d945b8db5ea1d2faf98d7f\"]/a[2]/img")
    public WebElement searchedWishIcon;




    public void SearchPozitifVerification(){
        //String ActuelText = searchedProductText.getText();
        //String ExpectedText = ProductName;
        //Assert.assertTrue(ActuelText.contains(ExpectedText));

        BrowserUtils.verifyElementDisplayed(searchedWishIcon);


    }




}
