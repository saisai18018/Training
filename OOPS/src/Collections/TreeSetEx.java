package Collections;

import java.util.*;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> numbers = new TreeSet<>();
		numbers.add(40);
		numbers.add(10);
		numbers.add(30);
		numbers.add(20);
		System.out.println("TreeSet: " + numbers);
		numbers.remove(30);
		System.out.println("After removal: " + numbers);

	}

}
