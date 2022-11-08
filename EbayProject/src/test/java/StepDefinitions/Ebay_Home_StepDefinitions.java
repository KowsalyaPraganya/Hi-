package StepDefinitions;

import static org.junit.Assert.fail;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import TestRunner.TestRunner;
import driverManager.DriverHandling;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ebay_Home_StepDefinitions {

	@Given("User is on home page")
	public void user_is_on_home_page() {
       DriverHandling.getDriver().get("https://www.ebay.com/");
	}

	@When("Clicks Advanced")
	public void clicks_advanced() {
		DriverHandling.getDriver().findElement(By.partialLinkText("Advanced")).click();
	}

	@Then("User will be directed to Advanced search Page")
	public void user_will_be_directed_to_advanced_search_page() {
		String actUrl = DriverHandling.getDriver().getCurrentUrl();
		String expUrl = "https://www.ebay.com/sch/ebayadvsearch";
		if (!actUrl.equals(expUrl))
			Assert.fail("User is not directed to Advanced Search page");
	}

}
