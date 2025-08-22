package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import com.aventstack.extentreports.*;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class GoogleTestWithReport {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;

	@BeforeSuite
	public void setupReport() {
		ExtentSparkReporter htmlReporter = new ExtentSparkReporter("test_output_file/ExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
	}

	@Test
	public void openGoogle() {
		test = extent.createTest("Open Google", "Verify Google homepage loads successfully");
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		if (title.contains("Google")) {
			test.pass("Google homepage opened successfully");
		} else {
			test.fail("Google homepage title did not match");
		}
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@AfterSuite
	public void tearDownReport() {
		extent.flush(); // write everything to the report
	}
}
