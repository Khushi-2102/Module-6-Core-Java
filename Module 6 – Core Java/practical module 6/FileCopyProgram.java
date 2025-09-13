package core;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class FileCopyProgram {
	public static void main(String[] args) {
        String sourceFilePath = "source.txt";
        String destinationFilePath = "destination.txt";

        // Create a sample source file for demonstration purposes
        try {
            Files.write(Paths.get(sourceFilePath), "This is the content of the source file.".getBytes());
        } catch (IOException e) {
            System.err.println("Error creating source file: " + e.getMessage());
            return;
        }

        Path source = Paths.get(sourceFilePath);
        Path destination = Paths.get(destinationFilePath);

        try {
            // This is the core line of code for copying the file
            Files.copy(source, destination);
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.err.println("An error occurred during file copy: " + e.getMessage());
        }
    }
}

