import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.List;

public class FileReaderExample {

    public static void main(String[] args) {
        // Specify the path to the file
        Path filePath = Paths.get("C:\\Users\\poude_9elal6v\\Desktop\\names1.txt");

        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(filePath);

            // Iterate over the lines and print them
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle the exception
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

