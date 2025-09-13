package core;
public class constructors {
String name;
int age;
String course;   // keep the same name everywhere

// Default constructor
public constructors() {
    name = "Unknown";
    age = 0;
    course = "Not Assigned";
}

// Constructor with two parameters
public constructors(String name, int age) {
    this.name = name;
    this.age = age;
    this.course = "Not Assigned";
}

// Constructor with three parameters
public constructors(String name, int age, String course) {
    this.name = name;
    this.age = age;
    this.course = course;
}

// Method to display details
public void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Course: " + course);
    System.out.println("----------------------");
}

// Main method to test
public static void main(String[] args) {
    // Using default constructor
    constructors c1 = new constructors();

    // Using constructor with 2 parameters
    constructors c2 = new constructors("Khushi", 20);

    // Using constructor with 3 parameters
    constructors c3 = new constructors("Amit", 22, "MCA");

    // Display details
    System.out.println("=== Object 1 ===");
    c1.displayDetails();

    System.out.println("=== Object 2 ===");
    c2.displayDetails();

    System.out.println("=== Object 3 ===");
    c3.displayDetails();
}
}
