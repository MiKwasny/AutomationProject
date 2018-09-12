package stepDefinitions;

import AutomationProject.MainFolder.Actions;
import AutomationProject.MainFolder.Config;
import AutomationProject.MainFolder.WebBrowserLaunch;
import AutomationProject.TestAssertions.TestAssertions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class MyStepDefinitions {

    @Given("^User is on PHP Travels main page$")
    public void user_is_on_php_travels_main_page() throws Throwable {
        WebBrowserLaunch.Launch();
        Actions.GoToLoginPage();
    }

    @When("^User Log into application with username and password$")
    public void user_log_into_application_with_username_and_password() throws Throwable {

        Actions.FillLoginForm(Config.Credentials.Valid.Username, Config.Credentials.Valid.Password);
    }

    @Then("^Account page is displayed$")
    public void account_page_is_displayed() throws Throwable {

        TestAssertions.FinaLoginPageCheck();
    }

    @And("^Booked Reservations are visible on the page$")
    public void booked_reservations_are_visible_on_the_page() throws Throwable {

        TestAssertions.FinalLoginBookingPageCheck();
    }

}