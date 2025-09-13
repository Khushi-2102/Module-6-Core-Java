package core;

class Animal {
    String name;

    // Method in parent class
    public void eat() {
        System.out.println(name + " is eating.");
    }
}

// Child class inheriting from Animal
class Dog extends Animal {
    String breed;

    // Method in child class
    public void displayInfo() {
        System.out.println("Dog's Name: " + name);
        System.out.println("Breed: " + breed);
    }
}

// Main class
public class singleinheritance {
    public static void main(String[] args) {
        // Create Dog object
        Dog d = new Dog();
        d.name = "Tommy";
        d.breed = "Labrador";

        // Access parent class method
        d.eat();

        // Access child class method
        d.displayInfo();
    }
}
