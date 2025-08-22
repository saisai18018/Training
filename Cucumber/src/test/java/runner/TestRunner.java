package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = {"stepDefinitions", "hooks"},
    plugin = {
        "pretty",
        "html:target/cucumber-report.html",
        "json:target/cucumber-report.json",
        "junit:target/cucumber-report.xml"
    },
    monochrome = true
    // , tags = "@smoke"    // uncomment if you want to run only tagged scenarios
    // , dryRun = false     // set true to verify step mappings without running browser
    // , publish = true     // publish report to Cucumber Reports (requires internet)
)
public class TestRunner {}
