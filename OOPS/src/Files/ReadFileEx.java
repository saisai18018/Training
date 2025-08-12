package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (BufferedReader reader = new BufferedReader(new FileReader("myfile.txt"))) {

			String line;
			while ((line = reader.readLine()) != null) {
				
				System.out.println(line);
				
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}

	}

}
