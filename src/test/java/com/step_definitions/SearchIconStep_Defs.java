package com.step_definitions;

import com.pages.SearchIconPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchIconStep_Defs {
    SearchIconPage searchFunktion = new SearchIconPage();

    @Given("Click on the search icon")
    public void clickOnTheSearchIcon() {
        searchFunktion.searchIcon.click();
    }

    @When("Enter the {string} in the search bar")
    public void enterTheInTheSearchBar(String ProductName) {
        searchFunktion.searchInput.click();
        searchFunktion.searchInput.sendKeys(ProductName);
    }

    @Given("Click on the search button")
    public void clickOnTheSearchButton() {
        searchFunktion.searchButton.click();
    }

    @Then("Verify that the searched Product Name is displayed in the search result")
    public void verifyThatTheSearchedIsDisplayedInTheSearchResult() {
        searchFunktion.SearchPositiveVerification();
    }

    @Then("Verify that the message {string} is displayed")
    public void verifyThatTheMessageProductNotFoundIsDisplayed() {
        searchFunktion.SearchNegativeVerification();
    }
}
