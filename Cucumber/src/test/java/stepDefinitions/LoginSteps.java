package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.*;
import org.junit.Assert;
import com.example.pages.*;

public class LoginSteps {

    private LoginPage loginPage;

    @Given("the user is on the login page")
    public void user_is_on_login_page() {
        Hooks.driver.get("C:\\Users\\SAIMO\\OneDrive\\Desktop\\Training\\c\\login.html"); // <-- replace with your actual AUT
        loginPage = new LoginPage(Hooks.driver);
    }

    @When("the user enters valid credentials")
    public void enter_valid_credentials() {
        loginPage.enterUsername("validUser");    // test data should be valid in AUT
        loginPage.enterPassword("validPass");
    }

    @When("the user enters invalid credentials")
    public void enter_invalid_credentials() {
        loginPage.enterUsername("wrongUser");
        loginPage.enterPassword("wrongPass");
    }

    @And("clicks the login button")
    public void click_login_button() {
        loginPage.clickLogin();
    }

    @Then("the user should be redirected to the dashboard")
    public void user_should_see_dashboard() {
        Assert.assertTrue("User is not on dashboard", loginPage.isOnDashboard());
    }

    @Then("an error message should be displayed")
    public void error_message_should_be_displayed() {
        Assert.assertTrue("Error message not visible", loginPage.isErrorVisible());
    }

    // If you used the Scenario Outline:
    @When("the user enters username {string} and password {string}")
    public void enter_credentials(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @Then("the result should be {string}")
    public void result_should_be(String outcome) {
        switch (outcome) {
            case "success":
                Assert.assertTrue("Expected success but not on dashboard", loginPage.isOnDashboard());
                break;
            case "error":
                Assert.assertTrue("Expected error but none visible", loginPage.isErrorVisible());
                break;
            default:
                throw new IllegalArgumentException("Unknown outcome: " + outcome);
        }
    }
}
