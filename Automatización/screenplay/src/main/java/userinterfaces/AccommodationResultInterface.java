package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccommodationResultInterface {

    //Filters
    public static final Target CBX_STARS = Target.the("Button to add adults at person params")
            .locatedBy("//div[text()='Incluye estrellas y otras valoraciones']/parent::div/parent::div/div[{0}]/input");
    public static final Target BTN_DEPLOY_SORT = Target.the("Button to deploy the sorter")
            .locatedBy("//button[@data-testid='sorters-dropdown-trigger']");
    public static final Target BTN_SORT_LOWER_PRICE = Target.the("Button to sort by lower price")
            .locatedBy("//ul[@class='ad7c39949a']/li[3]");
    public static final Target RNG_MIN_PRICE = Target.the("Button to select the first result")
            .locatedBy("//div[@class='f3c828a390']/div[1]");
    public static final Target RNG_MAX_PRICE = Target.the("Button to select the first result")
            .locatedBy("//input[@aria-label='Mín.']");
    //Results
    public static final Target BTN_FIRST_RESULT = Target.the("Button to select the first result")
            .locatedBy("//div[@class='d4924c9e74']/div[3]/div[1]/div[2]/div/div[2]/div[2]/div/div[2]");
}
