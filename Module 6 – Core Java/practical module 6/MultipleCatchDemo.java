package core;
import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input two numbers
            System.out.print("Enter numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = sc.nextInt();

            // Division operation (may throw ArithmeticException)
            int result = numerator / denominator;
            System.out.println("Result: " + result);

            // Accessing array element (may throw ArrayIndexOutOfBoundsException)
            int[] arr = {1, 2, 3};
            System.out.println("Fourth element: " + arr[3]);

        } 
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        } 
        catch (Exception e) {  // Handles all other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } 
        finally {
            System.out.println("Execution of try-catch blocks is complete.");
            sc.close();
        }
    }
}
