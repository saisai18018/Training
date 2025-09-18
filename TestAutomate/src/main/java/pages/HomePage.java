package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;

    // selects / inputs
    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private By phoneField = By.id("phone");
    private By addressField = By.id("textarea");

    private By countryDropdown = By.id("country");
    private By colorsDropdown = By.id("colors");
    private By animalsDropdown = By.id("animals");

    private By datePicker1 = By.id("datepicker");   // mm/dd/yyyy
    private By datePicker2 = By.id("txtDate");      // dd/mm/yyyy (readonly)
    private By startDate = By.id("start-date");     // type=date
    private By endDate = By.id("end-date");
    private By submitButton = By.cssSelector(".submit-btn");

    // --- file upload ---
    private By singleFileInput = By.id("singleFileInput");
    private By uploadSingleButtons = By.xpath("//button[contains(normalize-space(.),'Upload Single File')]");
    private By multipleFilesInput = By.id("multipleFilesInput");
    private By multipleUploadBtn = By.xpath("//form[@id='multipleFilesForm']//button");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    /* --- simple form fields --- */
    public void enterName(String name) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameField)).clear();
        driver.findElement(nameField).sendKeys(name);
    }

    public void enterEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailField)).clear();
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPhone(String phone) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(phoneField)).clear();
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void enterAddress(String address) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addressField)).clear();
        driver.findElement(addressField).sendKeys(address);
    }

    /* --- selects --- */
    public void selectCountryByVisibleText(String visibleText) {
        WebElement el = wait.until(ExpectedConditions.elementToBeClickable(countryDropdown));
        Select sel = new Select(el);
        sel.selectByVisibleText(visibleText);
    }

    public void selectColors(String... colorVisibleTexts) {
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(colorsDropdown));
        Select sel = new Select(el);
        if (!sel.isMultiple()) {
            throw new IllegalStateException("Colors select is not multi-select on this page.");
        }
        for (String color : colorVisibleTexts) {
            sel.selectByVisibleText(color);
        }
    }

    public void selectAnimals(String... animalsVisibleTexts) {
        WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(animalsDropdown));
        Select sel = new Select(el);
        if (!sel.isMultiple()) {
            throw new IllegalStateException("Animals select is not multi-select on this page.");
        }
        for (String animal : animalsVisibleTexts) {
            sel.selectByVisibleText(animal);
        }
    }

    /* --- date pickers --- */
    public void setDatePicker1(String mmddyyyy) {
        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(datePicker1));
        e.clear();
        e.sendKeys(mmddyyyy);
    }

    public void setDatePicker2(String ddMMyyyy) {
        WebElement e = wait.until(ExpectedConditions.presenceOfElementLocated(datePicker2));
        ((JavascriptExecutor) driver).executeScript("arguments[0].removeAttribute('readonly')", e);
        e.clear();
        e.sendKeys(ddMMyyyy);
        ((JavascriptExecutor) driver).executeScript("arguments[0].dispatchEvent(new Event('change'))", e);
    }

    public void setDateRange(String startYYYY_MM_DD, String endYYYY_MM_DD) {
        WebElement s = wait.until(ExpectedConditions.elementToBeClickable(startDate));
        WebElement e = wait.until(ExpectedConditions.elementToBeClickable(endDate));
        s.clear();
        s.sendKeys(startYYYY_MM_DD);
        e.clear();
        e.sendKeys(endYYYY_MM_DD);
        WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(submitButton));
        submitBtn.click();
    }

    /* --- file upload --- */
    public void uploadSingleFile(String filePath) {
        driver.findElement(singleFileInput).sendKeys(filePath);
    }

    public void uploadMultipleFiles(String... filePaths) {
        WebElement input = driver.findElement(multipleFilesInput);
        for (String path : filePaths) {
            input.sendKeys(path); // send each file separately
        }
    }


    /* --- getters for assertions --- */
    public String getEnteredName() {
        return driver.findElement(nameField).getAttribute("value");
    }

    public String getEnteredEmail() {
        return driver.findElement(emailField).getAttribute("value");
    }

    public String getEnteredPhone() {
        return driver.findElement(phoneField).getAttribute("value");
    }

    public String getEnteredAddress() {
        return driver.findElement(addressField).getAttribute("value");
    }

    public String getSelectedCountry() {
        WebElement el = driver.findElement(countryDropdown);
        Select sel = new Select(el);
        return sel.getFirstSelectedOption().getText();
    }

    public String getSingleFileName() {
        return driver.findElement(singleFileInput).getAttribute("value");
    }

    public String getMultipleFileNames() {
        return driver.findElement(multipleFilesInput).getAttribute("value"); // fixed ID
    }
}
