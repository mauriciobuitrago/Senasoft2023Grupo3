package tasks;

import models.AccommodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterfaces.AccommodationInterface;

public class SearchAccommodationParams implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Submit accommodation search
        actor.attemptsTo(
                Click.on(AccommodationInterface.BTN_SUBMIT)
        );
    }

    public static SearchAccommodationParams submitParams(){
        return Tasks.instrumented(SearchAccommodationParams.class);
    }
}
