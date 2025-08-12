package Serialize;

import java.io.Serializable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeEx implements Serializable {

	private String name;
	private int age;
	private String location;
	private static final long serialVersionUID = 1L;

	public SerializeEx(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}

	public void display() {
		System.out.println("Name: " + name + ", Age: " + age);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		////// serialization

		SerializeEx ex1 = new SerializeEx("Sai", 24,"Andhra");

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"))) {

			out.writeObject(ex1);

			System.out.println("Object serialization to the student.ser");

		} catch (Exception e) {

			e.printStackTrace();

		}

		// De-serializatioin reading from the file

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"))) {

			SerializeEx s = (SerializeEx) in.readObject();

			s.display();

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
