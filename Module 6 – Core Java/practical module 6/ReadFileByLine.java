package core;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFileByLine {
	public static void main(String[] args) {

        // The name of the file to read
        String fileName = "sample.txt";

        // To make the example runnable, let's create a sample file first.
        try (java.io.FileWriter writer = new java.io.FileWriter(fileName)) {
            writer.write("This is the first line.\n");
            writer.write("Here is the second line.\n");
            writer.write("And the third one.");
        } catch (IOException e) {
            System.err.println("Error creating the file: " + e.getMessage());
            return;
        }

        // Use a try-with-resources block for automatic resource management
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading content from '" + fileName + "':\n");

            // Loop through each line until readLine() returns null
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // Handle any potential I/O errors
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

