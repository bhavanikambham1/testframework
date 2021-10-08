package testBase;


import pages.DashboardPageElements;
import pages.LoginPageElements;


public class PageInitializer extends BaseClass {

    public static LoginPageElements login;
    public static DashboardPageElements dash;



    public static void initializePageObjects(){
        login = new LoginPageElements();
        dash = new DashboardPageElements();

    }

}
