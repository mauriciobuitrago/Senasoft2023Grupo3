package pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://account.booking.com/sign-in")
public class LoginPage extends PageObject {
    By TXT_EMAIL = By.xpath("//input[@name='username']");
    By BTN_SINGIN = By.xpath("//button[@type='submit']");
    By TXT_PASSWORD = By.xpath("//input[@class='ZMH9h0HCYH9GGNxHnXGJ']");
    By BTN_SINGIN2 = By.xpath("//button[@type='submit']");

    By LBL_ACOUNT = By.xpath("//div[text()='Tu cuenta']");

    public By getLBL_ACOUNT() {
        return LBL_ACOUNT;
    }

    public void setLBL_ACOUNT(By LBL_ACOUNT) {
        this.LBL_ACOUNT = LBL_ACOUNT;
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
