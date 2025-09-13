package core;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        // Reverse the string
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Display reversed string
        System.out.println("Reversed String: " + reversed);

        // Check for palindrome
        if (original.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}

