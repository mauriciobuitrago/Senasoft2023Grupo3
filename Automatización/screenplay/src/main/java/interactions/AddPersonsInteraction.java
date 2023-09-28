/*package interactions;

import models.AccommodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Scroll;

public class AddPersonsInteraction {

    AccommodationData accommodationData;

    @Override
    public <T extends Actor> void performAs(T actor) {

        if (accommodationData.get("Hobbies").contains("Sports")) {
            actor.attemptsTo(Scroll.to(CHK_BX_SPORTS));
            actor.attemptsTo(Click.on(CHK_BX_SPORTS));
        }
        if (accommodationData.get("Hobbies").contains("Reading")) {
            actor.attemptsTo(Scroll.to(CHK_BX_READING));
            actor.attemptsTo(Click.on(CHK_BX_READING));
        }
        if (accommodationData.get("Hobbies").contains("Music")) {
            actor.attemptsTo(Scroll.to(CHK_BX_MUSIC));
            actor.attemptsTo(Click.on(CHK_BX_MUSIC));
        }
    }

    public static AddPersonsInteraction atAccommodationPage(AccommodationData accommodationData) {
        return Tasks.instrumented(AddPersonsInteraction.class, accommodationData);
    }
}*/
