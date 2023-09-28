package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HotelResultInterface {

    public static final Target TXT_ADULTS = Target.the("Text displaying adults cuantity")
            .locatedBy("//h3[contains(text(), '{0} adultos')]");
    public static final Target TXT_KIDS = Target.the("Text displaying adults cuantity")
            .locatedBy("//h3[contains(text(), '{0} niños')]");

}
