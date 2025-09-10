package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/java/featureFiles"},
                            glue = { "stepDefinations" },
                            plugin = { "pretty","html:target/cucumber-reports", "json:target/json-reports.json", "junit:target/junit-reports.xml",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"rerun:target/failedrerun.txt" },
                  tags = "@LoginSmoke1",
                  monochrome = true)
public class SmokeRunner extends AbstractTestNGCucumberTests {

	
}
