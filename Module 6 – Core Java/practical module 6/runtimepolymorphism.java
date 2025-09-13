package core;
class Vehicle {
    public void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Child class 1
class Car extends Vehicle {
   
    public void start() {
        System.out.println("Car is starting with a key ignition!");
    }
}

// Child class 2
class Bike extends Vehicle {
   
    public void start() {
        System.out.println("Bike is starting with a button!");
    }
}

public class runtimepolymorphism {
	public static void main(String[] args) {
        Vehicle v;

        // Vehicle reference pointing to Car object
        v = new Car();
        v.start();  // Calls Car's start() method

        // Vehicle reference pointing to Bike object
        v = new Bike();
        v.start();  // Calls Bike's start() method

        // Vehicle reference pointing to Vehicle object
        v = new Vehicle();
        v.start();  // Calls Vehicle's start() method
    }
}

	