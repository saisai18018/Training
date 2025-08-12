package Comparator_pkg;

public class StudentEx {

	private int age;
	private String name;
	
	public StudentEx(int age, String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name =  name;
	}


	
	public int getage() {
		return age;
	}
	public String getname() {
		return name;
	}
	
	public String toString() {
		return "Name : " + name + " and age is " + age;
	}
}
