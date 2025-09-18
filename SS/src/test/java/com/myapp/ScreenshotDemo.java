package com.myapp;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenshotDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://example.com");

            File fullPage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileHandler.copy(fullPage, new File("fullpage_screenshot.png"));
            System.out.println("Full page screenshot taken.");

            WebElement heading = driver.findElement(By.tagName("h1"));
            File elementShot = heading.getScreenshotAs(OutputType.FILE);
            FileHandler.copy(elementShot, new File("element_screenshot.png"));
            System.out.println("Element screenshot taken.");

        } catch (IOException e) {
            System.out.println("Screenshot failed: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
