package StepDefinations;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//import cucumber.api.CucumberOptions;
//import cucumber.api.testng.CucumberFeatureWrapper;
//import cucumber.api.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue= {"StepDefinations"},
monochrome=false,
plugin = {"pretty","html:target/HtmlReports",
       "json:target/JsonReports/report.json",
       "junit:target/JUnitReports/report.xml"
     //   "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
          }
	)



public class TestRunner extends AbstractTestNGCucumberTests {

	public static ExtentReports extent;
	public static ExtentSparkReporter htmlspark;  
	public static ExtentTest test;
		
//	@Before
//	@BeforeSuite
	@BeforeTest
//	@BeforeClass
	public void SetupExtents() {		
		System.out.println("i am executing before test");
		System.out.println("Setups : Extented setups are done");
		
		extent = new ExtentReports();
		htmlspark = new ExtentSparkReporter("extent.html");
		extent.attachReporter(htmlspark);
		// ExtentTest test1= extent.createTest("google is opened");
	}	
//	@After
//	@AfterSuite
	@AfterTest
//	@AfterClass
	public void tearDown() {		
		extent.flush();		
	}	
}
