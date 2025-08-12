package Collections;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruits = new ArrayList<>();
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Custard");
		fruits.add("Dark Chocolate");
		fruits.add("Guava");
		fruits.add("Honey");
		fruits.add("Mango");
		
		
		System.out.println(fruits);
		
		System.out.println(fruits.get(2));
		System.out.println(fruits.remove(6));
		System.out.println(fruits.indexOf("Mango"));
		System.out.println(fruits.subList(1, 5));
		System.out.println(fruits.isEmpty());
		fruits.add(2, "Vennila");
		System.out.println(fruits);
		
		
		
		

	}

}
