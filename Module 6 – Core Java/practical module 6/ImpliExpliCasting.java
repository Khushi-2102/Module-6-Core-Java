package core;

public class ImpliExpliCasting {
	public class TypeCastingDemo {
	    public static void main(String[] args) {
	        // === Implicit Casting (Widening) ===
	        int intVal = 100;
	        double doubleVal = intVal;   // int -> double (automatic)

	        System.out.println("=== Implicit Casting (Widening) ===");
	        System.out.println("Integer value: " + intVal);
	        System.out.println("Converted to double: " + doubleVal);

	        // === Explicit Casting (Narrowing) ===
	        double num = 99.99;
	        int castedInt = (int) num;   // double -> int (manual)

	        System.out.println("\n=== Explicit Casting (Narrowing) ===");
	        System.out.println("Double value: " + num);
	        System.out.println("Converted to int: " + castedInt);

	        // Another Example
	        char ch = 'A';    // Unicode value = 65
	        int ascii = ch;   // Implicit widening
	        System.out.println("\nCharacter: " + ch + " | ASCII value: " + ascii);

	        int num2 = 66;
	        char ch2 = (char) num2;  // Explicit narrowing
	        System.out.println("Integer: " + num2 + " | Converted to char: " + ch2);
	    }
	}
}
