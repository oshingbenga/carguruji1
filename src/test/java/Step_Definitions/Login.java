package Step_Definitions;

import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;
import pages.MyaccountPage;

import java.io.IOException;

public class Login extends testBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }




    @When("^i enter email address \"([^\"]*)\" details$")
    public void i_enter_email_address_details(String email) throws Throwable {
        //driver.findElement(By.id("email")).sendKeys(value);
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.type_email(email);

    }

    @When("^i enter the password \"([^\"]*)\" details$")
    public void i_enter_the_password_details(String passwd) throws Throwable {
        //driver.findElement(By.id("passwd")).sendKeys(value);
        LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
        loginpage.type_password(passwd);

    }

     @When("^i click the Login Button$")
    public void i_click_the_Login_Button() throws Throwable {

         LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
         loginpage.click_login();

     }

     @Then("^i should be logged in successfully\\.$")
    public void i_should_be_logged_in_successfully() throws Throwable {
        //driver.findElement(By.cssSelector("#center_column > p")).isDisplayed();
         MyaccountPage myaccountpage = PageFactory.initElements(driver, MyaccountPage.class );
         myaccountpage.verity_Welcome_to_my_account();

        Thread.sleep(5000);

    }

    @And("^sign out$")
    public void signOut() throws Throwable {
       // driver.findElement(By.className("logout")).click();
        MyaccountPage myaccountpage = PageFactory.initElements(driver,  MyaccountPage.class);
        myaccountpage.click_signout();


    }
  //  @Then("^Close the page$")
    //public void close_the_page() throws Throwable {
      //  driver.close();
   // }




///////////////////////////////////////////////////////////////////////////////////////////////////////


//
//
//
//    @Given("^i enter email address into the email field$")
//    public void i_enter_email_address_into_the_email_field() throws Throwable {
//        driver.findElement(By.id("email_create")).sendKeys("oshingbengaone1@gmail.com");
//    }
//
//
//
//    @Then("^click on create an account button$")
//    public void click_on_create_an_account_button() throws Throwable {
//        driver.findElement(By.id("SubmitCreate")).click();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    }
//
//    @Then("^a form called Your Personal Information page display$")
//    public void a_form_called_Your_Personal_Information_page_display() throws Throwable {
//        driver.findElement(By.className("page-subheading")).isDisplayed();
//
//
//    }
//
//    @Then("^i select Mr$")
//    public void i_select_Mr() throws Throwable {
//        driver.findElement(By.id("id_gender1")).click();
//    }
//
//    @Then("^i type in my First Name into the field provided$")
//    public void i_type_in_my_First_Name_into_the_field_provided() throws Throwable {
//        driver.findElement(By.id("customer_firstname")).sendKeys("oshin");
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    }
//
//    @Then("^i type in my Last Name into the field provided$")
//    public void i_type_in_my_Last_Name_into_the_field_provided() throws Throwable {
//        driver.findElement(By.id("customer_lastname")).sendKeys("gbenga");
//
//
//    }
//
//    @Then("^My email display$")
//    public void my_email_display() throws Throwable {
//        driver.findElement(By.id("email")).isDisplayed();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//    }
//
//    @Then("^i enter password into the password field$")
//    public void i_enter_password_into_the_password_field() throws Throwable {
//        driver.findElement(By.cssSelector("#passwd")).sendKeys("jesusislord");
//
//    }
//
//    @Then("^i select Date Of Birth from the combo$")
//    public void i_select_Date_Of_Birth_from_the_combo() throws Throwable {
//        driver.findElement(By.cssSelector("#days")).sendKeys("6");
//        driver.findElement(By.cssSelector("#months")).sendKeys("April");
//        driver.findElement(By.cssSelector("#years")).sendKeys("1980");
//
//    }
//
//    @Given("^my Fists name$")
//    public void my_Fists_name() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).isDisplayed();
//
//    }
//
//    @Given("^my Last Name$")
//    public void my_Last_Name() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).isDisplayed();
//
//    }
//
//    @Given("^my Address$")
//    public void my_Address() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("OLUBADAN");
//        Thread.sleep(4000);
//
//    }
//
//    @Given("^my City$")
//    public void my_City() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("London");
//        JavascriptExecutor jse =(JavascriptExecutor) driver;
//                jse.executeScript("window.scrollBy(0,400)", "");
//
//    }
//
//    @Given("^my State$")
//    public void my_State() throws Throwable {
//        Select ElementSelect = new Select(driver.findElement(By.id("id_state")));
//        ElementSelect.selectByValue("7");
//    }
//
//    @Given("^my Post Code$")
//    public void my_Post_Code() throws Throwable {
//        driver.findElement(By.id("postcode")).sendKeys("12345");
//
//    }
//
//    @Given("^my Country$")
//    public void my_Country() throws Throwable {
//        Select ElementSelect = new Select(driver.findElement(By.id("id_country")));
//        ElementSelect.selectByValue("21");
//
//
//    }
//
//    @Given("^enter Additional Information$")
//    public void enter_Additional_Information() throws Throwable {
//        driver.findElement(By.id("other")).sendKeys("I think am loving this ");
//
//    }
//
//    @Then("^enter Home Phone No$")
//    public void enter_Home_Phone_No() throws Throwable {
//        driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("079000000");
//
//    }
//
//    @Then("^Mobile Phone No$")
//    public void mobile_Phone_No() throws Throwable {
//        driver.findElement(By.cssSelector("#phone_mobile")).sendKeys("078000000");
//
//    }
//
//    @Then("^Assign an alias for future reference$")
//    public void assign_an_alias_for_future_reference() throws Throwable {
//        driver.findElement(By.cssSelector("#alias")).sendKeys("Maxwell");
//
//
//    }
//
//    @Then("^Click Register Button$")
//    public void click_Register_Button() throws Throwable {
//        driver.findElement(By.id("submitAccount")).click();
//
//    }
//
//    @And("^i can see a welcome Message$")
//    public void iCanSeeAWelcomeMessage() throws Throwable {
//       driver.findElement(By.cssSelector("#center_column > p")).isDisplayed();
//    }
//
//
//
//
//    //////////////////////////////////////////////////////////////////////////////////////////
//
//
//    @Given("^i enter my registered email address in to the email field for new user$")
//    public void i_enter_my_registered_email_address_in_to_the_email_field_for_new_user() throws Throwable {
//        driver.findElement(By.id("email_create")).sendKeys("oshingbenga@gmail.com");
//        Thread.sleep(2000);
//    }
//
//    @Then("^i should have an error message that An account using this email address has already been registered\\. Please enter a valid password or request a new one\\.$")
//    public void i_should_have_an_error_message_that_An_account_using_this_email_address_has_already_been_registered_Please_enter_a_valid_password_or_request_a_new_one() throws Throwable {
//      String ExpectedMessage = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
//      String ActualMessage = driver.findElement(By.xpath("//*[@id=\"create_account_error\"]/ol/li")).getText();
//      System.out.println(ActualMessage);
//      Assert.assertEquals(ExpectedMessage,ActualMessage);
//
//    }
//
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//
////
////    @Then("^i should see error message \"([^\"]*)\" details$")
////    public void iShouldSeeErrorMessageDetails(String value) throws Throwable {
////       String ErrorMessage = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger")).getText();
////       System.out.println(ErrorMessage);
////
////       Thread.sleep(3000);
////    }
}