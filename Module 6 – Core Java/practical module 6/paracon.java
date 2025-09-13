package core;
public class paracon {
    // Attributes
    String name;
    int age;
    String course;

    // Parameterized constructor
    public paracon(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    // Main method
    public static void main(String[] args) {
        // Create object using parameterized constructor
        paracon student1 = new paracon("Khushi", 20, "BCA");

        // Display details
        student1.displayDetails();
    }
}
