package com.myapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup(ITestContext context) {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 🔑 This makes driver available for Listeners
        context.setAttribute("driver", driver);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
    
    public WebDriver getDriver() {
        return driver;
    }

}
