package Serialize;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	private String username;
	private String email;
	private int age;

	public User(String username, String email) {
		this.username = username;
		this.email = email;
	}

	public String toString() {

		return "User name " + username + " email " + email + " age " + age;

	}

}
