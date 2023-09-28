package tasks;

import models.AccommodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.AccommodationInterface;

public class EnterDestinationPersonParams implements Task {

    AccommodationData accommodationData;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                //Click.on(HeaderComponent.BTN_CURRENCY.of("USD"))

                Enter.theValue("Cartagena de Indias")
                        .into(AccommodationInterface.TXT_DESTINATION_PARAM));
    }

    public static EnterDestinationPersonParams enterPersonParams(AccommodationData accommodationData){
        return Tasks.instrumented(EnterDestinationPersonParams.class, accommodationData);
    }
}
