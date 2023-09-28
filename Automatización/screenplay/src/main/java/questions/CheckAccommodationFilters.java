package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import userinterfaces.HotelResultInterface;

public class CheckAccommodationFilters implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        //Check if the quantity of kids and adults is the same as requested
        return Visibility.of(HotelResultInterface.TXT_ADULTS.of("3")).viewedBy(actor).asBoolean()
                && Visibility.of(HotelResultInterface.TXT_KIDS.of("2")).viewedBy(actor).asBoolean();
    }
    public static CheckAccommodationParams compare(){
        return new CheckAccommodationParams();
    }
}
