package tasks;

import models.AccommodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import userinterfaces.AccommodationInterface;

public class EnterDestinationParams implements Task {

    AccommodationData accommodationData;

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Enter the destination in the destination param
        actor.attemptsTo(
                Enter.theValue("Cartagena de Indias")
                        .into(AccommodationInterface.TXT_DESTINATION_PARAM));
    }

    public static EnterDestinationParams enterDestinationParams(AccommodationData accommodationData){
        return Tasks.instrumented(EnterDestinationParams.class, accommodationData);
    }
}
