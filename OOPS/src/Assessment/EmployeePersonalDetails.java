package Assessment;

public class EmployeePersonalDetails {
	
	private String name, location, gender;
	
	private int age;
	
	private long phonenumber;

	
	public EmployeePersonalDetails(String name, String location, long phonenumber, int age, String gender) {
		this.name = name;
		this.location = location;
		this.phonenumber = phonenumber;
		this.age = age;
		this.gender = gender;
	}
	
	public void display() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Phone Number: " + phonenumber);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
	
	public String getname() {
		return name;
	}

}

