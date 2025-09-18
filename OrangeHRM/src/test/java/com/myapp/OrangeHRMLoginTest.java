package com.myapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMLoginTest {

    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test
    public void testInvalidLogin() throws InterruptedException {
        // Enter invalid username & password
        driver.findElement(By.name("username")).sendKeys("wrongUser");
        driver.findElement(By.name("password")).sendKeys("wrongPass");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Capture error message
        WebElement errorMsg = driver.findElement(By.xpath("//p[text()='Invalid credentials']"));

        // Assertion to check if error message is displayed
        Assert.assertTrue(errorMsg.isDisplayed(), " Error message not displayed on invalid login");
        
        Thread.sleep(2000);


    }

    @Test
    public void testValidLogin() throws InterruptedException {
    	// Enter valid username & password
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        // Verify successful login by checking Dashboard text
        WebElement dashboard = driver.findElement(By.xpath("//h6[text()='Dashboard']"));

        // Assertion
        Assert.assertTrue(dashboard.isDisplayed(), " Dashboard not displayed. Login might have failed.");
        
        // Click Leave menu
           driver.findElement(By.xpath("//span[text()='Leave']")).click();
           
           Thread.sleep(4000);
        }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

	public WebDriver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}
}
