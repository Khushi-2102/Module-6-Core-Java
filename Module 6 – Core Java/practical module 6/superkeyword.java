package core;
class Vehicle {
    String brand;

    // Parent class constructor
    public Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle constructor called");
    }

    // Parent class method
    public void start() {
        System.out.println(brand + " vehicle is starting");
    }
}

// Child class
class Car extends Vehicle {
    String model;

    // Child class constructor
    public Car(String brand, String model) {
        super(brand); // Call parent constructor
        this.model = model;
        System.out.println("Car constructor called");
    }

    // Overriding parent method
    
    public void start() {
        super.start(); // Call parent method
        System.out.println(model + " car is ready to drive!");
    }
}

// Main class
public class superkeyword {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla");

        // Call overridden method
        myCar.start();
    }
}