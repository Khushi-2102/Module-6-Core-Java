package core;

public class overloading {
	public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    // Main method to test overloading
    public static void main(String[] args) {
    	overloading obj = new overloading();

        System.out.println("Sum of 2 ints: " + obj.add(10, 20));
        System.out.println("Sum of 3 ints: " + obj.add(10, 20, 30));
        System.out.println("Sum of 2 doubles: " + obj.add(5.5, 6.5));
        System.out.println("Concatenation of strings: " + obj.add("Hello ", "World"));
    }
}


