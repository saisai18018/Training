package main.java;

import java.util.*;

public class ArrayExample {

	// 1. Shuffle elements in an ArrayList
    public static void shuffleArrayList() {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("1. Before shuffle: " + colors);
        Collections.shuffle(colors);
        System.out.println("2. After shuffle: " + colors);
        System.out.println("------------------------------------------------------------------");
    }

    // 2. Extract a portion of an ArrayList
    public static List<String> extractPortionOfArrayList() {
        List<String> cities = Arrays.asList("Delhi", "Mumbai", "Chennai", "Hyderabad", "Bangalore");
        return cities.subList(1, 4); 
    }

    
    // 4. Replace the second element of an ArrayList
    public static void replaceSecondElement() {
        System.out.println("------------------------------------------------------------------");
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));
        System.out.println("1. Before replacement: " + fruits);
        fruits.set(1, "Mango"); 
        System.out.println("2. After replacement: " + fruits);
        System.out.println("------------------------------------------------------------------");
    }

    // 7. Clone a HashSet to another HashSet
    public static void cloneHashSet() {
        HashSet<String> languages = new HashSet<>(Arrays.asList("Java", "Python", "C++"));
        HashSet<String> clonedSet = new HashSet<>(languages);
        System.out.println("1. Original HashSet: " + languages);
        System.out.println("2. Cloned HashSet: " + clonedSet);
        System.out.println("------------------------------------------------------------------");
    }

    // 8. Convert a HashSet to a TreeSet
    public static void convertHashSetToTreeSet() {
        HashSet<String> animals = new HashSet<>(Arrays.asList("Dog", "Cat", "Elephant"));
        TreeSet<String> sortedAnimals = new TreeSet<>(animals);
        System.out.println("1. HashSet: " + animals);
        System.out.println("2. TreeSet (sorted): " + sortedAnimals);
        System.out.println("------------------------------------------------------------------");
    }

    // 10. Get a collection view of keys contained in a map
    public static void viewMapKeys() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        System.out.print("Map Keys: ");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.print(entry.getKey() + " ");
        }
    }

	public static void main(String[] args) {
		
		
		shuffleArrayList();           // Q1
        extractPortionOfArrayList();  // Q2
        System.out.println("Extracted Portion of Array list: " + extractPortionOfArrayList());
        replaceSecondElement();       // Q4
        cloneHashSet();               // Q7
        convertHashSetToTreeSet();    // Q8
        viewMapKeys();  

	}
}