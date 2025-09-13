package core;

public class getset {
	private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {  // simple validation
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to test encapsulation
    public static void main(String[] args) {
        getset p1 = new getset();

        // Setting values using setters
        p1.setName("Khushi");
        p1.setAge(20);

        // Getting values using getters
        System.out.println("Name via getter: " + p1.getName());
        System.out.println("Age via getter: " + p1.getAge());

        // Display full details
        System.out.println("\n--- Person Details ---");
        p1.displayDetails();
    }
}


