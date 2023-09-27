package steps;

import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import pageobjects.RegisterPage;

public class RegisterStep {
    RegisterPage registerPage = new RegisterPage();

    @Step
    public void enterData(){
        registerPage.getDriver().findElement(registerPage.getTXT_EMAIL())
                .sendKeys("senasoft3@yopmail.com");

        registerPage.getDriver().findElement(registerPage.getBTN_SINGIN())
                .click();

        registerPage.getDriver().findElement(registerPage.getTXT_PASSWORD())
                .sendKeys("Senasoft123.");

        registerPage.getDriver().findElement(registerPage.getTXT_PASSWORD2())
                .sendKeys("Senasoft123.");
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(500);
                System.out.println("Sleep "+i);
            }
        }catch(Exception e) {
            System.out.println(e);
        }

        registerPage.getDriver().findElement(registerPage.getBTN_SINGIN2())
                .click();
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(500);
                System.out.println("Sleep "+i);
            }
        }catch(Exception e) {
            System.out.println(e);
        }
    }

    @Step
    public void enterCredentials(){
        registerPage.getDriver().findElement(registerPage.getTXT_EMAIL())
                .sendKeys("senasoft3@yopmail.com");

        registerPage.getDriver().findElement(registerPage.getBTN_SINGIN())
                .click();

        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(500);
                System.out.println("Sleep "+i);
            }
        }catch(Exception e) {
            System.out.println(e);
        }

        registerPage.getDriver().findElement(registerPage.getTXT_PASSWORD())
                .sendKeys("prueba");

        registerPage.getDriver().findElement(registerPage.getBTN_SINGIN2())
                .click();

        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(500);
                System.out.println("Sleep "+i);
            }
        }catch(Exception e) {
            System.out.println(e);
        }
    }

    @Step
    public void enterEmail(){
        registerPage.getDriver().findElement(registerPage.getTXT_EMAIL())
                .sendKeys("senasoft2@yopmail.com");
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(1000);
                System.out.println("Sleep "+i);
            }
        }catch(Exception e) {
            System.out.println(e);
        }

        registerPage.getDriver().findElement(registerPage.getBTN_SINGIN())
                .click();
    }

    @Step
    public void validateParams(){
        Assert.assertThat(registerPage.getDriver().findElement(registerPage.getPASSWORD_PARAMS())
                .isDisplayed(), Matchers.is(true));
    }

    @Step
    public void validateTheEmail(){
        Assert.assertThat(registerPage.getDriver().findElement(registerPage.getBTN_SINGIN_VALIDATE())
                .isDisplayed(), Matchers.is(true));

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
