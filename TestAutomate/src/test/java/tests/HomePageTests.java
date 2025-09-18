package tests;

import java.io.File;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTests extends BaseTest {

    @Test
    public void testFormSelectionsAndFileUpload() throws InterruptedException {
        HomePage home = new HomePage(getDriver());

        // ---- Fill form ----
        home.enterName("Sai Bharath");
        home.enterEmail("sai@test.com");
        home.enterPhone("9876543210");
        home.enterAddress("Hyderabad");
        home.selectCountryByVisibleText("India");
        home.selectColors("Red", "Green");
        home.selectAnimals("Cat", "Dog", "Elephant");
        home.setDatePicker1("09/01/2025");
        home.setDatePicker2("01/09/2025");
        home.setDateRange("2025-09-01", "2025-09-05");

        // ✅ Assertions
        Assert.assertEquals(home.getEnteredName(), "Sai Bharath", "Name mismatch!");
        Assert.assertEquals(home.getEnteredEmail(), "sai@test.com", "Email mismatch!");
        Assert.assertEquals(home.getEnteredPhone(), "9876543210", "Phone mismatch!");
        Assert.assertEquals(home.getEnteredAddress(), "Hyderabad", "Address mismatch!");
        Assert.assertEquals(home.getSelectedCountry(), "India", "Country mismatch!");

        Thread.sleep(5000);
    }
    
    @Test
    public void testSingleFileUpload() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        String filePath = "C:\\Users\\SAIMO\\OneDrive\\Desktop\\Certificates\\10.pdf";

        homePage.uploadSingleFile(filePath);

        String uploadedFile = homePage.getSingleFileName();
        Assert.assertTrue(uploadedFile.contains("10.pdf"), "File not uploaded correctly!");

        Thread.sleep(8000);
    }

    @Test
    public void testMultipleFileUpload() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        String file1 = "C:\\Users\\SAIMO\\OneDrive\\Desktop\\Certificates\\Aadhar.pdf";
        String file2 = "C:\\Users\\SAIMO\\OneDrive\\Desktop\\Certificates\\Btech.pdf";

        homePage.uploadMultipleFiles(file1, file2);

        String uploadedFiles = homePage.getMultipleFileNames();
        System.out.println("Uploaded files: " + uploadedFiles);

        Assert.assertTrue(uploadedFiles.contains("Aadhar.pdf"), "First file missing!");
//        Assert.assertTrue(uploadedFiles.contains("Btech.pdf"), "Second file missing!");

        Thread.sleep(8000);
    }

}
