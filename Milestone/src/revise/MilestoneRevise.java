package revise;

import java.util.*;

class MilestoneRevise {

    public static void main(String[] args) {
        System.out.println("Running all programs...\n");

        convertCollectionToArray();
        findSublistInList();
        iterateHashMap();
        shuffleList(); 
    }

    // Q1: Convert Collection to Array
    static void convertCollectionToArray() {

        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        String[] array = list.toArray(new String[0]);

        for (String fruit : array) {
            System.out.println(fruit);
        }
    }

    // Q2: Find Sublist
    static void findSublistInList() {

        List<String> cities = Arrays.asList("Delhi", "Mumbai", "Chennai", "Hyderabad", "Bangalore");
        List<String> subList = cities.subList(1, 4);

        System.out.println("Original List: " + cities);
        System.out.println("Sublist: " + subList);
        System.out.println();
    }

    // Q3: Iterate HashMap
    static void iterateHashMap() {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        map.forEach((key, value) -> System.out.println(key + " > " + value));
    }

    // Q4: Shuffle a List
    static void shuffleList() {

        List<String> items = new ArrayList<>(Arrays.asList(
                "Red", "Green", "Blue", "Yellow", "Orange"
        ));

        System.out.println("Original List: " + items);
        Collections.shuffle(items);
        System.out.println("Shuffled List: " + items);
        System.out.println();
    }
}

