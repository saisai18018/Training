package com.myapp;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

    private static ExtentReports extent;
    private static ThreadLocal<ExtentTest> testThread = new ThreadLocal<>();

    // Initialize report only once
    public static ExtentReports getExtentReports() {
        if (extent == null) {
            ExtentSparkReporter htmlReporter = new ExtentSparkReporter("reports/extent-report.html");
            htmlReporter.config().setDocumentTitle("Automation Test Report");
            htmlReporter.config().setReportName("MyApp Test Results");
            htmlReporter.config().setTheme(Theme.STANDARD);

            extent = new ExtentReports();
            extent.attachReporter(htmlReporter);
        }
        return extent;
    }

    // Create test node
    public static ExtentTest createTest(String testName) {
        ExtentTest test = getExtentReports().createTest(testName);
        testThread.set(test);
        return test;
    }

    // Get current thread’s test
    public static ExtentTest getTest() {
        return testThread.get();
    }

    // Flush report after execution
    public static void flush() {
        if (extent != null) {
            extent.flush();
        }
    }
}
