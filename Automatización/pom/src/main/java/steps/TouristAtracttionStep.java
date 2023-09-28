package steps;


import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import pageobjects.TouristAtracttionPage;

//Class to create the methods to execute in the defined scenarios
public class TouristAtracttionStep {
    //Here a variable is created that contains a new object
    TouristAtracttionPage touristAtracttionPage = new TouristAtracttionPage();

    //Open browser
    @Step
    public void openBrowserAttraction() {
        touristAtracttionPage.open();
    }

    //Enter the information
    @Step
    public void enterTheDate() {
        touristAtracttionPage.getDriver().findElement(touristAtracttionPage.getTXT_DESTINY())
                .sendKeys("medell");

        touristAtracttionPage.getDriver().findElement(touristAtracttionPage.getSELECT_DESTINY())
                .click();

        touristAtracttionPage.getDriver().findElement(touristAtracttionPage.getINPUT_DATES())
                .click();

        touristAtracttionPage.getDriver().findElement(touristAtracttionPage.getLBL_DATE())
                .click();

        touristAtracttionPage.getDriver().findElement(touristAtracttionPage.getLBL_DATE2())
                .click();

        touristAtracttionPage.getDriver().findElement(touristAtracttionPage.getBTN_SEARCH())
                .click();
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(500);
                System.out.println("Sleep " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //Validate the search
    @Step
    public void validateSearch() {
        Assert.assertThat(touristAtracttionPage.getDriver().findElement(touristAtracttionPage.getTXT_VALIDATE_SEARCH())
                .isDisplayed(), Matchers.is(true));
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(2000);
                System.out.println("Sleep " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    //Validate the existence of the filter button
    @Step
    public void validateLowerPrice() {
        Assert.assertThat(touristAtracttionPage.getDriver().findElement(touristAtracttionPage.getLBL_VALIDATE_LOWERPRICE())
                .isDisplayed(), Matchers.is(true));
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(2000);
                System.out.println("Sleep " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Step
    public void clickButtonLowerPrice() {
        touristAtracttionPage.getDriver().findElement(touristAtracttionPage.getLBL_LOWPRICE())
                .click();
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(1000);
                System.out.println("Sleep " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @Step
    public void validateLowerPriceFilter() {
        //prices to compare
        double price1 = pricetoDouble(touristAtracttionPage.getDriver().findElement(
                touristAtracttionPage.getATTRACTION_RESULTS()).getText());

        double price2 = pricetoDouble(touristAtracttionPage.getDriver().findElement(
                touristAtracttionPage.getATTRACTION_RESULTS2()).getText());

        Assert.assertTrue(price1 < price2);

        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(2000);
                System.out.println("Sleep " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // This function takes a string that represents an amount in US dollars
    // and returns a double that represents the same dollar amount
    public static double pricetoDouble(String dolares) {
        // Remove the prefix "US$" from the string
        String sinPrefijo = dolares.substring(3);
        // Replace the comma with a period to use the standard decimal format
        String sinComa = sinPrefijo.replace(',', '.');
        // Convert the string to a floating point number
        double numero = Double.parseDouble(sinComa);
        // Return the result
        return numero;
    }
}