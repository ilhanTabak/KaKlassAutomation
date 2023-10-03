package com.step_definitions;

import com.pages.LoginPage;
import com.utilities.BrowserUtils;
import com.utilities.ConfigurationReader;
import com.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_step_def {
        LoginPage loginPage = new LoginPage();
        WebDriver driver;


        @Given("The user on the login page")
        public void the_user_on_the_login_page() {
                //Driver.get().get(ConfigurationReader.get("url"));
        }

        @When("The user enter valid credentials")
        public void theUserEnterValidCredentials() {
                loginPage.loginMethod();

        }

        @Then("The user can log in")
        public void the_user_can_log_in() {




        }


}