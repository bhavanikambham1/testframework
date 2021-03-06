package testBase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.ConfigsReader;
import utils.Constants;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    protected static WebDriver driver;

    public static void setUp() {

        ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);

        switch (ConfigsReader.getPropValue("browser").toLowerCase(Locale.ROOT)) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                driver = new ChromeDriver();
                break;

            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;

            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;

            default:
                throw new RuntimeException("Browser is not supported");
        }

        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
        driver.get(ConfigsReader.getPropValue("applicationUrl"));
        PageInitializer.initializePageObjects();
    }

    public static void tearDown(){

        if(driver != null){
            driver.quit();
        }

    }
}
