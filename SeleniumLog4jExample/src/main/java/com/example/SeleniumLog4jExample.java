package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumLog4jExample {
    private static final Logger logger = LogManager.getLogger(SeleniumLog4jExample.class);

    public static void main(String[] args) {
        logger.info("Starting the Selenium test");
        WebDriver driver = new ChromeDriver();
        logger.info("Chrome browser launched");

        try {
            // Open Google
            driver.get("https://www.google.com");
            logger.info("Navigated to Google");

            // Get page title
            String pageTitle = driver.getTitle();
            logger.info("Page title is: " + pageTitle);

            // Wait until search box is visible and interact with it
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement searchBox = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.name("q"))
            );
            searchBox.sendKeys("Log4j2 in Selenium");
            logger.info("Typed 'Log4j2 in Selenium' into search box");

        } catch (WebDriverException e) {
            logger.error("An error occurred during the test", e);
        } finally {
            driver.quit();
            logger.info("Browser closed");
        }
    }
}
