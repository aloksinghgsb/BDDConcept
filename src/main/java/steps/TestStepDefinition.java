package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.DriverSetup;

public class TestStepDefinition {

	
	WebDriver driver = DriverSetup.driver;
	@Given("I am in the login page of the Para Bank Application")
	public void i_am_in_the_login_page_of_the_Para_Bank_Application() {
	    
	    driver.get("https://parabank.parasoft.com/parabank/index.htm");
	    driver.manage().window().maximize();
	}

	@When("I entered valid credentials")
	public void i_entered_valid_credentials() {
		driver.findElement(By.name("username")).sendKeys("EJS");
		driver.findElement(By.name("password")).sendKeys("1234");
		driver.findElement(By.name("username")).submit();
	}
	
	@When("I entered valid {string} and {string}")
	public void i_entered_valid_tautester_and_password(String username, String password) {
	    driver.findElement(By.name("username")).sendKeys(username);
	    driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.name("username")).submit();
	}

	@When("I entered {string} and {string}")
	public void i_entered_and(String uname, String pwd) {
		driver.findElement(By.name("username")).sendKeys(uname);
	    driver.findElement(By.name("password")).sendKeys(pwd);
	    driver.findElement(By.name("username")).submit();
	}
	
	@When("I entered valid credentials using dataTable")
	public void i_entered_valid_credentials_using_dataTable(DataTable table) {
		List<String> loginForm = table.asList();
		driver.findElement(By.name("username")).sendKeys(loginForm.get(0));
	    driver.findElement(By.name("password")).sendKeys(loginForm.get(1));
	    driver.findElement(By.name("username")).submit();
	}
	
	@Then("I should be taken to the Overview page")
	public void i_should_be_taken_to_the_Overview_page() throws InterruptedException {
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1")).isDisplayed();
	    //System.out.println("Logout link: "+driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/h1")).isDisplayed());
	    driver.findElement(By.linkText("Log Out")).click();
	    
		   
//	    driver.close();
		
	}

	
}
