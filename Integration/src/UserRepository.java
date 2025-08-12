
import java.util.*;
import java.io.*;

public class UserRepository {

	private File storageFile;

    public UserRepository(String filePath) {
        this.storageFile = new File(filePath);
    }

    public void save(User user) throws IOException {
        // Appends a user to the file
        try (FileWriter writer = new FileWriter(storageFile, true)) {
            writer.write(user.getId() + "," + user.getName() + "\n");
        }
    }

    public List<User> findAll() throws IOException {
        // Reads all users from the file
        List<User> users = new ArrayList<>();
        if (!storageFile.exists()) return users;

        try (BufferedReader reader = new BufferedReader(new FileReader(storageFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                users.add(new User(parts[0], parts[1]));
            }
        }

        return users;
    }

    public void clear() throws IOException {
        // Clears the contents of the file
        new FileWriter(storageFile).close();
    }
}
