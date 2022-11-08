package TestRunner;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import driverManager.DriverHandling;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",
                 glue= "StepDefinitions"
                // dryRun = true
                //tags = "@P1"
                 )
public class TestRunnerFireFox {

	public static String Browser = "Edge";
	
	  @BeforeClass
	  public static void setupBrowser() throws Exception {
	  DriverHandling.setup(Browser); 
	  }
	 
}
