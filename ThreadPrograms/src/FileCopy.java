import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {
        // Specify the source file and the destination file
        String sourceFilePath = "C:/Users/poude_9elal6v/Desktop/names1.txt";
        String destinationFilePath = "C:/Users/poude_9elal6v/Desktop/namescopy.txt";

        try {
            // Open the source file
            FileInputStream in = new FileInputStream(sourceFilePath);
            // Create the destination file
            FileOutputStream out = new FileOutputStream(destinationFilePath);

            // Buffer to hold file data
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read from the source file and write to the destination file
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

            // Close the streams
            in.close();
            out.close();

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

