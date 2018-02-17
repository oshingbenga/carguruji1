package Step_Definitions;

import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import pages.AlreadyUserPage;

import java.io.IOException;

    public class  AlreadyUser extends testBase {

        @Before
        public void setup() throws IOException {
            initialize();
        }




    @Given("^i enter my registered email address in to the email field for new user$")
    public void i_enter_my_registered_email_address_in_to_the_email_field_for_new_user() throws Throwable {
        //driver.findElement(By.id("email_create")).sendKeys("oshingbenga@gmail.com");
        AlreadyUserPage alreadyuserpage = PageFactory.initElements(driver, AlreadyUserPage.class);
        alreadyuserpage.type_registered_email("oshingbenga@gmail.com");
        Thread.sleep(2000);
    }

    @Then("^i should have an error message that An account using this email address has already been registered\\. Please enter a valid password or request a new one\\.$")
    public void i_should_have_an_error_message_that_An_account_using_this_email_address_has_already_been_registered_Please_enter_a_valid_password_or_request_a_new_one() throws Throwable {
       // String ExpectedMessage = "An account using this email address has already been registered. Please enter a valid password or request a new one.";
        //String ActualMessage = driver.findElement(By.xpath("//*[@id=\"create_account_error\"]/ol/li")).getText();
        //System.out.println(ActualMessage);
        //Assert.assertEquals(ExpectedMessage,ActualMessage);
        AlreadyUserPage alreadyuserpage = PageFactory.initElements(driver,  AlreadyUserPage.class);
        alreadyuserpage.verify_email_already_registered();

    }

}
