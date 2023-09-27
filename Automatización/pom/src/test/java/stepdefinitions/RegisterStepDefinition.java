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
}
