package TestRunner;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import driverManager.DriverHandling;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features="features",
                 glue= "StepDefinitions",
                // dryRun = true
                 plugin = {"rerun:target/report.txt"}
                 )
public class TestRunner {
	private static String Browser = "chrome";
	  
	  @BeforeClass
	  public static void setupBrowser() throws Exception 
	  { 
	  System.out.println("hi");
	  DriverHandling.setup(Browser); 
	  }
}
   

