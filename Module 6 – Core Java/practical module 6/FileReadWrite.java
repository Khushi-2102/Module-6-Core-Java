package core;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class FileReadWrite {
	public static void main(String[] args) {
        // Source and destination file names
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Create a sample input.txt file for demonstration
        try (FileWriter writer = new FileWriter(inputFile)) {
            writer.write("Hello, this is a test.\n");
            writer.write("This content will be copied to another file.\n");
        } catch (IOException e) {
            System.err.println("Error creating input file: " + e.getMessage());
            return; // Exit if the input file can't be created
        }

        // Use try-with-resources to ensure the streams are closed
        try (FileReader reader = new FileReader(inputFile);
             FileWriter writer = new FileWriter(outputFile)) {
            int character;

            System.out.println("Reading from '" + inputFile + "' and writing to '" + outputFile + "'...");

            // Read character by character until the end of the file (-1)
            while ((character = reader.read()) != -1) {
                writer.write(character); // Write the character to the output file
            }

            System.out.println("File content successfully copied!");

        } catch (IOException e) {
            // Handle any I/O errors that may occur
            System.err.println("An error occurred during file operation: " + e.getMessage());
        }
    }
}

