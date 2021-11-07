package StepDefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Utility.BaseSetupclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.LoginPage_PF;

public class LoginDemoStepdefination2_PF extends BaseSetupclass {
	
	WebDriver driver = null;
	
	LoginPage_PF obj ;
	
	@Test
	//@Test (priority=1)
	@Given("brower is open")
	public void brower_is_open() throws InterruptedException {
		
	String projectPath = System.getProperty("user.dir");
		
	System.out.println("");	
	System.setProperty("webdriver.chrome.driver","C:/Users/HP/eclipse-workspace/SeleniumTutorials/src/test/resources/drivers/chromedriver.exe");
	
	driver = new ChromeDriver();
			
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	    Thread.sleep(2000);
	}

//	@Test (priority=2)
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("https://example.testproject.io/web/");
		System.out.println("i am here");
	}
    
	
	//@Test (priority=3)
//	@Parameters({"username","password"})
	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
		
		obj = new LoginPage_PF(driver); 	
		System.out.println(username);
		System.out.println(password);
		obj.enterUsername(username);
		obj.enterPassword(password);
		obj.clickLogin();
		
		
		//driver.findElement(By.id("name")).sendKeys(username);
		//driver.findElement(By.id("password")).sendKeys(password);
		//driver.findElement(By.id("login")).click();
		Thread.sleep(2000);

	}
    
	
//	@Test (priority=4)
	@Then("user is navigated")
	public void user_is_navigated() {
		
		
		driver.findElement(By.id("logout")).isDisplayed();
		
		driver.close();
		driver.quit();
	}

}
