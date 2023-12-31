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
<<<<<<< HEAD

    @Then("^The user can see a age select for each kid$")
    public void theUserCanSeeAAgeSelectForEachKid(List<AccommodationData> accommodationDataList) {
        AccommodationData accommodationData;
        accommodationData = accommodationDataList.get(0);
        //Check if for each child, a select label is created
        OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(CheckKidsAgesQuestion.compare(accommodationData),
                        Matchers.equalTo(true)));
    }
    @Then("^The user can see the destion required popup$")
    public void theUserCanSeeTheDestionRequiredPopup(List<AccommodationData> accommodationDataList) {
        AccommodationData accommodationData;
        accommodationData = accommodationDataList.get(0);
        //Check if the user doesnt enter a destination, displays a pupup
        OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(CheckRequiredDestination.compare(accommodationData),
                        Matchers.equalTo(true)));
    }

    @Then("^The user can see that the person params buttons are disabled$")
    public void theUserCanSeeThatThePersonParamsButtonsAreDisabled(List<AccommodationData> accommodationDataList) {
        AccommodationData accommodationData;
        accommodationData = accommodationDataList.get(0);
        //Check if the person params buttons are disabled on their max value
        // 30 for adults, 10 for children and 30 for rooms
        OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(CheckMaxDisabledPersonButtons.compare(accommodationData),
                        Matchers.equalTo(true)));
    }

    @Then("^The user can see that the person minimun params buttons are disabled$")
    public void theUserCanSeeThatThePersonMinimunParamsButtonsAreDisabled(List<AccommodationData> accommodationDataList) {
        AccommodationData accommodationData;
        accommodationData = accommodationDataList.get(0);
        //Check if the person params buttons are disabled on their min value
        // 1 for adults, 0 for children and 1 for rooms
        OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(CheckMinDisabledPersonButtons.compare(accommodationData),
                        Matchers.equalTo(true)));
    }
    
=======
>>>>>>> parent of 22e3427 (All ready)
}
