package questions;

import models.AccommodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Visibility;
import userinterfaces.AccommodationInterface;
import userinterfaces.HotelResultInterface;

public class CheckKidsAgesQuestion implements Question<Boolean>{
    @Override
    public Boolean answeredBy(Actor actor) {
        int kids = 2;
        AccommodationData accommodationData;

        //Check if each kid age selector is displayed
        for (int i = 1; i <= kids; i++){
            if(Visibility.of(AccommodationInterface.SCT_KID_AGE.of(Integer.toString(i)))
                    .viewedBy(actor).asBoolean())
            {
                if(i == kids){
                    return true;
                }
            }
        }
        return false;
    }

    public static CheckKidsAgesQuestion compare(AccommodationData accommodationData){
        return new CheckKidsAgesQuestion();
    }
}
