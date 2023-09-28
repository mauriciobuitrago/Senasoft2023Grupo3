package questions;

import models.AccommodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.AccommodationInterface;

public class CheckMinDisabledPersonButtons implements Question<Boolean> {

    AccommodationData accommodationData;
    @Override
    public Boolean answeredBy(Actor actor) {
        //Check if the add person buttons are disabled on min values
        return AccommodationInterface.BTN_REMOVE_ADULT.resolveFor(actor).getAttribute("disabled").equals("true")
                && AccommodationInterface.BTN_REMOVE_KID.resolveFor(actor).getAttribute("disabled").equals("true");
    }

    public static CheckMinDisabledPersonButtons compare(AccommodationData accommodationData){
        return new CheckMinDisabledPersonButtons();
    }
}
