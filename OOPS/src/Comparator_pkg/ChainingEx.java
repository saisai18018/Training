package Comparator_pkg;

import java.util.*;

class Person {
	
	private String name;
	private int age;
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	public int getage() {
		return age;
	}
	public String getname() {
		return name;
	}
	public String toString() {
		return this.name + " " + this.age;
	}
}


public class ChainingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> person = Arrays.asList(
				new Person(24, "Sai"),
				new Person(23, "Divya"),
				new Person(22, "Keethi"));
		
		System.out.println("Original List: ");
		System.out.println(person);
		
		person.sort(Comparator.comparing((Person p)->p.getname()).thenComparing(p->p.getage()));
		
		
		System.out.println("Sorted list by name then by age: ");
		for(Person p:person){
			System.out.println(p);
		}
	}

}
