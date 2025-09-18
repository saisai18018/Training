package com.myapp;

import com.myapp.ScreenshotUtil;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;

public class TestListener implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        Object testClass = result.getInstance();
        WebDriver driver = ((OrangeHRMLoginTest) testClass).getDriver();
        ScreenshotUtil.captureScreenshot(driver, result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        Object testClass = result.getInstance();
        WebDriver driver = ((OrangeHRMLoginTest) testClass).getDriver();
        ScreenshotUtil.captureScreenshot(driver, result.getName());
    }
}
