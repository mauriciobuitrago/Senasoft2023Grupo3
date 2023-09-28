package questions;

import models.AccommodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import userinterfaces.HotelResultInterface;

public class CheckAccommodationParams implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        int adults = 3;
        int kids = 2;
        AccommodationData accommodationData;
        //Check if the hotel offers the requested adults and kids
        if(
            Visibility.of(HotelResultInterface.TXT_ADULTS.of(Integer.toString(adults)))
                    .viewedBy(actor).asBoolean()
            && Visibility.of(HotelResultInterface.TXT_KIDS.of(Integer.toString(kids)))
                    .viewedBy(actor).asBoolean()
        ){
            return true;
        }else{
            return false;
        }
    }
    public static CheckAccommodationParams compare(AccommodationData accommodationData){
        return new CheckAccommodationParams();
    }
}
