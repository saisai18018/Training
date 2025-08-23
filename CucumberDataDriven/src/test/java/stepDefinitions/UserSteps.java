package stepDefinitions;

import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class UserSteps {
    private List<String> usernames;

    @Given("the following usernames:")
    public void the_following_usernames(DataTable dataTable) {
        // Convert DataTable column into List<String>
        usernames = dataTable.asList(String.class);
    }

    @When("I process the usernames")
    public void i_process_the_usernames() {
        for (String username : usernames) {
            System.out.println("Processing user: " + username);
        }
    }

    @Then("I should see {int} usernames processed")
    public void i_should_see_usernames_processed(Integer expectedCount) {
        assertEquals(expectedCount.intValue(), usernames.size());
    }
}
