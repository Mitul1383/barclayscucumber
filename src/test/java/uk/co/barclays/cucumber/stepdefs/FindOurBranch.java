package uk.co.barclays.cucumber.stepdefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.barclays.pages.ContactUsPage;
import uk.co.barclays.pages.FindBranchPage;
import uk.co.barclays.pages.HomePage;

/**
 * Created by Mitul
 */
public class FindOurBranch {
    @When("^I click on Contact Us Button$")
    public void iClickOnContactUsButton() {
        new HomePage().clickOnContactButton();
    }

    @Then("^I should be in Contact us page successfully$")
    public void iShouldBeInContactUsPageSuccessfully() {
        Assert.assertEquals(new ContactUsPage().getContactUsText(), "Contact us");
    }

    @When("^I click on Find a Branch button$")
    public void iClickOnFindABranchButton() {
        new HomePage().clickOnFindBranchButton();
    }

    @Then("^I should be in Find a Branch page successfully$")
    public void iShouldBeInFindABranchPageSuccessfully() {
        Assert.assertEquals(new FindBranchPage().getBranchFinderText(), "Branch Finder");
    }
}
