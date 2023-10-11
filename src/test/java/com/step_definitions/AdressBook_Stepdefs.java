package com.step_definitions;

import com.pages.AdressBookPage;
import com.utilities.BrowserUtils;
import com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class AdressBook_Stepdefs {
    AdressBookPage adressBookPage = new AdressBookPage();

    @Then("Click to My Account Tab")
    public void clickToMyAccountTab() {
        adressBookPage.myAdressBookmthd();


    }


    @And("Click the Addresses icon")
    public void clickTheAddressesIcon() {
        adressBookPage.gotoAdresses();
    }

    @Then("Click the Add New Button")
    public void clickTheAddNewButton() {
        adressBookPage.Add_New_Adress.click();
    }

    @Then("The user enter valid new Address Book credential {string}, {string},{string},{string},{string},{string},")
    public void theUserEnterValidNewAddressBookCredential(String EMail, String Name, String LastName, String Adress, String Phone, String ZipCode) {
        adressBookPage.newaddressadd(EMail, Name, LastName, Adress, Phone, ZipCode);
    }

    @And("The user should be see {string},")
    public void theUserShouldBeSee(String Verify_Message) {

        Assert.assertEquals(adressBookPage.VerifyMsg.getText(), Verify_Message);
        adressBookPage.Delete.click();
        BrowserUtils.waitFor(2);
        WebDriver driver = Driver.get();
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }
}




