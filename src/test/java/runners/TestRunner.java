package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@smoke or @a1",
        plugin = {"pretty", "html:target/cucumber-report.html"},
        dryRun = true,
        monochrome = true
)
public class TestRunner {
}
