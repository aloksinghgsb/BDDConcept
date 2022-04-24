package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import util.DriverSetup;

public class HooksSteps {
	
	
	
	@Before
	public void setupBrowser() {
		DriverSetup.intializeWebDriver();
	}

	@After
	public void setupBrowserTearDown() {
		DriverSetup.setupBrowserTearDown();
		}
	
}
