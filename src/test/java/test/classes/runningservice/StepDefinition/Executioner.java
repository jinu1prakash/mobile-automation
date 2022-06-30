package test.classes.runningservice.StepDefinition;

import com.org.mobile.automation.services.DriverInitialiser;
import com.org.mobile.automation.services.ElementService;
import com.org.mobile.automation.services.ManageWebDriver;
import com.org.mobile.automation.services.WaitService;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;

import java.net.MalformedURLException;

public class Executioner {
    public static AppiumDriver driver;
    public static WaitService waitService;
    public static ElementService elementService;
    public static ManageWebDriver driverManager;

    @Before
    public void setUp() throws MalformedURLException {
        if (driver == null) {
            driver = DriverInitialiser.getAndroidDriver();
            driverManager = new ManageWebDriver(driver);
            waitService = new WaitService(driver);
            elementService = new ElementService(driver);
        }
    }


}
