package Utility;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentRprts {
	
	
	@BeforeSuite
	@BeforeTest
	public void SetupExtents() {
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
		ExtentTest test1= extent.createTest("google");
	}


	public static void main(String[] args) {


	}
}
