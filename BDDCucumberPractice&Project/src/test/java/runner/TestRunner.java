package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\bhara\\eclipse-workspace\\BDDCucumberPractice\\src\\test\\java\\features\\StepArgumentsPractice.feature",
			glue= {"steps"},
			dryRun=false,
			plugin= {"pretty",
			"html:target/cucumberreport.html"},
			//tags="@all"
			//tags="@login"
			//tags="@login and @logout"
			//tags="@login or @logout"
			//tags="not @logout"
			tags="@regression"
)
public class TestRunner {
	

}
