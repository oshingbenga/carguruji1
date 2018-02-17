package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class testBase {

    //initializing the property file reading
    public static Properties CONFIG=null;
    public static WebDriver driver=null;
    public int random;

    public void initialize() throws IOException {
        if(driver == null){

            String browser = "chrome";
            //firefox, ie

            //Initialize the webdriver
            if (browser.equals("chrome")){
                System.setProperty("webdriver.chrome.logfile", "TestLog.txt");
                System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                //options.addArguments("window--size=1400,800");
                //options.addArguments("headless");
                driver = new ChromeDriver(options);

            }else if(browser.equals("IE")){
                System.setProperty("webdriver.chrome.driver", "C:\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();

            }

            else if(browser.equals("firefox")){
                driver = new FirefoxDriver();
            }

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }
}