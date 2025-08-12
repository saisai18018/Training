package Collections;

import java.util.*;

public class HashcodeEx {

	private String name;
	private int age;

	public HashcodeEx(int age, String name) {
		this.age = age;
		this.name = name;
	}

	// Override hashCode() and equals()
	@Override
	public int hashCode() {
		return Objects.hash(name, age); // Combines both fields
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof HashcodeEx))
			return false;
		HashcodeEx p = (HashcodeEx) obj;
		return age == p.age && Objects.equals(name, p.name);
	}

	@Override
	public String toString() {
		return name + " (" + age + ")";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<HashcodeEx> person = new HashSet<>();

		HashcodeEx ex1 = new HashcodeEx(24, "Sai");
		HashcodeEx ex2 = new HashcodeEx(23, "Divya");
		HashcodeEx ex3 = new HashcodeEx(24, "Sai");

		person.add(ex1);
		person.add(ex2);
		person.add(ex3);

		System.out.println("People in the hashset are: ");

		for (HashcodeEx p : person) {
			System.out.println(p + " - " + p.hashCode());
		}

	}

}
