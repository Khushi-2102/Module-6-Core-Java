package core;
import java.util.Scanner;
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int numerator = sc.nextInt();

        System.out.print("Enter denominator: ");
        int denominator = sc.nextInt();

        try {
            // Code that may throw an exception
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            // Handle exception
            System.out.println("Error: Division by zero is not allowed.");
        } 
        finally {
            // This block always executes
            System.out.println("Execution of try-catch block is complete.");
        }

        sc.close();
    }
}


