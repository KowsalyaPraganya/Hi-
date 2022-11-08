package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="@target/report.txt",
                 glue= "StepDefinitions"

                // dryRun = true
             //tags = "@PK"
                 )
public class ReRunner {

}
