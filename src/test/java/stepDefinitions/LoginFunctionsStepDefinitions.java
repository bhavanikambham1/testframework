package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

public class LoginFunctionsStepDefinitions extends CommonMethods {



    @When("I enter username as {string} and password as {string}")
    public void i_enter_username_as_and_password_as(String username, String password) {

        sendText(login.emailTextBox, username);
        sendText(login.passwordTextBox, password);

    }


    @When("I click login button")
    public void i_click_login_button() {
        click(login.loginButton);

    }

    @Then("I should not able to click Log in button")
    public void i_should_not_able_to_click_log_in_button() throws InterruptedException {
//        Thread.sleep(2000);
//        System.out.println("****************"+login.loginButton.isEnabled()+"****************");
      Assert.assertFalse(login.loginButton.isEnabled());

    }

    @Then("verify that error message displayed")
    public void verify_that_error_message_displayed() {
        CommonMethods.waitForClickability(login.allertMessage);
       Assert.assertTrue(login.allertMessage.isDisplayed());
    }




    @Given("I enter user name as {string} and password as {string}")
    public void i_enter_user_name_as_and_password_as(String username, String password) {
        sendText(login.emailTextBox, username);
        sendText(login.passwordTextBox, password);
    }


//    @Then("I verify greeting message {string} is displayed in dashboard")
//    public void i_verify_greeting_message_is_displayed_in_dashboard(String message) throws InterruptedException {
//        Thread.sleep(2000);
//        Assert.assertTrue(dash.dashboradLogo.isDisplayed());
//    }

    @Then("I verify that navigated dashboard page successfully")
    public void i_verify_that_navigated_dashboard_page_successfully() throws InterruptedException {
        Thread.sleep(3000);
        driver.navigate().refresh();
       CommonMethods.waitForClickability(dash.dashboradLogo);
        Assert.assertTrue(dash.dashboradLogo.isDisplayed());
    }





//----------------------------
//
//    @Then("verify that login must be unsuccessful")
//    public void verify_that_login_must_be_unsuccessful() {
//        Assert.assertTrue(login.loginButton.isDisplayed());
//    }
//
//    @When("I enter username as {string} and password as {string}")
//    public void i_enter_username_as_and_password_as(String username, String password) {
//        sendText(login.userNameTextBox, username);
//        sendText(login.passwordTextBox, password);
//    }
//
//    @Then("I should not able to click Log in button")
//    public void i_should_not_able_to_click_log_in_button() {
//        Assert.assertTrue(login.loginButton.isDisplayed());
//    }
//
//    @Given("I enter user name as {string}")
//    public void i_enter_user_name_as(String username) {
//        sendText(login.userNameTextBox, username);
//    }
//
//    @When("I enter password as {string}")
//    public void i_enter_password_as(String password) {
//        sendText(login.passwordTextBox, password);
//    }
//
//    @When("I click login button")
//    public void i_click_login_button() {
//        click(login.loginButton);
//    }
//
//    @Then("verify error message displayed")
//    public void verify_error_message_displayed() {
//        Assert.assertTrue(login.errorMessage.isDisplayed());
//    }
//
//    @Then("I verify greeting message is displayed in dashboard")
//    public void i_verify_greeting_message_is_displayed_in_dashboard() {
////        getWaitObject().until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@class=\"greeting ng-star-inserted\"]")));
//        Assert.assertTrue(dash.greetingMessage.isDisplayed());
//    }

}
