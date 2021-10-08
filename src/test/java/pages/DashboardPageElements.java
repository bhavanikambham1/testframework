package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.PageInitializer;

public class DashboardPageElements extends PageInitializer {

@FindBy(xpath = "//div[@class='tw-flex tw-justify-start tw-p-2 tw-mt-2 tw-mb-2 tw-text-xs sidebar-logo']")
public WebElement dashboradLogo;











    public DashboardPageElements(){
        PageFactory.initElements(driver , this);
    }
}
