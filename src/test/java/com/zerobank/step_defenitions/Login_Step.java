package com.zerobank.step_defenitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_Step {

LoginPage loginPage = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

           }

    @When("user logs in with valid credentials")
    public void user_logs_in_with_valid_credentials()  {

        loginPage.login();

    }
    @Then("account summary page should be displayed")
    public void account_summary_page_should_be_displayed()  {

        String expected = "Zero - Account Summary";
        String actual = Driver.getDriver().getTitle();
        Assert.assertTrue(actual.contains(expected));

//        String actual = loginPage.getPageSubTitleText().trim();
//
//        Assert.assertEquals("Title is not correct!", expected, actual);
//        System.out.println("I see the Dashboard page!");
//        Driver.closeDriver();


    }
    @When("user try logs  with invalid credentials")
    public void user_try_logs_with_invalid_credentials() {

    }
    @Then("account summary page should be displayed error message")
    public void account_summary_page_should_be_displayed_error_message() {

    }
}

