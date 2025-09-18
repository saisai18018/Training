package tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseTest {

    protected WebDriver driver;
    protected static ExtentReports extent;  
    protected ExtentTest test;              

    @BeforeSuite
    public void setupExtent() {
        ExtentSparkReporter spark = new ExtentSparkReporter("test-output/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @AfterSuite
    public void tearDownExtent() {
        if (extent != null) {
            extent.flush();  
        }
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver(); // WebDriverManager should already handle setup via POM
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://testautomationpractice.blogspot.com/");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
