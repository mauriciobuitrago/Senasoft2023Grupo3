package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.LoginCredentials;
import net.thucydides.core.annotations.Steps;
import steps.LoginStep;

import java.util.List;

public class LoginStepDefinition {
    //Here are the methods of the login page
    @Steps
    LoginStep loginStep;

    //Here the browser opens
    @Given("^The user gets into the login page$")
    public void theUserGetsIntoTheLoginPage() {
        loginStep.openBrowser();
    }

    //Here you enter the access credentials
    @When("^The user enters the credentials$")
    public void theUserEntersTheCredentials(List<LoginCredentials> loginCredentialsList) {
        LoginCredentials loginCredentials;
        loginCredentials = loginCredentialsList.get(0);

        loginStep.enterCredential(loginCredentials);
    }

    //Se logra un login exitoso y se valida con la visualizacion de Tu cuenta
    @Then("^The user logs in successfully and can view his account$")
    public void theUserLogsInSuccessfullyAndCanViewHisAccount() {
        loginStep.validateAccount();
    }
}