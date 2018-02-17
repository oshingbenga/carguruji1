package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CommonPage {

    @FindBy(how = How.ID, using = "contact-link")
    public static WebElement contactus;

    @FindBy(how = How.CLASS_NAME, using = "login")
    public static WebElement signin;

    @FindBy(how = How.CSS, using = "#block_top_menu > ul > li:nth-child(1) > a")
    public static WebElement WOMEN;

    @FindBy(how = How.CSS, using = "#block_top_menu > ul > li:nth-child(2) > a")
    public static WebElement DRESSES;

    @FindBy(how = How.CSS, using = "#block_top_menu > ul > li:nth-child(3) > a")
    public static WebElement TSHIRTS;

    @FindBy(how = How.ID, using = "header_logo")
    public static WebElement headerlogo;


    public void click_contact_us() {
        contactus.click();
    }

    public void click_sign_in_button() {
        signin.click();
    }

    public void click_women_button() {
        WOMEN.click();
    }

    public void click_dresses_button() {
        DRESSES.click();
    }

    public void click_tshirts_us() {
        TSHIRTS.click();
    }

    public void verify_logo(){ headerlogo.isDisplayed();
    }
}
