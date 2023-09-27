package pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

//The default variable to open in the browser is captured
@DefaultUrl("https://account.booking.com/sign-in")

//Class that contains the mapping of all the elements to be used and extends the Page Object
public class RegisterPage extends PageObject {
    //Element to enter the email
    By TXT_EMAIL = By.xpath("//input[@name='username']");
    //Click on the enter button
    By BTN_SINGIN = By.xpath("//button[@type='submit']");

    //Element to enter the new password
    By TXT_PASSWORD = By.xpath("//input[@name='new_password']");

    //Item to enter the password a second time to validate
    By TXT_PASSWORD2 = By.xpath("//input[@name='confirmed_password']");

    //Click enter button
    By BTN_SINGIN2 = By.xpath("//button[@type='submit']");

    //Element to validate the parameters of the password field
    By PASSWORD_PARAMS = By.xpath("//div[text()='Your password must be at least 10 characters']");

    //Element to validate correct login
    By BTN_SINGIN_VALIDATE = By.xpath("//button[@type='submit']");

    //Get and Setter Methods
    public By getBTN_SINGIN_VALIDATE() {
        return BTN_SINGIN_VALIDATE;
    }

    public void setBTN_SINGIN_VALIDATE(By BTN_SINGIN_VALIDATE) {
        this.BTN_SINGIN_VALIDATE = BTN_SINGIN_VALIDATE;
    }

    public By getPASSWORD_PARAMS() {
        return PASSWORD_PARAMS;
    }

    public void setPASSWORD_PARAMS(By PASSWORD_PARAMS) {
        this.PASSWORD_PARAMS = PASSWORD_PARAMS;
    }

    public By getTXT_PASSWORD2() {
        return TXT_PASSWORD2;
    }

    public void setTXT_PASSWORD2(By TXT_PASSWORD2) {
        this.TXT_PASSWORD2 = TXT_PASSWORD2;
    }

    public By getTXT_EMAIL() {
        return TXT_EMAIL;
    }

    public void setTXT_EMAIL(By TXT_EMAIL) {
        this.TXT_EMAIL = TXT_EMAIL;
    }

    public By getBTN_SINGIN() {
        return BTN_SINGIN;
    }

    public void setBTN_SINGIN(By BTN_SINGIN) {
        this.BTN_SINGIN = BTN_SINGIN;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public void setTXT_PASSWORD(By TXT_PASSWORD) {
        this.TXT_PASSWORD = TXT_PASSWORD;
    }

    public By getBTN_SINGIN2() {
        return BTN_SINGIN2;
    }

    public void setBTN_SINGIN2(By BTN_SINGIN2) {
        this.BTN_SINGIN2 = BTN_SINGIN2;
    }
}