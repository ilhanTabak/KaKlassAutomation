package com.step_definitions;

import com.pages.BasePage;
import com.pages.ChangePasswordPage;
import com.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ChangePasswordPage_Step_Defs extends BasePage {
    ChangePasswordPage changePasswordFunktion = new ChangePasswordPage();

    @Given("Hover over on Mein Konto")
    public void hoverOverOnMeinKonto() {
        changePasswordFunktion.hoveroverMeinKOnto();
    }
    @Then("Click on the Mein Konto Button")
    public void clickOnTheMeinKontoButton() {
        changePasswordFunktion.meinKontoButton.click();
    }
    @Then("Click on the Password Andern Button")
    public void clickOnThePasswordAndernButton() {
        changePasswordFunktion.PasswordAndernButton.click();
    }
    @Then("Enter old password")
    public void enterOldPassword() {
        String oldPassword = "*kaclassictestteam#";
        changePasswordFunktion.oldPasswordBox.sendKeys(oldPassword);
    }
    @Then("Enter new password")
    public void enterNewPassword() {
        String newPassword = "kaclassictestNew";
        changePasswordFunktion.newPasswordBox.sendKeys(newPassword);
    }
    @Then("Enter new password again")
    public void enterNewPasswordAgain() {
        String newPassword = "kaclassictestNew";
        changePasswordFunktion.confirmNewPasswordBox.sendKeys(newPassword);
        BrowserUtils.waitFor(2);
    }
    @Then("Click on the Password Andern Confirm Button")
    public void clickOnThePasswordAndernConfirmButton() {
        changePasswordFunktion.PasswordAndernConfirmButton.click();
    }
    @And("Verify that you can successfully change the password")
    public void verifyThatYouCanSuccessfullyChangeThePassword() {
        changePasswordFunktion.verifyChangePasswordSuccessfullyMessage();
        BrowserUtils.waitFor(2);
    }

    @Then("Enter new password-five characters")
    public void enterNewPasswordFiveCharacters() {
        BrowserUtils.waitFor(2);
        String newPassword = "*kac#";
        changePasswordFunktion.newPasswordBox.sendKeys(newPassword);
    }
    @Then("Enter new password again-five characters")
    public void enterNewPasswordAgainFiveCharacters() {
        String newPassword = "*kac#";
        changePasswordFunktion.confirmNewPasswordBox.sendKeys(newPassword);
    }
    @And("Verify the error message that the passport must be at least six characters")
    public void verifyTheErrorMessageThatThePassportMustBeAtLeastSixCharacters() {
        BrowserUtils.waitFor(2);
        changePasswordFunktion.verifyErrorMessageForFiveCharacters();
    }

    @Then("Enter new password-twenty one characters")
    public void enterNewPasswordTwentyOneCharacters() {
        String newPassword = "*kaclassictestteam21#";
        changePasswordFunktion.newPasswordBox.sendKeys(newPassword);
    }

    @Then("Enter new password again-twenty one characters")
    public void enterNewPasswordAgainTwentyOneCharacters() {
        String newPassword = "*kaclassictestteam21#";
        changePasswordFunktion.confirmNewPasswordBox.sendKeys(newPassword);
    }

    @And("Verify the error message stating that the password must be no more than twenty characters")
    public void verifyTheErrorMessageStatingThatThePasswordMustBeNoMoreThanTwentyCharacters() {
        BrowserUtils.waitFor(2);
        changePasswordFunktion.verifyErrorMessageForTwentyOneCharacters();
    }

    @Then("Enter new password-ten characters")
    public void enterNewPasswordTenCharacters() {
        BrowserUtils.waitFor(2);
        String newPassword = "*kacclass#";
        changePasswordFunktion.newPasswordBox.sendKeys(newPassword);
    }

    @Then("Enter new password again-twelve characters")
    public void enterNewPasswordAgainTwelveCharacters() {
        String newPassword = "*kacclassic#";
        changePasswordFunktion.confirmNewPasswordBox.sendKeys(newPassword);
    }

    @And("Verify that an error message should be received when the new password cannot be verified")
    public void verifyThatAnErrorMessageShouldBeReceivedWhenTheNewPasswordCannotBeVerified() {
        BrowserUtils.waitFor(2);
        changePasswordFunktion.verifyErrorMessageDifferentPassword();
    }
}