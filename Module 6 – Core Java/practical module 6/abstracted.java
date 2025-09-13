package core;
abstract class Animal {
    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method (no body)
    public abstract void sound();

    // Concrete method
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Subclass that extends abstract class
class dog extends Animal {

    // Constructor
    public dog(String name) {
        super(name); // Call parent constructor
    }

    // Implement abstract method
    
    public void sound() {
        System.out.println(name + " barks.");
    }
}

public class abstracted {
	public static void main(String[] args) {
        // Animal a = new Animal("Leo"); // ❌ Cannot instantiate abstract class

        // Create object of subclass
        dog d = new dog("Tommy");

        // Call methods
        d.eat();   // inherited concrete method
        d.sound(); // implemented abstract method
    }
}

