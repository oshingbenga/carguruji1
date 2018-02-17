package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class InvalidLoginPage {

    @FindBy(how= How.CSS, using="#center_column > div.alert.alert-danger")
    public static WebElement there_is_1_error;

    public void verify_error_message(){there_is_1_error.isDisplayed();}

}
