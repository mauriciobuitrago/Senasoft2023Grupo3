package tasks;

import models.AccommodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterfaces.AccommodationInterface;

public class EnterPersonParams implements Task {

    AccommodationData accommodationData;

    int persons = (3 - 2);
    int kids = 2;
    int rooms = (2 - 1);
    @Override
    public <T extends Actor> void performAs(T actor) {
        //Deploy and set person params
        actor.attemptsTo(
            Click.on(AccommodationInterface.DEPLOY_PERSON)
        );
        //Cycles to person add params
        //Add adults
        for (int i = 0; i < persons; i++){
            actor.attemptsTo(
                Click.on(AccommodationInterface.BTN_ADD_ADULT)
            );
        }
        //Add kids
        for (int i = 1; i <= kids; i++){
            actor.attemptsTo(
                    Click.on(AccommodationInterface.BTN_ADD_KID)
            );
        }
        //Add rooms
        for (int i = 1; i <= rooms; i++){
            actor.attemptsTo(
                    Click.on(AccommodationInterface.BTN_ADD_ROOM)
            );
        }
        //Select kids ages
        for (int i = 1; i <= kids; i++){
            actor.attemptsTo(
                SelectFromOptions.byValue("8"). //Default age setted to 8 years
                        from(AccommodationInterface.SCT_KID_AGE.of(Integer.toString(i))),
                Click.on(AccommodationInterface.DEPLOY_PERSON)
            );
        }
    }

    public static EnterPersonParams enterPersonParams(AccommodationData accommodationData){
        return Tasks.instrumented(EnterPersonParams.class, accommodationData);
    }
}
