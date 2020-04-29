package uk.co.barclays.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.barclays.utility.Utility;

/**
 * Created by Mitul
 */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Log In")
    WebElement _loginLink;
    @FindBy(linkText = "Register")
    WebElement _registerLink;
    @FindBy(xpath = "//span[contains(text(),'Contact us')]")
    WebElement _contactUsLink;
    @FindBy(xpath = "//span[contains(text(),'Find a branch')]")
    WebElement _findBranchLink;
    @FindBy(xpath = "//li[@class='search']//span[contains(text(),'Search')]")
    WebElement _searchLink;

    public void clickOnLoginButton() {
        Reporter.addStepLog("Clicking on login button " + _loginLink.toString());
        log.info("Clicking on login button " + _loginLink.toString());
        clickOnElement(_loginLink);
    }

    public void clickOnRegisterButton() {
        Reporter.addStepLog("Clicking on Register button " + _registerLink.toString());
        log.info("Clicking on Register button " + _registerLink.toString());
        clickOnElement(_registerLink);
    }

    public void clickOnContactButton() {
        Reporter.addStepLog("Clicking on contact button " + _contactUsLink.toString());
        log.info("Clicking on contact button " + _contactUsLink.toString());
        clickOnElement(_contactUsLink);
    }

    public void clickOnFindBranchButton() {
        Reporter.addStepLog("Clicking on find branch button " + _findBranchLink.toString());
        log.info("Clicking on find bramch button " + _findBranchLink.toString());
        clickOnElement(_findBranchLink);
    }

    public void clickOnSearchButton() {
        Reporter.addStepLog("Clicking on search button " + _searchLink.toString());
        log.info("Clicking on search button " + _searchLink.toString());
        clickOnElement(_searchLink);
    }


}
