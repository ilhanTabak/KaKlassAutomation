package com.step_definitions;
import com.pages.LoginPage;
import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_step_def {
    LoginPage loginPage = new LoginPage();
    WebDriver driver;

    @Given("The user is logging in with valid credentials")
    public void theUserIsLoggingInWithValidCredentials() {
        loginPage.loginMethod();
    }

    @Given("The user click on the Mein Konto")
    public void theUserClickOnTheMeinKonto() {
        loginPage.acceptButton.click();
        loginPage.userBox.click();
        BrowserUtils.waitFor(2);
    }
    @Then("The user click on the Anmelden")
    public void theUserClickOnTheAnmelden() {
        loginPage.anmelden.click();
    }
    @Then("The user enter the correct E-mail und Password")
    public void theUserEnterTheCorrectEmailUndPassword() {
        loginPage.userName.sendKeys(ConfigurationReader.get("loginEmail"));
        BrowserUtils.waitFor(2);
        loginPage.password.sendKeys(ConfigurationReader.get("loginPassword"));
        BrowserUtils.waitFor(2);
    }
    @When("The user click the Anmelden button after entering the correct E-Mail and Password")
    public void theUserClickTheAnmeldenButtonAfterEnteringTheCorrectEmailAndPassword() {
        loginPage.anmeldenButton.click();
        BrowserUtils.waitFor(2);
    }
    @Then("The user should be successfully logged in")
    public void theUserShouldBeSuccessfullyLoggedIn() {
        Assert.assertEquals("Mein Konto", loginPage.meinKonto.getText());
    }
}
