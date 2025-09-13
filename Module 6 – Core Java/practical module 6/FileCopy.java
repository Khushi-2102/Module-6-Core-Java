package core;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void main(String[] args) {
        String sourceFile = "source.txt";
        String destinationFile = "destination.txt";

        // Create a sample source file for demonstration
        try (FileOutputStream writer = new FileOutputStream(sourceFile)) {
            writer.write("This is some sample text.\n".getBytes());
            writer.write("It will be copied to another file.".getBytes());
        } catch (IOException e) {
            System.err.println("Error creating source file: " + e.getMessage());
            return;
        }

        // Use try-with-resources to ensure streams are automatically closed
        try (FileInputStream inputStream = new FileInputStream(sourceFile);
             FileOutputStream outputStream = new FileOutputStream(destinationFile)) {

            int byteRead;

            System.out.println("Starting file copy...");

            // Read a byte from the input stream until the end of the file (-1)
            while ((byteRead = inputStream.read()) != -1) {
                outputStream.write(byteRead); // Write the byte to the output stream
            }

            System.out.println("File copied successfully from '" + sourceFile + "' to '" + destinationFile + "'.");

        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
    }
}

