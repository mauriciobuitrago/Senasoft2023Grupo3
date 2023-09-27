package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LoginStep;

public class LoginStepDefinition {

    @Steps
    LoginStep loginStep;

    @Given("^The user gets into the login page$")
    public void theUserGetsIntoTheLoginPage() {
        loginStep.openBrowser();
    }


    @When("^The user enters the credentials$")
    public void theUserEntersTheCredentials() {
        loginStep.enterCredential();
    }

    @Then("^The user logs in successfully and can view his account$")
    public void theUserLogsInSuccessfullyAndCanViewHisAccount() {
        loginStep.validateAccount();
    }
}
