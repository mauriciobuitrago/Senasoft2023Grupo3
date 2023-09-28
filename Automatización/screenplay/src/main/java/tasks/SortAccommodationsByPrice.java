package tasks;

import models.AccommodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import userinterfaces.AccommodationResultInterface;

import javax.swing.event.CaretListener;

public class SortAccommodationsByPrice implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Deploy sorting select and sort by lower to higger price
        actor.attemptsTo(
                Scroll.to(AccommodationResultInterface.BTN_DEPLOY_SORT),
                Click.on(AccommodationResultInterface.BTN_DEPLOY_SORT),
                Click.on(AccommodationResultInterface.BTN_SORT_LOWER_PRICE)
        );
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static SortAccommodationsByPrice sortAccommodationsByPrice(){
        return Tasks.instrumented(SortAccommodationsByPrice.class);
    }
}
