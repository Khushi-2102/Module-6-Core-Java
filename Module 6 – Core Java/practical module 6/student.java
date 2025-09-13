package core;

public class student {
	String name;
    int age;
    String _class;   // attribute named _class instead of class

    // Constructor
    public student(String name, int age, String _class) {
        this.name = name;
        this.age = age;
        this._class = _class;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Class: " + _class);
    }

    // Main method to test
    public static void main(String[] args) {
        student s1 = new student("Khushi", 20, "BCA");
        student s2 = new student("Amit", 22, "MCA");

        System.out.println("=== Student 1 ===");
        s1.displayDetails();

        System.out.println("\n=== Student 2 ===");
        s2.displayDetails();
    }
}


