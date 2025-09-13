package core;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class ListComparison {
	public static void main(String[] args) {

        // --- 1. Demonstrating ArrayList ---
        // ArrayList is a resizable array. Good for fast element access.
        System.out.println("--- ArrayList Demonstration ---");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        System.out.println("Initial ArrayList: " + arrayList);

        // Accessing an element by index (fast)
        System.out.println("Element at index 1: " + arrayList.get(1));

        // Adding an element in the middle (slower, requires shifting)
        arrayList.add(1, "Grape");
        System.out.println("After adding 'Grape' at index 1: " + arrayList);

        // Removing an element from the middle (slower, requires shifting)
        arrayList.remove(2);
        System.out.println("After removing element at index 2: " + arrayList);

        // --- 2. Demonstrating LinkedList ---
        // LinkedList is a doubly-linked list. Good for fast insertions and deletions.
        System.out.println("\n--- LinkedList Demonstration ---");
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Dog");
        linkedList.add("Cat");
        linkedList.add("Rabbit");
        System.out.println("Initial LinkedList: " + linkedList);

        // Accessing an element by index (slower, requires traversal)
        System.out.println("Element at index 1: " + linkedList.get(1));

        // Adding an element in the middle (fast)
        linkedList.add(1, "Mouse");
        System.out.println("After adding 'Mouse' at index 1: " + linkedList);

        // Removing an element from the middle (fast)
        linkedList.remove(2);
        System.out.println("After removing element at index 2: " + linkedList);
    }
}

