package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccommodationInterface {

    //PopUp
    public static final Target BTN_CLOSE_INFORMATION = Target.the("Button to close initial popup")
            .locatedBy("//button[@aria-label='Ignorar información sobre el inicio de sesión.']");

    //Destination param
    public static final Target TXT_DESTINATION_PARAM = Target.the("Destination text param")
            .locatedBy("//input[@id=':re:']");
    public static final Target TXT_DESTINATION_REQUIRED = Target.the("Destination required alert")
            .locatedBy("//div[text()='Introduce un destino para empezar a buscar.']");

    //Date params
    public static final Target DEPLOY_DATE_PICKER = Target.the("Date picker")
            .locatedBy("//div[@data-testid='searchbox-dates-container']");
    public static final Target LABEL_DATE = Target.the("Dates labels")
            .locatedBy("//span[@aria-label='{0}']");

    //Person params
    public static final Target DEPLOY_PERSON = Target.the("Person picker")
            .locatedBy("//button[@data-testid='occupancy-config']");
    public static final Target BTN_ADD_ADULT = Target.the("Button to add adults at person params")
            .locatedBy("//div[@data-testid='occupancy-popup']/div/div[1]/div[2]/button[2]");
    public static final Target BTN_ADD_KID = Target.the("Button to add kids at person params")
            .locatedBy("//div[@data-testid='occupancy-popup']/div/div[2]/div[2]/button[2]");
    public static final Target BTN_ADD_ROOM = Target.the("Button to add room at person params")
            .locatedBy("//div[@data-testid='occupancy-popup']/div/div[5]/div[2]/button[2]");
    public static final Target SCT_KID_AGE = Target.the("Select the kid age value")
            .locatedBy("//div[@data-testid='kids-ages']/div[{0}]/div/select");
    public static final Target BTN_REMOVE_ADULT = Target.the("Button to add adults at person params")
            .locatedBy("//div[@data-testid='occupancy-popup']/div/div[1]/div[2]/button[1]");
    public static final Target BTN_REMOVE_KID = Target.the("Button to add kids at person params")
            .locatedBy("//div[@data-testid='occupancy-popup']/div/div[2]/div[2]/button[1]");
    public static final Target BTN_SUBMIT = Target.the("Button to add adults at person params")
            .locatedBy("//form[@action='https://www.booking.com/searchresults.es.html']/div[1]/div[4]/button");
}