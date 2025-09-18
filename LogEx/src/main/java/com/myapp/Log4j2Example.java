package com.myapp;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.support.ui.FluentWait;
import java.util.function.Function;

public class Log4j2Example {
    private static final Logger logger = LogManager.getLogger(Log4j2Example.class);

    public static void main(String[] args) {
        logger.trace("This is a TRACE log (very detailed)");
        logger.debug("This is a DEBUG log (useful for developers)");
        logger.info("This is an INFO log (business events)");
        logger.warn("This is a WARN log (something unusual)");
        logger.error("This is an ERROR log (something failed)");
        logger.fatal("This is a FATAL log (severe failure)");
        
     // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            // ====== 1. Implicit Wait ======
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
            driver.findElement(By.cssSelector("#start button")).click();

            // ====== 2. Explicit Wait ======
            WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
            WebElement finishText = explicitWait.until(
                    ExpectedConditions.visibilityOfElementLocated(By.id("finish"))
            );
            System.out.println("Explicit Wait result: " + finishText.getText());

            // ====== 3. Fluent Wait ======
            driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/2");
            driver.findElement(By.cssSelector("#start button")).click();

            Wait<WebDriver> fluentWait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(20))
                    .pollingEvery(Duration.ofSeconds(2))
                    .ignoring(NoSuchElementException.class);

            WebElement finishElement = fluentWait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver drv) {
                    WebElement el = drv.findElement(By.id("finish"));
                    if (el.isDisplayed()) {
                        return el;
                    } else {
                        return null;
                    }
                }
            });

            System.out.println("Fluent Wait result: " + finishElement.getText());

        } finally {
            driver.quit();
        }
    }
}
