import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {
	public static void main(String[] args) {
// Set the path to your browser driver executable
		WebDriver driver = null;

		try {

			// Launch Chrome browser

			driver = new ChromeDriver();

//		// Go to Google
//
//		driver.get("https://www.google.com");
			
// 
//		// Find the search box and type a query
//
//		WebElement searchBox = driver.findElement(By.name("q"));
//
//		searchBox.sendKeys("Selenium WebDriver");
// 
//		// Submit the search form
//
//		searchBox.submit();

			// YOUTUBE

//			driver.get("https://www.youtube.com");
//
//			WebElement searchBox = driver.findElement(By.name("search_query"));
//			searchBox.sendKeys("Selenium WebDriver tutorial");
//			searchBox.submit();
//
//			WebElement searchButton = driver.findElement(By.cssSelector("search-icon-legacy"));
//			searchButton.click();
//		searchButton.submit();
//
//			Thread.sleep(20000);
//			System.out.println("Search Results Page Title: " + driver.getTitle());

			WebElement searchBox = driver.findElement(By.name("search_query"));
			searchBox.sendKeys("iphone 16 pro max");
			searchBox.submit();
			
			WebElement searchButton = driver.findElement(By.cssSelector("search-icon-legacy"));
			searchButton.click();

			Thread.sleep(15000); // Wait 2 seconds for results to load
			// Twitter

//			driver.get("https://twitter.com/login");
//			WebElement searchBox1 = driver.findElement(By.name("text"));
//			searchBox1.sendKeys("Twitter");
//			searchBox1.submit();
//			Thread.sleep(15000);

			// Amazon

//			driver.get("https://www.amazon.in");
//			WebElement searchBox2 = driver.findElement(By.id("twotabsearchtextbox"));
//			searchBox2.sendKeys("Amazon");
//			searchBox2.submit();
//			Thread.sleep(15000);

			// Gmail

//			driver.get("https://www.gmail.com");
//			WebElement searchBox3 = driver.findElement(By.id("identifierId"));
//			searchBox3.sendKeys("saimomdad99@gmail.com");
//			searchBox3.submit();
//			Thread.sleep(15000);

		} catch (Exception e) {

			// e.printStackTrace();

		}

		// Print the title of the results page

		System.out.println("Search Results Page Title: " + driver.getTitle());

		// Close the browser

		driver.quit();

	}
}