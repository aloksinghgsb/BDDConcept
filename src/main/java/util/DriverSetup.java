package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	public static WebDriver driver;
	
	public static void intializeWebDriver() {
		System.setProperty("webdriver.chrome.driver","D:\\BDDConcept_Demo\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	}

	public static void setupBrowserTearDown() {
		driver.close();
		}
	
}
