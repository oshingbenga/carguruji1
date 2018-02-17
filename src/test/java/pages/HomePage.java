package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {

    @FindBy(how= How.LINK_TEXT, using="htmlcontent-item-1 col-xs-4")
    public static WebElement item1;

    @FindBy(how= How.LINK_TEXT, using="htmlcontent-item-2 col-xs-4")
    public static WebElement item2;

    @FindBy(how= How.ID, using=" homepage-slider")
    public static WebElement homepage_slider;

    @FindBy(how= How.LINK_TEXT, using="homefeatured")
    public static WebElement popular;

    @FindBy(how= How.LINK_TEXT, using="blockbestsellers")
    public static WebElement best_seller;


    public void click_item_1(){
        item1.click();
    }
    public void click_item_2(){
        item2.click();
    }
    public void home_page_slider(){
        homepage_slider.isDisplayed();
    }
    public void click_home_featured(){
        popular.click();
    }
    public void click_best_sellers(){
        best_seller.click();
    }
}

