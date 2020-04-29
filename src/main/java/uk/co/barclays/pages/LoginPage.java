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
public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @FindBy(id = "label-mainheading")
    WebElement _loginText;

    public String getLoginText() {
        Reporter.addStepLog("Getting Login text " + _loginText.toString());
        log.info("Getting Login text " + _loginText.toString());
        return getTextFromElement(_loginText);
    }


}
