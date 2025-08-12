package Serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeUser {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		User user = new User("alice", "alice@example.com");

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("user.ser"));

		out.writeObject(user);
		
		System.out.println(user);
		
		out.close();
		
	
	}

}
