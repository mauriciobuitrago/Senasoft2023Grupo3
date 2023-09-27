package steps;

import net.thucydides.core.annotations.Step;
import pageobjects.LoginPage;



public class LoginStep {
    LoginPage loginPage = new LoginPage();

    @Step
    public void openBrowser(){
       loginPage.open();
    }
}
