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
public class FindBranchPage extends Utility {
    private static final Logger log = LogManager.getLogger(FindBranchPage.class.getName());

    @FindBy(xpath = "//span[contains(text(),'Find a branch')]")
    WebElement _branchFinderText;

    public String getBranchFinderText() {
        Reporter.addStepLog("Getting branch finder text " + _branchFinderText.toString());
        log.info("Getting branch finder text " + _branchFinderText.toString());
        return getTextFromElement(_branchFinderText);

    }

}
