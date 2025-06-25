package Runner_Package;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/Features/Steps.feature"},
    glue = {"Com.QA.StepDefinition"},
    tags = "@Flow", // 🔁 New unified tag
    monochrome = true,
    dryRun = false,
    stepNotifications = false,
    plugin = {"pretty","html:Reports/report.html"}
)

public class Runner {

}
