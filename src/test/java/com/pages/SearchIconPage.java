package com.pages;

import com.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchIconPage extends BasePage {
    @FindBy(xpath = "//*[@id=\"SearchBtn\"]/i")
    public WebElement searchIcon;
    @FindBy(id = "search-input")
    public WebElement searchInput;
    @FindBy(id = "search-btn")
    public WebElement searchButton;
    @FindBy(xpath = "//div[starts-with(@id,'productList-')]")
    public WebElement verifyListedProduct;

    public void SearchPositiveVerification() {
        BrowserUtils.verifyElementDisplayed(verifyListedProduct);
    }

    public void SearchNegativeVerification() {
        BrowserUtils.waitFor(1);
        BrowserUtils.verifyElementDisplayed(verifyListedProduct);
    }
}

