package tasks;

import models.AccommodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.AccommodationResultInterface;

public class SelectFirstOffer implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Click on the first result
        actor.attemptsTo(
                Click.on(AccommodationResultInterface.BTN_FIRST_RESULT)
        );
    }

    public static SelectFirstOffer selectFirstOffer(){
        return Tasks.instrumented(SelectFirstOffer.class);
    }
}
