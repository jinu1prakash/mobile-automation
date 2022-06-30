package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/feature-files",glue = "test/classes/runningservice/StepDefinition",tags = "@apkdemotest",plugin = {
        "pretty",
        "json:build/cucumber-report/cucumber.json",
        "html:build/cucumber-report/cucumber.html",
        "junit:build/cucumber-report/cucumber.xml"})
public class TestRunner {


}
