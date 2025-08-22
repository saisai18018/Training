import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
 
import java.util.List;
 
public class ListALlAttributes {

    public static void main(String[] args) {
 
        // Set up WebDriver

        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();
 
        try {

             // 1. Open target website

            driver.get("http://127.0.0.1:5500/Form/index.html");

            driver.manage().window().maximize();
 
            // 2. Extract all links

            List<WebElement> allLinks = driver.findElements(By.tagName("a"));

            System.out.println("Links:");

            for (WebElement link : allLinks) {

                System.out.println(link.getText() + " -> " + link.getAttribute("href"));

            }
 
            // 3. Extract all input fields

            List<WebElement> allInputs = driver.findElements(By.tagName("input"));

            System.out.println("Input Fields:");

            for (WebElement input : allInputs) {

                System.out.println("Type: " + input.getAttribute("type") + " | Placeholder: " + input.getAttribute("placeholder"));

            }
 
            // 4. Extract all buttons

            List<WebElement> allButtons = driver.findElements(By.tagName("button"));

            System.out.println("Buttons:");

            for (WebElement button : allButtons) {

                System.out.println("Text: " + button.getText());

            }
 
            // 5. Extract all headings (h1–h6)

            System.out.println("Headings:");

            for (int i = 1; i <= 6; i++) {

                List<WebElement> headings = driver.findElements(By.tagName("h" + i));

                for (WebElement heading : headings) {

                    System.out.println("H" + i + ": " + heading.getText());

                }

            }
 
            // 6. Extract all paragraphs

            List<WebElement> allParagraphs = driver.findElements(By.tagName("p"));

            System.out.println("Paragraphs:");

            for (WebElement para : allParagraphs) {

                System.out.println(para.getText());

            }
            
            Thread.sleep(25000);
            
            WebElement empNameElement = driver.findElement(By.name("empName"));
            String ename_value = empNameElement.getAttribute("value");
            
            WebElement empId = driver.findElement(By.name("empId"));
            String empId_vlaue = empId.getAttribute("value");
            
            WebElement gmail = driver.findElement(By.name("email"));
            String gmail_value = gmail.getAttribute("value");
            
            WebElement dob = driver.findElement(By.name("dob"));
            String dob_value = dob.getAttribute("value");
            
            WebElement address = driver.findElement(By.name("address"));
            String address_value = address.getAttribute("value");
            
            WebElement mobile = driver.findElement(By.name("mobile"));
            String mobile_value = mobile.getAttribute("value");
            
            System.out.println("Employee Name Value: " + ename_value);
            System.out.println("Employee ID Value: " + empId_vlaue);
            System.out.println("Employee gmail Value: " + gmail_value);
            System.out.println("Employee dob Value: " + dob_value);
            System.out.println("Employee address Value: " + address_value);
            System.out.println("Employee phone Value: " + mobile_value);

            		 
 
        } catch (Exception e) {

            e.printStackTrace();

        } finally {

            // 7. Close browser

            driver.quit();

        }

    }

}

 