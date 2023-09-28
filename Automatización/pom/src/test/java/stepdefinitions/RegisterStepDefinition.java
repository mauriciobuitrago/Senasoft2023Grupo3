package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.LoginCredentials;
import models.RegisterData;
import net.thucydides.core.annotations.Steps;
import steps.LoginStep;
import steps.RegisterStep;

import java.util.List;

public class RegisterStepDefinition {

    //The registerPage methods are brought
    @Steps
    RegisterStep registerStep;

    //The loginPage methods are brought
    @Steps
    LoginStep loginStep;

    //The information is entered
    @When("^The user enters the data$")
    public void theUserEntersTheData(List<RegisterData> registerDataList) {
        RegisterData registerData;
        registerData = registerDataList.get(0);

        registerStep.enterData(registerData);
    }

    //When you log in correctly you will be able to see a text that says Your account
    @Then("^The user registers himself successfully$")
    public void theUserRegistersHimselfSuccessfully() {
        loginStep.validateAccount();
    }

    //Here the bad information is entered for a failed scenario
    @When("^The user enters the incorrect data$")
    public void theUserEntersTheIncorrectData(List<RegisterData> registerDataList) {
        RegisterData registerData;
        registerData = registerDataList.get(0);
        registerStep.enterCredentials(registerData);
    }

    //Here the parameters of the registry input are validated
    @Then("^The user password is rejected$")
    public void theUserPasswordIsRejected() {
        registerStep.validateParams();
    }

    //Here an existing email is captured
    @When("^The user enters the existent email$")
    public void theUserEntersTheExistentEmail(List<RegisterData> registerDataList) {
        RegisterData registerData;
        registerData = registerDataList.get(0);
        registerStep.enterEmail(registerData);
    }

    //Here the email is validated if it exists and it is redirected to the login page
    @Then("^The user redirected to the login page$")
    public void theUserRedirectedToTheLoginPage() {
        registerStep.validateTheEmail();
    }
}