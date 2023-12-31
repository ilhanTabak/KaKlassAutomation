package com.step_definitions;

import com.pages.CartPage;
import com.pages.LogoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartIcon_Stepdefs {
    CartPage cartPage = new CartPage();
    LogoutPage logoutPage = new LogoutPage();

    @Given("Click on Alle Produkt")
    public void clickOnAlleProdukt() {
        cartPage.clickAlleProduckt();
    }

    @When("choose a product")
    public void chooseAProduct() {
        cartPage.chooseeaddcheck();
    }

    @Then("check card icon")
    public void checkCardIcon() {
        cartPage.msg();

    }

    @When("Click Cart Tab")
    public void clickCartTab() {
        cartPage.cartview();
    }

    @And("Check the cart page")
    public void checkTheCartPage() {
        cartPage.cartviewText();
    }

    @Then("Click to Checkout")
    public void clickToCheckout() {
        cartPage.Checkout();
        cartPage.complete_Checkout();
    }
}
