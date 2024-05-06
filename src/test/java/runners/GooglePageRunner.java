package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//features//",
				glue= {"stepDefs"},
			//	dryRun= true,
				monochrome=true,
				plugin= {"pretty","html:target/reports/HtmlReport.html"}
		)



public class GooglePageRunner extends AbstractTestNGCucumberTests {
 
}
