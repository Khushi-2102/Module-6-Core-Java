package core;
import java.util.Scanner;
public class eveod {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input a number
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        // Check even or odd using if-else
	        if (num % 2 == 0) {
	            System.out.println(num + " is Even.");
	        } else {
	            System.out.println(num + " is Odd.");
	        }

	        sc.close();
	    }
	}
