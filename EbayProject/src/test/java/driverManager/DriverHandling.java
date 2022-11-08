package driverManager;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import TestRunner.TestRunner;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverHandling {
	public static WebDriver getDriver() {
		return driver;
	}

	private static WebDriver driver;
	
	@Before
    public static void setup(String Browser) throws Exception {
		System.out.println("entering");
		
		switch (Browser) {
		case "chrome":
			System.out.println("chrome opening");
            WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "Edge":
			System.out.println("edge opening");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();}}}
