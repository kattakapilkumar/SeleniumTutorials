package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utility.BaseSetupclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps extends BaseSetupclass {
	
	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {
	   
		String projectPath = System.getProperty("user.dir");
		
		System.out.println("");	
		System.setProperty("webdriver.chrome.driver","C:/Users/HP/eclipse-workspace/SeleniumTutorials/src/test/resources/drivers/chromedriver.exe");
		
		driver = new ChromeDriver();
				
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
		
		driver.navigate().to("https://google.com");
		Thread.sleep(5000);
		String dtitle = driver.getTitle();
		Assert.assertTrue(dtitle.contains("a"));
		
	}

	@When("user enters a text search box")
	public void user_enters_a_text_search_box() {
	  
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		
	}

	@When("hits enter")
	public void hits_enter() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		
		driver.getPageSource().contains("online Courser");
		driver.close();
		driver.quit();
	  
	}

}
