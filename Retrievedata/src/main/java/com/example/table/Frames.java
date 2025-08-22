package com.example.table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Initialize WebDriver
		WebDriver driver = new ChromeDriver();

		// Load local main.html
		File file = new File("C:\\Users\\SAIMO\\OneDrive\\Desktop\\Training\\SQLfiles\\main.html");
		String url = "file:///" + file.getAbsolutePath();
		driver.get(url);

		// Switch to iframe by id
		// Now we're inside the iframe, so we can locate the input field by its id
		// Type something in the input field
		// We need to switch to go to another frame
		
		driver.switchTo().frame("myFrame");
		WebElement messageInput = driver.findElement(By.id("message"));
		messageInput.sendKeys("Hello Learners!!!!");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("myframe2");
		WebElement messageInput1 = driver.findElement(By.id("message2"));
		messageInput1.sendKeys("Hello Java!!!!");
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("myframe3");
		WebElement messageInput2 = driver.findElement(By.id("message3"));
		messageInput2.sendKeys("Hello Selenium!!!!");
		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);
		
		

//	       driver.quit();

	}

}
