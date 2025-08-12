package Collections;

import java.util.*;

public class FrameworkEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<>();
		
		List<Integer> numbers = new ArrayList<>();

		// Step 3 - Add elements to the list

		names.add("Abhi");
		names.add("Bob");
		names.add("Alex");
		names.add("Alex");
		names.add("Turner");
		names.add("Martin");
		names.add("Fox");
		names.add("Jack");
		names.add("Lily");
		
		numbers.add(1);
		numbers.add(2);
		numbers.add(4);
		numbers.add(8);
		numbers.add(0);
		numbers.add(7);

		// names.add(null);

		System.out.println("Before the sorting......" + names);

		Collections.sort(names);

		System.out.println("After the Sorting: " + names);
		
		
		System.out.println("Before the sorting......" + numbers);

		Collections.sort(numbers);

		System.out.println("After the Sorting: " + numbers);

	}

}
