package com.example.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySQLWithSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		WebDriver driver = null;

		try {
			// 1) JDBC connection
			String url = "jdbc:mysql://localhost:3306/testng";
			String user = "root";
			String password = "Wasteoftime@3110";

			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT username, password FROM user_tbl WHERE id = 1");

			String dbUsername = null;
			String dbPassword = null;

			if (rs.next()) {
				dbUsername = rs.getString("username");
				dbPassword = rs.getString("password");
			}

			// 2) Selenium usage of the DB values

			driver = new ChromeDriver();
			driver.get("file:///C:/Users/SAIMO/OneDrive/Desktop/Training/SQLfiles/userdetails.html");

			Thread.sleep(5000); // allow page to load


			// Fill HTML login form using the data fetched from MySQL
			WebElement usernameInput = driver.findElement(By.xpath("//input[@name='username']"));
			WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
			WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));

			Thread.sleep(5000);
			usernameInput.sendKeys(dbUsername);
			passwordInput.sendKeys(dbPassword);
			loginBtn.click();
			Thread.sleep(5000);
			
//			Thread.sleep(25000);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// JDBC cleanup
			try {
				if (rs != null)
					rs.close();
			} catch (Exception ignored) {
			}
			try {
				if (stmt != null)
					stmt.close();
			} catch (Exception ignored) {
			}
			try {
				if (conn != null)
					conn.close();
			} catch (Exception ignored) {
			}

			// Close browser
			if (driver != null) {
				driver.quit();
			}
		}

	}

}
