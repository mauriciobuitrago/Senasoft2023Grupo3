package questions;

import models.AccommodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import org.apache.xpath.operations.Bool;
import userinterfaces.AccommodationInterface;

public class CheckRequiredDestination implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        int kids = 2;
        AccommodationData accommodationData;
        //Check if the destination required popup is displayed
        return Visibility.of(AccommodationInterface.TXT_DESTINATION_REQUIRED)
                .viewedBy(actor).asBoolean();
    }

    public static CheckRequiredDestination compare(AccommodationData accommodationData){
        return new CheckRequiredDestination();
    }

}
