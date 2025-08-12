package Files;

import java.io.Closeable;
import java.io.File;

public class DeleteFileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("myfile.txt");
		
		if(file.delete()) {
			
			System.out.println("File delted " + file.getName());
			
		}else {
			
			System.out.println("Failed to delete the file ");
			
		}
		
//		file.close();
		
		
	}

}
