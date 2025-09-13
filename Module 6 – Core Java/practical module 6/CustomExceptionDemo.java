package core;
import java.util.Scanner;

//Custom Exception Class
class NegativeNumberException extends Exception {
 public NegativeNumberException(String message) {
     super(message);
 }
}
public class CustomExceptionDemo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a positive number: ");
            int num = sc.nextInt();

            // Throw custom exception if number is negative
            if (num < 0) {
                throw new NegativeNumberException("Negative numbers are not allowed!");
            }

            System.out.println("You entered: " + num);
        } 
        catch (NegativeNumberException e) {
            System.out.println("Custom Exception Caught: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Other Exception: " + e.getMessage());
        } 
        finally {
            System.out.println("Program execution complete.");
            sc.close();
        }
    }
}

