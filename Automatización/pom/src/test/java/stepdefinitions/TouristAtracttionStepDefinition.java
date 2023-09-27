package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.TouristAtracttionStep;

public class TouristAtracttionStepDefinition {

    //Here you define a variable to use the methods of the TouristAttractionStep class
    @Steps
    TouristAtracttionStep touristAtracttionStep;

    //Here the browser opens
    @Given("^The user gets into the tourist atracttions$")
    public void theUserGetsIntoTheTouristAtracttions() {
        touristAtracttionStep.openBrowserAttraction();
    }

    //This scenario takes the method to enter data
    @When("^The user performs a search$")
    public void theUserPerformsASearch() {
        touristAtracttionStep.enterTheDate();
    }

    //Here the search performed previously is validated
    @Then("^The user can see the city attractions and dates they select\\.$")
    public void theUserCanSeeTheCityAttractionsAndDatesTheySelect() {
        touristAtracttionStep.validateSearch();
    }

    //Here it is validated that the button to filter the lowest price does exist
    @Then("^The user can see the button to sort by lower price$")
    public void theUserCanSeeTheButtonToSortByLowerPrice() {
        touristAtracttionStep.validateLowerPrice();
    }
}