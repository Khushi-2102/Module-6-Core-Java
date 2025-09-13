package core;
import java.util.Scanner;
public class maximum {
	public static int findMax(int a, int b, int c) {
        int max = a;  // assume first is max

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        // Call method
        int max = findMax(num1, num2, num3);

        // Display result
        System.out.println("The maximum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + max);

        sc.close();
    }
}

