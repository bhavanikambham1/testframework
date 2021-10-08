package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.PageInitializer;

public class LoginPageElements extends PageInitializer {



    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@class='shape-semi-rounded size-md status-primary']")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@id='toast-container']")
    public WebElement allertMessage;



public LoginPageElements(){
    PageFactory.initElements(driver , this);
}


}
