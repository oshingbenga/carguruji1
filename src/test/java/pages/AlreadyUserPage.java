package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AlreadyUserPage {

    @FindBy(how= How.ID, using="email_create")
    public static WebElement registered_email;

    @FindBy(how=How.ID, using="create_account_error")
    public static WebElement account_error_message;



    public void type_registered_email(String email_create){ registered_email.sendKeys("oshingbenga@gmail.com");}
    public void verify_email_already_registered(){account_error_message.isDisplayed();}

}
