package com.step_definitions;

import com.pages.LogoutPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStepdefs {
    LogoutPage logoutPage = new LogoutPage();

    @Given("Hover over  on My Account")
    public void hoverOverOnMyAccount() {
        logoutPage.hoverover();
    }

    @When("Click on the Log out")
    public void clickOnTheLogOut() {
        logoutPage.LogOut();
    }

    @Then("Verify that you are logged out")
    public void verifyThatYouAreLoggedOut() {
        logoutPage.hoverover();
        logoutPage.msg();
    }

    @Then("Click Back to page icon in browser")
    public void clickBackToPageIconInBrowser() {
        logoutPage.navigateback();
    }
}
