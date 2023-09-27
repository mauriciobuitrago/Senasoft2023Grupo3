package steps;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import pageobjects.LoginPage;
public class LoginStep {
    LoginPage loginPage = new LoginPage();

    @Step
    public void openBrowser(){
       loginPage.open();
    }

    @Step
    public void enterCredential(){
        loginPage.getDriver().findElement(loginPage.getTXT_EMAIL())
        .sendKeys("senasoft@yopmail.com");

        loginPage.getDriver().findElement(loginPage.getBTN_SINGIN())
        .click();

        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(500);
                System.out.println("Sleep "+i);
            }
        }catch(Exception e) {
            System.out.println(e);
        }

        loginPage.getDriver().findElement(loginPage.getTXT_PASSWORD())
                .sendKeys("Senasoft123.");

        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(500);
                System.out.println("Sleep "+i);
            }
        }catch(Exception e) {
            System.out.println(e);
        }

        loginPage.getDriver().findElement(loginPage.getBTN_SINGIN2())
                .click();

        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(1000);
                System.out.println("Sleep "+i);
            }
        }catch(Exception e) {
            System.out.println(e);
        }
    }

    @Step
    public void validateAccount(){
        Assert.assertThat(loginPage.getDriver().findElement(loginPage.getLBL_ACCOUNT()).isDisplayed(), Matchers.is(true));

        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(1000);
                System.out.println("Sleep "+i);
            }
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}