package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target//FailedScenario.txt//",
				glue= {"stepDefs"},
			//	dryRun= true,
				monochrome=true,
				plugin= {"pretty",
		
		  "html:target/reports/HtmlReport.html", "json:target/reports/JsonReport.json",
		  "usage:target/reports/UsageReport",
		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", //to
		 // generate extent report we need to add dependencies of ExtentReport and Cucumber7-adapter for extent report
		  "rerun:target/FailedScenario.txt"
		 
			}
		)



public class rerunRunner extends AbstractTestNGCucumberTests {
 
}
