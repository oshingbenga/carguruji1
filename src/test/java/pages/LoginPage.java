package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

    @FindBy(how= How.ID, using="email")
    public static WebElement myemail;

    @FindBy(how= How.ID, using="passwd")
    public static WebElement mypassword;

    @FindBy(how= How.CSS, using="#SubmitLogin")
    public static WebElement longin;

    @FindBy(how=How.LINK_TEXT, using="Forgot your password?")
    public static WebElement forgotpassword;

    @FindBy(how= How.ID, using="email_create")
    public static WebElement register_email;

    @FindBy(how= How.ID, using="SubmitCreate")
    public static WebElement create_an_account;


    public void type_email(String email){
        myemail.sendKeys(email);
    }
    public void type_password(String passwd){
        mypassword.sendKeys(passwd);
    }
    public void click_login(){
        longin.click();
    }
    public void click_forgot_your_password(){
        forgotpassword.click();
    }
    public void type_create_email(String email_create){
            register_email.sendKeys();
    }







}
