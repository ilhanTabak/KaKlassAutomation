package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SubCategoryPage extends BasePage{

    @FindBy(css = "[id='64d943d5db5ea1d2fa4aa00f-menu']")
    public WebElement alleProdukte;


    @FindBy(xpath = "//*[@id='productList-64d945d9db5ea1d2fa0267ca']/div[1]/a")
    public WebElement ErsteSchuhe;






}
