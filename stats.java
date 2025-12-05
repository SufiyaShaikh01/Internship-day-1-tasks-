import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileStats {
    public static void main(String[] args) {
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("src/file_handling/Demo.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                String words[] = line.split("\\s+");
                wordCount += words.length;
            }

            br.close();
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Words: " + wordCount);
        System.out.println("Characters: " + charCount);
        System.out.println("Lines: " + lineCount);
    }
}