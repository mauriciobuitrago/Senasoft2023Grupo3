package tasks;

import models.AccommodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.AccommodationInterface;

public class SetPersonMinimunParams implements Task {
    AccommodationData accommodationData;

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Deploy person params and click on remove adult to set all to minimum values
        actor.attemptsTo(
                Click.on(AccommodationInterface.DEPLOY_PERSON),
                Click.on(AccommodationInterface.BTN_REMOVE_ADULT)
        );
    }
    public static SetPersonMinimunParams deployPersonParams(AccommodationData accommodationData){
        return Tasks.instrumented(SetPersonMinimunParams.class, accommodationData);
    }
}
