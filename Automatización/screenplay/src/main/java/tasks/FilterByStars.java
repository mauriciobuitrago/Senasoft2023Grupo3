package tasks;

import models.AccommodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.AccommodationResultInterface;

public class FilterByStars implements Task {
    AccommodationData accommodationData;

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Stars to filter by
        String starsSelected = "3, 4, 5";

        //If sequences to select the star desired, an if for each star (five in total)
        if(starsSelected.contains("1")){
            actor.attemptsTo(
                    Scroll.to(AccommodationResultInterface.CBX_STARS.of(Integer.toString((1*2)+1))),
                    Click.on(AccommodationResultInterface.CBX_STARS.of(Integer.toString((1*2)+1)))
            );
        }
        if(starsSelected.contains("2")){
            actor.attemptsTo(
                    Scroll.to(AccommodationResultInterface.CBX_STARS.of(Integer.toString((2*2)+1))),
                    Click.on(AccommodationResultInterface.CBX_STARS.of(Integer.toString((2*2)+1)))
            );
        }
        if(starsSelected.contains("3")){
            actor.attemptsTo(
                    Scroll.to(AccommodationResultInterface.CBX_STARS.of(Integer.toString((3*2)+1))),
                    Click.on(AccommodationResultInterface.CBX_STARS.of(Integer.toString((3*2)+1)))
            );
        }
        if(starsSelected.contains("4")){
            actor.attemptsTo(
                    Scroll.to(AccommodationResultInterface.CBX_STARS.of(Integer.toString((4*2)+1))),
                    Click.on(AccommodationResultInterface.CBX_STARS.of(Integer.toString((4*2)+1)))
            );
        }
        if(starsSelected.contains("5")){
            actor.attemptsTo(
                    Scroll.to(AccommodationResultInterface.CBX_STARS.of(Integer.toString((5*2)+1))),
                    Click.on(AccommodationResultInterface.CBX_STARS.of(Integer.toString((5*2)+1)))
            );
        }

    }

    public static FilterByStars filterByStars(AccommodationData accommodationData){
        return Tasks.instrumented(FilterByStars.class, accommodationData);
    }
}
