package test.classes.runningservice.StepDefinition;

import com.org.mobile.automation.services.DriverInitialiser;
import com.org.mobile.automation.services.ElementService;
import com.org.mobile.automation.services.ManageWebDriver;
import com.org.mobile.automation.services.WaitService;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.net.MalformedURLException;

public class ApiDemosStepDefinition {
    private WaitService waitService;
    private ElementService elementService;
    private AppiumDriver driver;
    public static ManageWebDriver driverManager;

    @Given("^I open the application on android device$")
    public void i_open_the_application_on_android_device() throws Throwable {
        driver = Executioner.driver;
        waitService = new WaitService(driver);
        System.out.println("Open App");
    }

    @Then("^I click on custom view using (.+) - (.+)$")
    public void i_click_on_custom_view_using_(String elementType, String elementAttribute) throws Throwable {
        Executioner.elementService.tapElementByVisibility(elementType,elementAttribute);
//        waitService.visibilityOfElementToTap(elementType,elementAttribute);
    }

}
