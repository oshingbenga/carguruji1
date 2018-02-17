package Step_Definitions;

import base.testBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import pages.RegisterPage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Register extends testBase {

    @Before
    public void setup() throws IOException {
        initialize();
    }

   @Given("^i enter new email address into the email field$")
    public void i_enter_new_email_address_into_the_email_field() throws Throwable {
        //driver.findElement(By.id("email_create")).sendKeys("oshingbengaone1@gmail.com");
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.enter_new_email();
    }

    @Then("^click on create an account button$")
    public void click_on_create_an_account_button() throws Throwable {
        //driver.findElement(By.id("SubmitCreate")).click();
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.click_create_an_account();


        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Then("^a form called Your Personal Information page display$")
    public void a_form_called_Your_Personal_Information_page_display() throws Throwable {
        //driver.findElement(By.className("page-subheading")).isDisplayed();
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.verify_form();


    }

    @Then("^i select Mr$")
    public void i_select_Mr() throws Throwable {
        //driver.findElement(By.id("id_gender1")).click();
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.click_mr();
    }

    @Then("^i type in my First Name into the field provided$")
    public void i_type_in_my_First_Name_into_the_field_provided() throws Throwable {
        //driver.findElement(By.id("customer_firstname")).sendKeys("oshin");
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.type_first_name();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Then("^i type in my Last Name into the field provided$")
    public void i_type_in_my_Last_Name_into_the_field_provided() throws Throwable {
        //driver.findElement(By.id("customer_lastname")).sendKeys("gbenga");
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.type_last_name();


    }

    @Then("^My email display$")
    public void my_email_display() throws Throwable {
        //driver.findElement(By.id("email")).isDisplayed();
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.verify_email();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @Then("^i enter password into the password field$")
    public void i_enter_password_into_the_password_field() throws Throwable {
        //driver.findElement(By.cssSelector("#passwd")).sendKeys("jesusislord");
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.type_new_password();

    }

    @Then("^i select Date Of Birth from the combo$")
    public void i_select_Date_Of_Birth_from_the_combo() throws Throwable {
        //driver.findElement(By.cssSelector("#days")).sendKeys("6");
        //driver.findElement(By.cssSelector("#months")).sendKeys("April");
        //driver.findElement(By.cssSelector("#years")).sendKeys("1980");
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.type_days();
        registerpage.type_months();
        registerpage.type_year();

    }

    @Given("^my Fists name$")
    public void my_Fists_name() throws Throwable {
        //driver.findElement(By.xpath("//*[@id=\"firstname\"]")).isDisplayed();
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.verify_first_name();

    }

    @Given("^my Last Name$")
    public void my_Last_Name() throws Throwable {
        //driver.findElement(By.xpath("//*[@id=\"lastname\"]")).isDisplayed();
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.verify_last_name();

    }

    @Given("^my Address$")
    public void my_Address() throws Throwable {
        //driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("OLUBADAN");
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.type_address();

        Thread.sleep(4000);

    }

    @Given("^my City$")
    public void my_City() throws Throwable {
        //driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("London");
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.type_city();

        JavascriptExecutor jse =(JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,400)", "");

    }

   @Given("^my State$")
    public void my_State() throws Throwable {
        //Select ElementSelect = new Select(driver.findElement(By.id("id_state")));
       // ElementSelect.selectByValue("7");
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.click_state();
    }

    @Given("^my Post Code$")
    public void my_Post_Code() throws Throwable {
        //driver.findElement(By.id("postcode")).sendKeys("12345");
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.type_postcode();

    }

    @Given("^my Country$")
    public void my_Country() throws Throwable {
        //Select ElementSelect = new Select
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.click_country();
        //(driver.findElement(By.id("id_country")));
       // ElementSelect.selectByValue("21");


    }

    @Given("^enter Additional Information$")
    public void enter_Additional_Information() throws Throwable {
        //driver.findElement(By.id("other")).sendKeys("I think am loving this ");
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.type_additional_information();

    }

    @Then("^enter Home Phone No$")
    public void enter_Home_Phone_No() throws Throwable {
        //driver.findElement(By.xpath("//*[@id=\"phone\"]")).sendKeys("079000000");
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.type_home_no();

    }

    @Then("^Mobile Phone No$")
    public void mobile_Phone_No() throws Throwable {
        //driver.findElement(By.cssSelector("#phone_mobile")).sendKeys("078000000");
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.type_mobile_no();

    }

    @Then("^Assign an alias for future reference$")
    public void assign_an_alias_for_future_reference() throws Throwable {
        //driver.findElement(By.cssSelector("#alias")).sendKeys("Maxwell");
        RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
        registerpage.type_future_reference();


    }

  //  @Then("^Click Register Button$")
    //public void click_Register_Button() throws Throwable {
    //driver.findElement(By.id("submitAccount")).click();

    //RegisterPage registerpage = PageFactory.initElements(driver, RegisterPage.class);
    //registerpage.click_register();

    //}

  //  @And("^i can see a welcome Message$")
  //  public void iCanSeeAWelcomeMessage() throws Throwable {
    //    driver.findElement(By.cssSelector("#center_column > p")).isDisplayed();
   // }


   }
