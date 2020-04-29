package uk.co.barclays.cucumber.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.barclays.pages.HomePage;
import uk.co.barclays.pages.LoginPage;
import uk.co.barclays.pages.RegisterPage;

/**
 * Created by Mitul
 */
public class LoginAndRegister {
    @Given("^I am on Home Page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on Login button$")
    public void iClickOnLoginButton() {
        new HomePage().clickOnLoginButton();

    }

    @Then("^I should be in Login page successfully$")
    public void iShouldBeInLoginPageSuccessfully() {
        Assert.assertEquals(new LoginPage().getLoginText(), "How would you like to log in?");
    }

    @When("^I click on Register button$")
    public void iClickOnRegisterButton() {
        new HomePage().clickOnRegisterButton();
    }

    @Then("^I should be in Register page successfully$")
    public void iShouldBeInRegisterPageSuccessfully() {
        Assert.assertEquals(new RegisterPage().getRegisterText(), "Register for Online Banking");
    }
}
