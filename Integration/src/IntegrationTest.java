

import java.util.*;
import java.io.*;

public class IntegrationTest {

	public static void main(String[] args) throws IOException {
        // Setup
        String testFilePath = "test_users.txt";
        UserRepository repo = new UserRepository(testFilePath);
        repo.clear(); // clear the file before testing

        UserService service = new UserService(repo);

        // Test: register two users
        service.registerUser("1", "ABC");
        service.registerUser("2", "DEF");

        // Verify: fetch all users and check contents
        List<User> users = service.getAllUsers();
        assert users.size() == 2 : "Expected 2 users";
        assert users.get(0).getName().equals("ABC");
        assert users.get(1).getName().equals("DEF");

        System.out.println("Integration test passed!");
        
        for (User user : users) {
            System.out.println(user.getId() + " - " + user.getName());
        }

        // Cleanup
//        repo.clear();
    }
}
