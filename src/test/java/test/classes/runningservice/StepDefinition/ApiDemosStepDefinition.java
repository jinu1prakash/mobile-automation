package test.classes.runningservice.StepDefinition;

import com.org.mobile.automation.services.DriverInitialiser;
import com.org.mobile.automation.services.WaitService;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ApiDemosStepDefinition {
    private WaitService waitService;
    @Given("^I open the application on android device$")
    public void i_open_the_application_on_android_device() throws Throwable {
        AppiumDriver driver = DriverInitialiser.getAndroidDriver();
        waitService = new WaitService(driver);
    }

    @Then("^I click on custom view using (.+) - (.+)$")
    public void i_click_on_custom_view_using_(String elementtype, String elementattribute) throws Throwable {
        waitService.visibilityOfElementToTap();
    }

}
