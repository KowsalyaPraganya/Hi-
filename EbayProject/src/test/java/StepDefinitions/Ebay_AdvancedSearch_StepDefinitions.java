package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import TestRunner.TestRunner;
import driverManager.DriverHandling;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ebay_AdvancedSearch_StepDefinitions {

	@Given("User is on Advanced Search Page")
	public void user_is_on_advanced_search_page() {
		DriverHandling.getDriver().get("https://www.ebay.com/sch/ebayadvsearch");
	}

	@When("clicks Findstores button")
	public void clicks_findstores_button() {
		DriverHandling.getDriver().findElement(By.partialLinkText("Find Stores")).click();
	}

	@When("Enter storename or keyword as {string}")
	public void enter_storename_or_keyword(String StoreName) throws InterruptedException {
		DriverHandling.getDriver().findElement(By.name("store_search")).sendKeys(StoreName);
		try {
			DriverHandling.getDriver().findElement(By.xpath("//button[@type = 'submt']")).click();
		} catch (Exception e) {
			System.out.println("Locators error");
			Assert.fail(e.getMessage());
		}

	}

	@Then("He could see store detail")
	public void he_could_see_store_detail() {
		String searchResult = DriverHandling.getDriver()
				.findElement(By.xpath("//span[contains(text(), \"stores found with\")]")).getText();

		if (searchResult.contains("stores found with")) {
			System.out.println("then expected message seen");
			System.out.println("Then Error");

		}
	}

	@Then("He could be instructes to search with another name")
	public void he_could_be_instructes_to_search_with_another_name() {
		String actMsg = DriverHandling.getDriver().findElement(By.xpath("//*[contains(text(), 'We couldn')]"))
				.getText();
		String expMsg = "We couldn't find any stores";
		if (actMsg.contains(expMsg)) {
			System.out.println("then 1 expected message seen");

		}

	}

}
