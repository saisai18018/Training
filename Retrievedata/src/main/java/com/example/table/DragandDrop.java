package com.example.table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.time.Duration;

public class DragandDrop {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Load local HTML
        File file = new File("C:\\Users\\SAIMO\\OneDrive\\Desktop\\Training\\SQLfiles\\Dragdrop.html");
        String url = "file:///" + file.getAbsolutePath();
        driver.get(url);

        // Debug: see what Selenium actually loaded
        System.out.println(driver.getPageSource());

        WebElement dragElement = driver.findElement(By.id("drag"));
        WebElement dropElement = driver.findElement(By.id("drop"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragElement, dropElement).perform();

        Thread.sleep(2000);
        driver.quit();
    }
}
