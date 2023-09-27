package pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.booking.com/attractions/index.es-ar.html")
public class TouristAtracttionPage extends PageObject {
    By TXT_DESTINY = By.xpath("//input[@name='query']");
    By SELECT_DESTINY = By.xpath("//div[text()='Medellín, Antioquia']");
    By INPUT_DATES = By.xpath("//div[text()='Seleccioná tus fechas']");
    By LBL_DATE = By.xpath("//span[@aria-label='30 Septiembre 2023']");
    By LBL_DATE2 = By.xpath("//span[@aria-label='8 Octubre 2023']");
    By BTN_SEARCH = By.xpath("//span[text()='Buscar']/parent::button");
    By TXT_VALIDATE_SEARCH = By.xpath("//div[text()='Medellín']");
    By LBL_VALIDATE_LOWERPRICE = By.xpath("//label[text()='Precio más bajo']");

    public By getLBL_VALIDATE_LOWERPRICE() {
        return LBL_VALIDATE_LOWERPRICE;
    }

    public void setLBL_VALIDATE_LOWERPRICE(By LBL_VALIDATE_LOWERPRICE) {
        this.LBL_VALIDATE_LOWERPRICE = LBL_VALIDATE_LOWERPRICE;
    }

    public By getSELECT_DESTINY() {
        return SELECT_DESTINY;
    }

    public void setSELECT_DESTINY(By SELECT_DESTINY) {
        this.SELECT_DESTINY = SELECT_DESTINY;
    }

    public By getTXT_VALIDATE_SEARCH() {
        return TXT_VALIDATE_SEARCH;
    }

    public void setTXT_VALIDATE_SEARCH(By TXT_VALIDATE_SEARCH) {
        this.TXT_VALIDATE_SEARCH = TXT_VALIDATE_SEARCH;
    }

    public By getBTN_SEARCH() {
        return BTN_SEARCH;
    }

    public void setBTN_SEARCH(By BTN_SEARCH) {
        this.BTN_SEARCH = BTN_SEARCH;
    }

    public By getTXT_DESTINY() {
        return TXT_DESTINY;
    }

    public void setTXT_DESTINY(By TXT_DESTINY) {
        this.TXT_DESTINY = TXT_DESTINY;
    }

    public By getINPUT_DATES() {
        return INPUT_DATES;
    }

    public void setINPUT_DATES(By INPUT_DATES) {
        this.INPUT_DATES = INPUT_DATES;
    }

    public By getLBL_DATE() {
        return LBL_DATE;
    }

    public void setLBL_DATE(By LBL_DATE) {
        this.LBL_DATE = LBL_DATE;
    }

    public By getLBL_DATE2() {
        return LBL_DATE2;
    }

    public void setLBL_DATE2(By LBL_DATE2) {
        this.LBL_DATE2 = LBL_DATE2;
    }
}