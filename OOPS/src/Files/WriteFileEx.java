package Files;

import java.io.FileWriter;

import java.io.IOException;

public class WriteFileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileWriter writer = new FileWriter("myfile.txt")){
			writer.write("Hello, welcome to the myfile.txt");
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
