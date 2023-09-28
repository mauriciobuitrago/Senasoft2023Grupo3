package tasks;

import models.AccommodationData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.MoveMouseToBy;
import net.serenitybdd.screenplay.actions.MoveMouseToWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAndHoldAction;
import userinterfaces.AccommodationResultInterface;

import java.awt.*;
import java.awt.event.KeyEvent;

public class FilterByPrice implements Task {
    AccommodationData accommodationData;
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            //Robot robot = new Robot();
            //robot.mousePress(1);
            //robot.mouseMove(50, 0);
            //robot.mouseRelease(1);
            Thread.sleep(1000);

        } catch (Exception e) {
        }
    }

    public static FilterByPrice filterByPrice(AccommodationData accommodationData){
        return Tasks.instrumented(FilterByPrice.class, accommodationData);
    }
}
