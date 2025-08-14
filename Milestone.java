import java.util.*;

class Milestone {

    public static void main(String[] args) {
        System.out.println("Running all programs...\n");

        convertCollectionToArray();
        findSublistInList();
        iterateHashMap();
        shuffleList(); // <-- added missing semicolon
    }

    // Q1: Convert Collection to Array
    static void convertCollectionToArray() {
        System.out.println("=== Q1: Collection to Array ===");
        List<String> list = Arrays.asList("Apple", "Banana", "Cherry");
        String[] array = list.toArray(new String[0]);

        for (String fruit : array) {
            System.out.println(fruit);
        }
        System.out.println();
    }

    // Q2: Find Sublist
    static void findSublistInList() {
        System.out.println("=== Q2: Sublist from List ===");
        List<String> cities = Arrays.asList("Delhi", "Mumbai", "Chennai", "Hyderabad", "Bangalore");
        List<String> subList = cities.subList(1, 4);

        System.out.println("Original List: " + cities);
        System.out.println("Sublist: " + subList);
        System.out.println();
    }

    // Q3: Iterate HashMap
    static void iterateHashMap() {
        System.out.println("=== Q3: Iterate HashMap ===");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        map.forEach((key, value) -> System.out.println(key + " -> " + value));
        System.out.println();
    }

    // Q4: Shuffle a List
    static void shuffleList() {
        System.out.println("=== Q4: Shuffle List ===");
        List<String> items = new ArrayList<>(Arrays.asList(
                "Red", "Green", "Blue", "Yellow", "Orange"
        ));

        System.out.println("Original List: " + items);
        Collections.shuffle(items);
        System.out.println("Shuffled List: " + items);
        System.out.println();
    }
}
