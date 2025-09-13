package core;

public class Datatype {
	 public static void main(String[] args) {
	        // Primitive Data Types
	        byte byteVar = 100;                // 1 byte
	        short shortVar = 1000;             // 2 bytes
	        int intVar = 100000;               // 4 bytes
	        long longVar = 10000000000L;       // 8 bytes
	        float floatVar = 3.14f;            // 4 bytes
	        double doubleVar = 3.14159265359;  // 8 bytes
	        char charVar = 'A';                // 2 bytes (Unicode)
	        boolean boolVar = true;            // 1 bit (logical value)

	        // Non-primitive Data Type (String)
	        String strVar = "Hello, Java!";

	        // Displaying the values
	        System.out.println("=== Primitive Data Types ===");
	        System.out.println("byte: " + byteVar);
	        System.out.println("short: " + shortVar);
	        System.out.println("int: " + intVar);
	        System.out.println("long: " + longVar);
	        System.out.println("float: " + floatVar);
	        System.out.println("double: " + doubleVar);
	        System.out.println("char: " + charVar);
	        System.out.println("boolean: " + boolVar);

	        System.out.println("\n=== Non-primitive Data Type ===");
	        System.out.println("String: " + strVar);
	    }
	}

