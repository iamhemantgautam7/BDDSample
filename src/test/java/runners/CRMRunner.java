package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class CRMRunner {
@CucumberOptions(features = "src//test//resources//taggedFeature//",
				glue= {"stepDefs"},
			//	dryRun= true,
				monochrome=true,
				plugin= {"pretty",
		
		  "html:target/reports/HtmlReport.html", }
//				tags="@SmokeTest"   //only Smoke will run
//				tags="@RegressionTest or @SmokeTest" //both Smoke and Regression will run
//				tags="@RegressionTest and @SmokeTest" // any Scenario tagged with Regression and smoke both only will run
//				tags="@PhaseOne"  //this is feature level Tag
//				tags="@PhaseTwo and @SmokeTest"  //This will run PhaseTwo Smoke test only 
//				tags="@PhaseTwo and not @SmokeTest"  //This will run from PhaseTwo but not Smoke test
//				tags="@PhaseTwo and not @SmokeTest or @PhaseOne and @SmokeTest"  //will not run smoke from phase2 and will run smoke from phase1
				//we can also tag the hooks like @Before(@SmokeTest)
		)

public class GooglePageRunner extends AbstractTestNGCucumberTests {
 
}


}
