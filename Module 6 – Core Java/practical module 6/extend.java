package core;
class Vehicle {
    String brand;

    public void honk() {
        System.out.println(brand + " is honking!");
    }
}

// Child class inheriting from Vehicle
class Car extends Vehicle {
    String model;

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

public class extend {
	public static void main(String[] args) {
        // Create object of child class
        Car myCar = new Car();
        myCar.brand = "Toyota";  // inherited from Vehicle
        myCar.model = "Corolla"; // defined in Car

        // Call parent class method
        myCar.honk();

        // Call child class method
        myCar.displayInfo();
    }
}


