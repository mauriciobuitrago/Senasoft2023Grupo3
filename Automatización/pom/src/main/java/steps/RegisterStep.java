package steps;

import models.LoginCredentials;
import models.RegisterData;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;
import pageobjects.RegisterPage;

//Register step methods
public class RegisterStep {
     RegisterData registerData;
    //A variable is created with a new object
    RegisterPage registerPage = new RegisterPage();

    //The information is entered
    @Step
    public void enterData(RegisterData registerData){
        //The email input is taken to enter the data
        registerPage.getDriver().findElement(registerPage.getTXT_EMAIL())
                .sendKeys(registerData.getEmail());

        //Here you click on the button to enter
        registerPage.getDriver().findElement(registerPage.getBTN_SINGIN())
                .click();

        //Here you enter the password
        registerPage.getDriver().findElement(registerPage.getTXT_PASSWORD())
                .sendKeys(registerData.getPassword());

        //Here the password is validated
        registerPage.getDriver().findElement(registerPage.getTXT_PASSWORD2())
                .sendKeys(registerData.getPassword());
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(500);
                System.out.println("Sleep "+i);
            }
        }catch(Exception e) {
            System.out.println(e);
        }

        //Click the button to finish the registration and validate that the passwords are the same and comply with the parameters
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

    //Credentials are entered to simulate a failed scenario
    @Step
    public void enterCredentials(RegisterData registerData){
        //Email is entered
        registerPage.getDriver().findElement(registerPage.getTXT_EMAIL())
                .sendKeys(registerData.getEmail());

        //Click on the enter button
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

        //Invalid password entered
        registerPage.getDriver().findElement(registerPage.getTXT_PASSWORD())
                .sendKeys(registerData.getPassword());

        //Click on the button to validate password
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

    //Method that validates if the email is already registered
    @Step
    public void enterEmail(RegisterData registerData){
        //Email is entered
        registerPage.getDriver().findElement(registerPage.getTXT_EMAIL())
                .sendKeys(registerData.getEmail());
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(1000);
                System.out.println("Sleep "+i);
            }
        }catch(Exception e) {
            System.out.println(e);
        }

        //Click on the enter button
        registerPage.getDriver().findElement(registerPage.getBTN_SINGIN())
                .click();
    }

    //Method to validate parameters when registering a new password
    @Step
    public void validateParams(){
        //Validation
        Assert.assertThat(registerPage.getDriver().findElement(registerPage.getPASSWORD_PARAMS())
                .isDisplayed(), Matchers.is(true));
    }

    //Method to validate if the email already exists
    @Step
    public void validateTheEmail(){
        //Validation
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