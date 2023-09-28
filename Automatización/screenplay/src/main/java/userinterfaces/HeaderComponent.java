package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccommodationInterface {

    public static final Target BTN_DEPLOY_CURRENCY = Target.the("Button to deploy the currency")
            .locatedBy("//button[@data-testid='header-currency-picker-trigger']");
    public static final Target BTN_CURRENCY = Target.the("Button to change the currency")
            .locatedBy("//div[text()='USD']");

}
