package core;
import java.util.HashMap;
import java.util.Map;
public class HashMapDemo {
	public static void main(String[] args) {

        // 1. Creating a HashMap
        // The first type parameter is for the key (String)
        // The second type parameter is for the value (Integer)
        Map<String, Integer> studentGrades = new HashMap<>();

        // 2. Storing Key-Value Pairs using put()
        // The put() method adds a new key-value pair to the map.
        studentGrades.put("Alice", 95);
        studentGrades.put("Bob", 88);
        studentGrades.put("Charlie", 76);
        studentGrades.put("David", 91);

        System.out.println("Student Grades Map: " + studentGrades);

        // 3. Retrieving a Value using get()
        // The get() method returns the value associated with the specified key.
        int aliceGrade = studentGrades.get("Alice");
        System.out.println("Alice's grade is: " + aliceGrade);

        // 4. Checking for a Key using containsKey()
        // This method is useful for avoiding NullPointerException if a key doesn't exist.
        String studentName = "Bob";
        if (studentGrades.containsKey(studentName)) {
            System.out.println(studentName + "'s grade is: " + studentGrades.get(studentName));
        } else {
            System.out.println("Grade for " + studentName + " not found.");
        }

        // 5. Iterating Through the Map
        // You can use a for-each loop to iterate over the entry set.
        System.out.println("\nAll students and their grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Grade: " + entry.getValue());
        }

        // 6. Removing a Key-Value Pair using remove()
        // The remove() method removes the entry for the specified key.
        studentGrades.remove("Charlie");
        System.out.println("\nMap after removing Charlie: " + studentGrades);
    }
}

