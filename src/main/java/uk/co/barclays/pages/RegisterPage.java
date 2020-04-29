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
public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    @FindBy(xpath = "//h2[@class='h2 jumbo-title']")
    WebElement _registerText;

    public String getRegisterText() {
        Reporter.addStepLog("Getting register text " + _registerText.toString());
        log.info("Clicking register text " + _registerText.toString());
        return getTextFromElement(_registerText);
    }

}
