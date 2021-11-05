package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentRprt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExtentSparkReporter spark = new ExtentSparkReporter("Spark.html");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(spark);
		
		ExtentTest test1= extent.createTest("google");
		

	}

}
