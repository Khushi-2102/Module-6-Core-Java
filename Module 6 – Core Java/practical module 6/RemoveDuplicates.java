package core;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class RemoveDuplicates {
	public static void main(String[] args) {

        // 1. Create a List with duplicate elements
        List<String> listWithDuplicates = new ArrayList<>();
        listWithDuplicates.add("Apple");
        listWithDuplicates.add("Banana");
        listWithDuplicates.add("Apple");
        listWithDuplicates.add("Orange");
        listWithDuplicates.add("Banana");
        listWithDuplicates.add("Grape");

        System.out.println("Original List (with duplicates): " + listWithDuplicates);

        // 2. Use a HashSet to remove duplicates
        // A HashSet stores only unique elements.
        Set<String> uniqueElementsSet = new HashSet<>(listWithDuplicates);

        // 3. Convert the Set back to a List (optional, but common)
        List<String> listWithoutDuplicates = new ArrayList<>(uniqueElementsSet);

        // 4. Print the result
        System.out.println("List after removing duplicates: " + listWithoutDuplicates);
    }
}

