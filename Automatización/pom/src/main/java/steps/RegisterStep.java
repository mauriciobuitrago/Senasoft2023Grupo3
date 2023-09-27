package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.RegisterPage;

public class RegisterStep {
    RegisterPage registerPage = new RegisterPage();

    @Step
    public void open(){
        registerPage.open();
    }

    @Step
    public void enterCredential2(){
        registerPage.getDriver().findElement(registerPage.getTXT_EMAIL())
                .sendKeys("senasoft2@yopmail.com");

        registerPage.getDriver().findElement(registerPage.getBTN_SINGIN())
                .click();

        registerPage.getDriver().findElement(registerPage.getTXT_PASSWORD())
                .sendKeys("pruebaA12345*");

        registerPage.getDriver().findElement(registerPage.getTXT_PASSWORD2())
                .sendKeys("pruebaA12345*");

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
    }

    @Step
    public void confirmPassword(){

    }
}
