package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\bhara\\eclipse-workspace\\Phase2_EndProject\\src\\test\\java\\Features\\HealthcarePage.feature",
				 glue= {"steps"},
				 plugin= {"html:target/Cucumberreport.html",
						 "pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"timeline:test-output-thread/"		
				},
				 monochrome=true,
				 tags = "@all"
				 
		)
public class testRunner {
	

}
