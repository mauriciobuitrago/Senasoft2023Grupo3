package pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

import org.openqa.selenium.By;

//The default variable to open in the browser is captured
@DefaultUrl("https://account.booking.com/sign-in")

//Class that contains the mapping of all the elements to be used and extends the Page Object
public class LoginPage extends PageObject {

    //Element to enter the email
    By TXT_EMAIL = By.xpath("//input[@name='username']");

    //Click on the enter button
    By BTN_SINGIN = By.xpath("//button[@type='submit']");

    //Element to enter the password
    By TXT_PASSWORD = By.xpath("//input[@class='ZMH9h0HCYH9GGNxHnXGJ']");

    //Enter button
    By BTN_SINGIN2 = By.xpath("//button[@type='submit']");

    //Income validation
    By LBL_ACCOUNT = By.xpath("//*[text()='Are you a robot?']");

    //Get and Setter Methods
    public By getLBL_ACCOUNT() {
        return LBL_ACCOUNT;
    }

    public void setLBL_ACCOUNT(By LBL_ACCOUNT) {
        this.LBL_ACCOUNT = LBL_ACCOUNT;
    }

    public By getBTN_SINGIN2() {
        return BTN_SINGIN2;
    }

    public void setBTN_SINGIN2(By BTN_SINGIN2) {
        this.BTN_SINGIN2 = BTN_SINGIN2;
    }

    public By getTXT_PASSWORD() {
        return TXT_PASSWORD;
    }

    public void setTXT_PASSWORD(By TXT_PASSWORD) {
        this.TXT_PASSWORD = TXT_PASSWORD;
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
}