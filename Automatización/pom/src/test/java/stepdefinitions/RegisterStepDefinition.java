package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LoginStep;
import steps.RegisterStep;

public class RegisterStepDefinition {
    @Steps
    RegisterStep registerStep;
    @Steps
    LoginStep loginStep;

    @When("^The user enters the data$")
    public void theUserEntersTheData() {
        registerStep.enterData();
    }

    @Then("^The user registers himself successfully$")
    public void theUserRegistersHimselfSuccessfully() {
        loginStep.validateAccount();
    }

    @When("^The user enters the incorrect data$")
    public void theUserEntersTheIncorrectData() {
        registerStep.enterCredentials();
    }

    @Then("^The user password is rejected$")
    public void theUserPasswordIsRejected() {
        registerStep.validateParams();
    }

    @When("^The user enters the existent email$")
    public void theUserEntersTheExistentEmail() {
        registerStep.enterEmail();
    }

    @Then("^The user redirected to the login page$")
    public void theUserRedirectedToTheLoginPage() {
        registerStep.validateTheEmail();
    }
}
