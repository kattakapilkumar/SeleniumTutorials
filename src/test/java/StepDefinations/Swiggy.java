package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Swiggy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
			
			    WebDriver driver = null;
			    System.setProperty("webdriver.chrome.driver","C:/Users/HP/eclipse-workspace/SeleniumTutorials/src/test/resources/drivers/chromedriver.exe");
			    
			    driver = new ChromeDriver();
			    
			    driver.get("https://www.swiggy.com/");		    
			   	driver.findElement(By.xpath("//*[@class='_381fS _1oTLG _3BIgv']")).sendKeys("Hyderabad");
			   	Thread.sleep(2000);		   	
				driver.findElement(By.xpath("//*[@class='_381fS _1oTLG _3BIgv']/following::*[@class='_3lmRa'][1]")).click();
			    
				Thread.sleep(3000);
				
				//driver.close();
			   	
			   	
			   	
			   	

			
			
	
	   
	}

}
