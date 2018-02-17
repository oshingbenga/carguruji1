package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyaccountPage {
    @FindBy(how= How.CLASS_NAME, using="logout")
    public static WebElement signout;

        @FindBy(how= How.CLASS_NAME, using= "home")
        public static WebElement Retun_to_homepage;

        @FindBy(how= How.CSS, using="#columns > div.breadcrumb.clearfix > span.navigation_page")
        public static WebElement my_account;

        @FindBy(how=How.XPATH, using="//*[@id=\'center_column\']/p")
        public static WebElement Welcome_to_my_account;




        public void click_signout(){signout.click();}
        public void click_Retun_to_homepage(){Retun_to_homepage.click();}
        public void click_my_account(){my_account.click();}
        public void verity_Welcome_to_my_account(){Welcome_to_my_account.isDisplayed();}




}
