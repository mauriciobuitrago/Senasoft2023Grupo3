package pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://account.booking.com/sign-in")
public class RegisterPage extends PageObject {
    By TXT_EMAIL = By.xpath("//input[@name='username']");
    By BTN_SINGIN = By.xpath("//button[@type='submit']");
    By TXT_PASSWORD = By.xpath("//input[@class='ZMH9h0HCYH9GGNxHnXGJ']");
    By TXT_PASSWORD2 = By.xpath("//input[@class='ZMH9h0HCYH9GGNxHnXGJ']");
    By BTN_SINGIN2 = By.xpath("//button[@type='submit']");

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
