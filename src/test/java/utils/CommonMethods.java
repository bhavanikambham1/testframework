package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testBase.PageInitializer;

public class CommonMethods extends PageInitializer {

    /**
     * Method that send text to any given elements
     * @param element
     * @param text
     */
    public static void sendText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }
    public static void click(WebElement element){
        waitForClickability(element);
        element.click();
    }

    public static WebDriverWait getWaitObject(){

        return new WebDriverWait(driver , Constants.EXPLICIT_WAIT_TIME);
    }

    public static void waitForClickability(WebElement element){
        getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
    }


}
