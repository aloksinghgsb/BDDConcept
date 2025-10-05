package util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverSetup {
	public static WebDriver driver;
	
	public static void intializeWebDriver() {
		//System.setProperty("webdriver.chrome.driver","D:\\BDDConcept_Demo\\drivers\\chromedriver.exe");
	    //driver = new ChromeDriver();
		driver= WebDriverManager.chromedriver().create();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public static void setupBrowserTearDown() {
		driver.close();
		}
	
}
