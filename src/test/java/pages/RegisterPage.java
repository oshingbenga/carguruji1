package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage {


    @FindBy(how=How.ID, using="email_create")
    public static WebElement new_email;

    @FindBy(how= How.ID, using="SubmitCreate")
    public static WebElement create_an_account;

    @FindBy(how=How.XPATH, using="//*[@id=\'account-creation_form\']/div[1]/h3")
    public static WebElement your_personal_information;

    @FindBy(how=How.ID, using="id_gender1")
    public static WebElement Mr;

    @FindBy(how=How.ID, using="customer_firstname")
    public static WebElement first_name;

    @FindBy(how=How.ID, using="customer_lastname")
    public static WebElement last_name;

    @FindBy(how=How.ID, using="email")
    public static WebElement email_displayed;

    @FindBy(how=How.CSS, using="#passwd")
    public static WebElement new_password;

    @FindBy(how=How.CSS, using="#days")
    public static WebElement day;
    @FindBy(how=How.CSS, using="#months")
    public static WebElement mouth;
    @FindBy(how=How.CSS, using="#years")
    public static WebElement year;


    @FindBy(how=How.XPATH, using="//*[@id=\"firstname\"]")
    public static WebElement my_firstname;

    @FindBy(how=How.XPATH, using="//*[@id=\"lastname\"]")
    public static WebElement my_lastname;

    @FindBy(how=How.XPATH, using="//*[@id=\"address1\"]")
    public static WebElement my_address;

    @FindBy(how=How.XPATH, using="//*[@id=\"city\"]")
    public static WebElement my_city;

    @FindBy(how=How.ID, using="id_state")
    public static WebElement my_state;

    @FindBy(how=How.ID, using="postcode")
    public static WebElement my_postcode;

    @FindBy(how=How.ID, using="id_country")
    public static WebElement my_country;

    @FindBy(how=How.ID, using="other")
    public static WebElement additional_information;

    @FindBy(how=How.XPATH, using="//*[@id=\"phone\"]")
    public static WebElement home_phone_no;

    @FindBy(how=How.CSS, using="#phone_mobile")
    public static WebElement mobile_phone_no;

    @FindBy(how=How.CSS, using="#alias")
    public static WebElement future_reference;


    //@FindBy(how=How.ID, using="submitAccount")
    //public static WebElement register;






    public void enter_new_email(){new_email.sendKeys("oshingbenga123@gmail.com");}
    public void click_create_an_account(){create_an_account.click();}
    public void verify_form(){your_personal_information.isDisplayed();}
    public void click_mr(){Mr.click();}
    public void type_first_name(){first_name.sendKeys("oshin");}
    public void type_last_name(){last_name.sendKeys("gbenga");}
    public void verify_email(){email_displayed.isDisplayed();}
    public void type_new_password(){new_password.sendKeys("jesusislord");}
    public void type_days(){day.sendKeys("6");}
    public void type_months(){mouth.sendKeys("April");}
    public void type_year(){year.sendKeys("1980");}
    public void verify_first_name(){my_firstname.isDisplayed();}
    public void verify_last_name(){my_lastname.isDisplayed();}
    public void type_address(){my_address.sendKeys("OLUBADAN");}
    public void type_city(){my_city.sendKeys("London");}
    public void click_state(){my_state.click();}
    public void type_postcode(){my_postcode.sendKeys("1234");}
    public void click_country(){my_country.click();}
    public void type_additional_information(){additional_information.sendKeys("I think am loving this");}
    public void type_home_no(){home_phone_no.sendKeys("079999999");}
    public void type_mobile_no(){mobile_phone_no.sendKeys("078888888");}
    public void type_future_reference(){future_reference.sendKeys("Maxwell");}
   // public void click_register(){register.click();}





}
