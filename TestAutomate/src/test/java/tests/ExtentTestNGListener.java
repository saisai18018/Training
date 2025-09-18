package tests;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.*;

import java.io.File;

public class ExtentTestNGListener implements ITestListener {

    private static ExtentReports extent;
    private static ExtentTest test;

    @Override
    public void onStart(ITestContext context) {
        // Ensure reports folder exists
        new File("reports").mkdirs();

        ExtentSparkReporter spark = new ExtentSparkReporter("reports/extent-report.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.skip("Test Skipped");
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
