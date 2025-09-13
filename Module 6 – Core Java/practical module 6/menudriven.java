package core;
import java.util.Scanner;
public class menudriven {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Display menu
        System.out.println("\n=== Menu ===");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");

        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();

        // Switch-case to handle menu
        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3:
                System.out.println("Result = " + (a * b));
                break;
            case 4:
                if (b != 0) {
                    System.out.println("Result = " + (a / b));
                } else {
                    System.out.println("Error: Division by zero not allowed.");
                }
                break;
            case 5:
                System.out.println("Exiting program...");
                break;
            default:
                System.out.println("Invalid choice! Please try again.");
        }

        sc.close();
    }
}

