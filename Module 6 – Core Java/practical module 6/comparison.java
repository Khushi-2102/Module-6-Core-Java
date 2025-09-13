package core;
import java.util.Scanner;
public class comparison {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Using equals() method
        if (str1.equals(str2)) {
            System.out.println("Using equals(): The strings are equal.");
        } else {
            System.out.println("Using equals(): The strings are not equal.");
        }

        // Using compareTo() method
        int result = str1.compareTo(str2);
        if (result == 0) {
            System.out.println("Using compareTo(): The strings are equal.");
        } else if (result < 0) {
            System.out.println("Using compareTo(): \"" + str1 + "\" comes before \"" + str2 + "\" lexicographically.");
        } else {
            System.out.println("Using compareTo(): \"" + str1 + "\" comes after \"" + str2 + "\" lexicographically.");
        }

        sc.close();
    }
}

