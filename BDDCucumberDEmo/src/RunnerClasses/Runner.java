package RunnerClasses;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\TestCases\\sanity.feature",
		glue= {"StepDefinition"},
		dryRun=true,
		monochrome=true,
		plugin= {"pretty","html:test-output"})




public class Runner {

}
