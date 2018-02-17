package Step_Definitions;

import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import pages.InvalidLoginPage;

import java.io.IOException;

public class InvalidLogin extends testBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }


    @Then("^i should see error message \"([^\"]*)\" details$")
    public void iShouldSeeErrorMessageDetails(String value) throws Throwable {
        //String ErrorMessage = driver.findElement(By.cssSelector("#center_column > div.alert.alert-danger")).getText();
        //System.out.println(ErrorMessage);

        InvalidLoginPage invalidloginpage = PageFactory.initElements(driver, InvalidLoginPage.class);
        invalidloginpage.verify_error_message();

        Thread.sleep(3000);
    }


}
