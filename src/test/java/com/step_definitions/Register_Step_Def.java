package com.step_definitions;

import com.pages.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_Step_Def {

RegisterPage registerPage=new RegisterPage();

    @Given("The user on the register page")
    public void the_user_on_the_register_page() {
        registerPage.registerPageMethod();
    }

    @When("The user enter valid credential")
    public void theUserEnterValidCredential() {



    }

    @Then("The user can make register")
    public void the_user_can_make_register() {

    }


}
