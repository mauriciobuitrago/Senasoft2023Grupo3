package steps;


import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import pageobjects.TouristAtracttionPage;

public class TouristAtracttionStep {
    TouristAtracttionPage touristAtracttionPage = new TouristAtracttionPage();

    @Step
    public void openBrowserAttraction() {
        touristAtracttionPage.open();
    }

    @Step
    public void enterTheDate() {
        touristAtracttionPage.getDriver().findElement(touristAtracttionPage.getTXT_DESTINY())
                .sendKeys("medell");
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(1000);
                System.out.println("Sleep " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        touristAtracttionPage.getDriver().findElement(touristAtracttionPage.getSELECT_DESTINY())
                .click();
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(1000);
                System.out.println("Sleep " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        touristAtracttionPage.getDriver().findElement(touristAtracttionPage.getINPUT_DATES())
                .click();
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(1000);
                System.out.println("Sleep " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        touristAtracttionPage.getDriver().findElement(touristAtracttionPage.getLBL_DATE())
                .click();
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(1000);
                System.out.println("Sleep " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        touristAtracttionPage.getDriver().findElement(touristAtracttionPage.getLBL_DATE2())
                .click();
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(1000);
                System.out.println("Sleep " + i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        touristAtracttionPage.getDriver().findElement(touristAtracttionPage.getBTN_SEARCH())
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

        @Step
        public void validateLowerPrice () {
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
}