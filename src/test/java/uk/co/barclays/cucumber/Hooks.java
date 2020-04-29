package uk.co.barclays.cucumber;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.co.barclays.basepage.BasePage;
import uk.co.barclays.browserselector.BrowserSelector;
import uk.co.barclays.loadproperty.LoadProperty;
import uk.co.barclays.utility.Utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by Mitul
 */
public class Hooks extends BasePage {
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseUrl = loadProperty.getProperty("baseUrl");

    String browser = loadProperty.getProperty("browser");

    @Before
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
        Reporter.assignAuthor("Mitul", "Patel");
    }

    @After
    public void tearDown(Scenario scenario) throws IOException {
        if (scenario.isFailed()) {
            String screenShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
            try {
                Reporter.addScreenCaptureFromPath(screenShotPath);
            } catch (IOException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }


}
