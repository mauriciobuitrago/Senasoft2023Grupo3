package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class AccommodationStepDefinition {
    @Managed
    WebDriver userBrowser;

    @Before
    public void setUp(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("User");
        OnStage.theActorInTheSpotlight()
                .can(BrowseTheWeb.with(userBrowser));
    }

    @Given("^The user gets into the accommodation page$")
    public void theUserGetsIntoTheAccommodationPage() {

        OnStage.theActorInTheSpotlight().wasAbleTo(
                Open.url("https://www.booking.com/")
        );
        Actor.named("User").attemptsTo();

    }


    @When("^The user changes the currency$")
    public void theUserChangesTheCurrency() {
    }

    @When("^The user enters destination name params$")
    public void theUserEntersDestinationNameParams() {
    }

    @When("^The user enters in and out date params$")
    public void theUserEntersInAndOutDateParams() {
    }

    @When("^The user enters the person params$")
    public void theUserEntersThePersonParams() {
    }

    @When("^The user performs a search at accommodation page$")
    public void theUserPerformsASearchAtAccommodationPage() {
    }

    @When("^The user filters by stars$")
    public void theUserFiltersByStars() {
    }

    @When("^The user filters by price$")
    public void theUserFiltersByPrice() {
    }

    @When("^the user orders by price$")
    public void theUserOrdersByPrice() {
    }

    @When("^The user enters in the hotel offers$")
    public void theUserEntersInTheHotelOffers() {
    }

    @Then("^The user can the the apllied params$")
    public void theUserCanTheTheAplliedParams() {
    }

    @Then("^The user can see the applied filters$")
    public void theUserCanSeeTheAppliedFilters() {
    }
}
