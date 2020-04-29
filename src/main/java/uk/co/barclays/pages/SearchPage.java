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
public class SearchPage extends Utility {

    private static final Logger log = LogManager.getLogger(SearchPage.class.getName());

    @FindBy(xpath = "//button[@class='btn-search btn btn-primary btn-sm']")
    WebElement _welcomeText;

    public String getWelcomeText() {
        Reporter.addStepLog("Getting welcome test " + _welcomeText.toString());
        log.info("Getting welcome text " + _welcomeText.toString());
        return getTextFromElement(_welcomeText);
    }

}
