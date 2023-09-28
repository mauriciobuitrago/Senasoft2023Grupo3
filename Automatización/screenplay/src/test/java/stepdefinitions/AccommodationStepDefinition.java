package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.AccommodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import questions.*;
import tasks.*;
import utils.Sleep;

import java.util.List;

public class AccommodationStepDefinition {
    Sleep sleep;
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
    public void theUserChangesTheCurrency(List<AccommodationData> accommodationDataList) {
        AccommodationData accommodationData;
        accommodationData = accommodationDataList.get(0);
        //Change currency task
        OnStage.theActorInTheSpotlight().attemptsTo(
                ChangeCurrency.changeCurrency(accommodationData)
        );
    }

    @When("^The user enters destination name params$")
    public void theUserEntersDestinationNameParams(List<AccommodationData> accommodationDataList) {
        AccommodationData accommodationData;
        accommodationData = accommodationDataList.get(0);
        //Enter destination params task
        OnStage.theActorInTheSpotlight().attemptsTo(
                EnterDestinationParams.enterDestinationParams(accommodationData)
        );
    }
    @When("^The user enters in and out date params$")
    public void theUserEntersInAndOutDateParams(List<AccommodationData> accommodationDataList) {
        AccommodationData accommodationData;
        accommodationData = accommodationDataList.get(0);
        //Enters date params task
        OnStage.theActorInTheSpotlight().attemptsTo(
                EnterDateParams.enterDateParams(accommodationData)
        );
    }
    @When("^The user enters the person params$")
    public void theUserEntersThePersonParams(List<AccommodationData> accommodationDataList) {
        AccommodationData accommodationData;
        accommodationData = accommodationDataList.get(0);
        //Enter person params task (Destination, date, persons)
        OnStage.theActorInTheSpotlight().attemptsTo(
                EnterPersonParams.enterPersonParams(accommodationData)
        );
    }
    @When("^The user performs a search at accommodation page$")
    public void theUserPerformsASearchAtAccommodationPage() {
        //Click submit button task
        OnStage.theActorInTheSpotlight().attemptsTo(
                SearchAccommodationParams.submitParams()
        );
    }
    @When("^The user filters by stars$")
    public void theUserFiltersByStars(List<AccommodationData> accommodationDataList) {
        AccommodationData accommodationData;
        accommodationData = accommodationDataList.get(0);
        //Click on the selected stars task
        OnStage.theActorInTheSpotlight().attemptsTo(
                FilterByStars.filterByStars(accommodationData)
        );
    }

    @When("^The user filters by price$")
    public void theUserFiltersByPrice(List<AccommodationData> accommodationDataList) {
    }

    @When("^the user orders by price$")
    public void theUserOrdersByPrice() {
        //Click on the filter trigger and select lower to higger price task
        OnStage.theActorInTheSpotlight().attemptsTo(
                SortAccommodationsByPrice.sortAccommodationsByPrice()
        );
    }

    @When("^The user enters in the hotel offers$")
    public void theUserEntersInTheHotelOffers() {
        //Clicks the first hotel offer task
        OnStage.theActorInTheSpotlight().attemptsTo(
                SelectFirstOffer.selectFirstOffer()
        );

    }

    @When("^The user enters max params$")
    public void theUserEntersMaxParams(List<AccommodationData> accommodationDataList) {
        AccommodationData accommodationData;
        accommodationData = accommodationDataList.get(0);
        //Enter the max person params (Adults, childs and rooms) task
        OnStage.theActorInTheSpotlight().attemptsTo(
                EnterMaxPersonParams.enterMaxPersonParams(accommodationData)
        );
    }

    @When("^The user just deploys person Params$")
    public void theUserJustDeploysPersonParams(List<AccommodationData> accommodationDataList) {
        AccommodationData accommodationData;
        accommodationData = accommodationDataList.get(0);
        //Deploy the person params and set all to the minimum value task
        OnStage.theActorInTheSpotlight().attemptsTo(
                SetPersonMinimunParams.deployPersonParams(accommodationData)
        );
    }

    @Then("^The user can the the apllied params$")
    public void theUserCanTheTheAplliedParams(List<AccommodationData> accommodationDataList) {
        AccommodationData accommodationData;
        accommodationData = accommodationDataList.get(0);
        //Change window
        userBrowser.getWindowHandles();
        String currentWindow = userBrowser.getWindowHandle();
        for (String window : userBrowser.getWindowHandles()) {
            if (!window.equals (currentWindow)) {
                userBrowser.switchTo ().window (window);
            }
        }
        //Check the adults and children quantity on the hotel offer
        OnStage.theActorInTheSpotlight()
                .should(GivenWhenThen.seeThat(CheckAccommodationParams.compare(accommodationData),
                        Matchers.equalTo(true)));
    }

    @Then("^The user can see the applied filters$")
    public void theUserCanSeeTheAppliedFilters() {
    }

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
}
