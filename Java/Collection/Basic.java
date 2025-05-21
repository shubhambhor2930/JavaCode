import java.util.*;

public class CollectionOperations {
    public static void main(String[] args) {
        // Create a collection (ArrayList)
        Collection<String> collection = new ArrayList<>();

        // Add elements
        collection.add("Apple");
        collection.add("Banana");
        collection.add("Cherry");
        collection.add("Date");

        System.out.println("Initial Collection: " + collection);

        // Check if collection contains an element
        System.out.println("Contains 'Banana'? " + collection.contains("Banana"));

        // Remove an element
        collection.remove("Date");
        System.out.println("After removing 'Date': " + collection);

        // Size of the collection
        System.out.println("Size: " + collection.size());

        // Check if collection is empty
        System.out.println("Is empty? " + collection.isEmpty());

        // Convert to array
        Object[] array = collection.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // Iterate using for-each
        System.out.print("Iterating: ");
        for (String item : collection) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Clear the collection
        collection.clear();
        System.out.println("After clear(): " + collection);

        // Demonstrating with other types of collections
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 4));
        System.out.println("HashSet: " + set);

        List<String> list = new LinkedList<>(Arrays.asList("X", "Y", "Z"));
        System.out.println("LinkedList: " + list);
    }
}
