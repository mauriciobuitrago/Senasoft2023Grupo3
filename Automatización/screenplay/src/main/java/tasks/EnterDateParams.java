package tasks;

import models.AccommodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.AccommodationInterface;

public class EnterDateParams implements Task {

    AccommodationData accommodationData;
    @Override
    public <T extends Actor> void performAs(T actor) {
        //Deploy the date picker and select the desired dates (just two)
        actor.attemptsTo(
                Click.on(AccommodationInterface.DEPLOY_DATE_PICKER),
                Click.on(AccommodationInterface.LABEL_DATE.of("29 septiembre 2023")),
                Click.on(AccommodationInterface.LABEL_DATE.of("3 octubre 2023"))
        );
    }

    public static EnterDateParams enterDateParams(AccommodationData accommodationData){
        return Tasks.instrumented(EnterDateParams.class, accommodationData);
    }
}
