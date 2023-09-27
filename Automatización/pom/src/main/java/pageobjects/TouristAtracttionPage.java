package pageobjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

//The default variable to open in the browser is captured
@DefaultUrl("https://www.booking.com/attractions/index.es-ar.html")

//Class that contains the mapping of all the elements to be used and extends the Page Object
public class TouristAtracttionPage extends PageObject {

    //Text field to enter the destination to visit
    By TXT_DESTINY = By.xpath("//input[@name='query']");

    //Destination search drop-down list
    By SELECT_DESTINY = By.xpath("//div[text()='Medellín, Antioquia']");

    //Click to open the calendar
    By INPUT_DATES = By.xpath("//div[text()='Seleccioná tus fechas']");

    //Click on the date on the right side of the calendar
    By LBL_DATE = By.xpath("//span[@aria-label='30 Septiembre 2023']");

    //Click on the date on the left side of the calendar
    By LBL_DATE2 = By.xpath("//span[@aria-label='8 Octubre 2023']");

    //Click on the search button
    By BTN_SEARCH = By.xpath("//span[text()='Buscar']/parent::button");

    //The text is captured after the search
    By TXT_VALIDATE_SEARCH = By.xpath("//div[text()='Medellín']");

    //The lowest price filter is captured after searching
    By LBL_VALIDATE_LOWERPRICE = By.xpath("//label[text()='Precio más bajo']");

    //Method to validate that after searching a low price filter is found
    public By getLBL_VALIDATE_LOWERPRICE() {
        return LBL_VALIDATE_LOWERPRICE;
    }

    //Get and Setter Methods
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