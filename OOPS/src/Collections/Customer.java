package Collections;

import java.util.*;

public class Customer {

	private int id;
	private long phonenumber;
	private String name;
	private String location;
	private int orders;

	public Customer(int id, String name, String location, long phonenumber, int orders) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.phonenumber = phonenumber;
		this.orders = orders;

	}

	public int getid() {
		return id;
	}

	public String getname() {
		return name;
	}

	public String getlocation() {
		return location;
	}

	public long getphonenumber() {
		return phonenumber;
	}

	public int getorders() {
		return orders;
	}

	public String toString() {
		return "Customer{" +

				"ID=" + id +

				", Name='" + name + '\'' +

				", location='" + location + '\'' +

				", phonenumber='" + phonenumber + '\'' +

				", orders='" + orders + '\'' +

				'}';
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Customer> customer = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		customer.add(new Customer(105, "Sai", "Andhra", 9390029106L, 100));
		customer.add(new Customer(101, "Anand", "Bihar", 7337312423L, 85));
		customer.add(new Customer(103, "Mahesh", "Gujarat", 8106056803L, 94));
		customer.add(new Customer(104, "Vishnu", "Telangana", 9381630642L, 78));
		customer.add(new Customer(102, "Mohan", "Karnataka", 8374411959L, 88));

		// Display All Employees

		System.out.println("All Customers:");

		for (Customer c : customer) {

			System.out.println(c);

		}

//		System.out.println("Sorting details of customer ");

//		Collections.sort(customer);

		
//		Collections.sort(customer, (c1,c2)-> Integer.compare(c1.getid(), c2.getid()));
//		
//		
//		System.out.println("All Customers (Sorted by ID):");
//		for (Customer c : customer) {
//			System.out.println(c);
//		}
		
		for (int i = 0; i < customer.size() - 1; i++) {
		    for (int j = 0; j < customer.size() - i - 1; j++) {
		        if (customer.get(j).getid() > customer.get(j + 1).getid()) {
		            Customer temp = customer.get(j);
		            customer.set(j, customer.get(j + 1));
		            customer.set(j + 1, temp);
		        }
		    }
		}


		// removing element at index 3

		if (customer.size() > 3) {
			customer.remove(3);
			System.out.println("\nAfter removing customer at index 3:");
			for (Customer c : customer) {
				System.out.println(c);
			}
		}else {
			System.out.println("Size of list is less than 3");
		}

		System.out.println("Enter the customer id to find: ");

		int searchid = sc.nextInt();
		boolean found = false;

		ListIterator<Customer> iterator = customer.listIterator();

		while (iterator.hasNext()) {
			Customer c = iterator.next();
			if (c.getid() == searchid) {
				System.out.println("Customer Found:");
				System.out.println("Name: " + c.getname());
				System.out.println("Location: " + c.getlocation());
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Customer ID " + searchid + " not found in the list.");
		}

		sc.close();

	}

}
