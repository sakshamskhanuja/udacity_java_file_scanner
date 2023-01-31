import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Loads the file.
        File file = new File("A Tale of Two Cities.txt");

        // Checks if file is loaded or present.
        if (file.exists()) {
            try {
                // Scans the contents of the file.
                Scanner scanner = new Scanner(file);

                // Stores the number of words in the file.
                int wordCount = 0;

                while(scanner.hasNextLine()) {
                    // Stores the next line.
                    String line = scanner.nextLine();

                    // Checks if line only contains whitespace.
                    if (line.isBlank()) {
                        continue;
                    }

                    // Stores all words in line.
                    String[] words = line.split(" ");

                    // Updates the word count.
                    wordCount += words.length;
                }
                System.out.println("Total number of words = " + wordCount);

                // Closes the scanner.
                scanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found.");
            }
        }
    }
}