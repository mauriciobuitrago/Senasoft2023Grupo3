package tasks;

import models.AccommodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.AccommodationInterface;
import userinterfaces.HeaderComponent;

public class ChangeCurrency implements Task {

    AccommodationData accommodationData;


    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(Click.on(AccommodationInterface.BTN_CLOSE_INFORMATION));
        }catch(Exception e){

        }
        actor.attemptsTo(
                Click.on(HeaderComponent.BTN_DEPLOY_CURRENCY),
                Click.on(HeaderComponent.BTN_CURRENCY.of("USD"))
                //Click.on(HeaderComponent.BTN_CURRENCY.of(accommodationData.getCurrency()))
        );
    }

    public static ChangeCurrency changeCurrency(AccommodationData accommodationData){
        return Tasks.instrumented(ChangeCurrency.class, accommodationData);
    }

}
