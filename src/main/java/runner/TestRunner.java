package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/java/feature"
, glue="steps" , dryRun= false, plugin = {"pretty", "html:target/cucumber"})

public class TestRunner {
	


}
