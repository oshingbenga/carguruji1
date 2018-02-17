package Step_Definitions;

import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Common extends testBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }

//    @Given("^that i am already on the Home Page$")
//    public void that_i_am_already_on_the_Home_Page() throws Throwable {
//

        @Given("^that i am already on the Home Page$")
        public void that_i_am_already_on_the_Home_Page() throws Throwable {
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.navigate().to("http://automationpractice.com/");
            JavascriptExecutor jse =(JavascriptExecutor) driver;
            jse.executeScript("window.scrollBy(0,800)", "");

        }


    @Given("^i can see a Logo Banner$")
    public void i_can_see_a_Logo_Banner() throws Throwable {
        CommonPage commonpage = PageFactory.initElements(driver, CommonPage.class);
        commonpage.verify_logo();


    }

    @When("^i click sign in button$")
    public void i_click_sign_in_button() throws Throwable {
        CommonPage commonpage = PageFactory.initElements(driver, CommonPage.class);
        commonpage.click_sign_in_button();


    }

}
