package Utility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.cucumber.java.Before;

public class BaseSetupclass {
	
	public static ExtentReports extent;
	public static ExtentSparkReporter htmlspark;  
		
//	@Before
	@BeforeSuite
	@BeforeTest
	@BeforeClass
	public void SetupExtents() {
		
		System.out.println("i am executing before test");
		
		extent = new ExtentReports();
		htmlspark = new ExtentSparkReporter("extent.html");
		extent.attachReporter(htmlspark);
		// ExtentTest test1= extent.createTest("google");
	}
	
	@AfterSuite
	@AfterTest
	@AfterClass
	public void tearDown() {
		
		extent.flush();
		
		
	}
	
	
	
	


	public static void main(String[] args) {


	}
}
