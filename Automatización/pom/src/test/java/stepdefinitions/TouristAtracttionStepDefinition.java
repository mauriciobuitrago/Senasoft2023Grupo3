package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.TouristAtracttionStep;

public class TouristAtracttionStepDefinition {
    @Steps
    TouristAtracttionStep touristAtracttionStep;

    @Given("^The user gets into the tourist atracttions$")
    public void theUserGetsIntoTheTouristAtracttions() {
        touristAtracttionStep.openBrowserAttraction();
    }


    @When("^The user performs a search$")
    public void theUserPerformsASearch() {
        touristAtracttionStep.enterTheDate();
    }

    @Then("^The user can see the city attractions and dates they select\\.$")
    public void theUserCanSeeTheCityAttractionsAndDatesTheySelect() {
        touristAtracttionStep.validateSearch();
    }

    @Then("^The user can see the button to sort by lower price$")
    public void theUserCanSeeTheButtonToSortByLowerPrice() {

    }
}