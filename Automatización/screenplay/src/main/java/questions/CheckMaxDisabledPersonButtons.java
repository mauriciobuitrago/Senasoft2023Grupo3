package questions;

import models.AccommodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.AccommodationInterface;

public class CheckMaxDisabledPersonButtons implements Question<Boolean> {

    AccommodationData accommodationData;
    @Override
    public Boolean answeredBy(Actor actor) {
        //Check if the add person buttons are disabled on max values
        return AccommodationInterface.BTN_ADD_ADULT.resolveFor(actor).getAttribute("disabled").equals("true")
                && AccommodationInterface.BTN_ADD_KID.resolveFor(actor).getAttribute("disabled").equals("true")
                && AccommodationInterface.BTN_ADD_ROOM.resolveFor(actor).getAttribute("disabled").equals("true");
    }

    public static CheckMaxDisabledPersonButtons compare(AccommodationData accommodationData){
        return new CheckMaxDisabledPersonButtons();
    }
}
