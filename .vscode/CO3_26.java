
import java.io.*;

public class CO3_26 {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Please provide file name as argument.");
            return;
        }

        String fileName = args[0];

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;

            while ((line = br.readLine()) != null) {
                lineCount++;

                charCount += line.length();

                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            br.close();

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");

        } catch (IOException e) {
            System.out.println("Error reading file.");

        } catch (Exception e) {
            System.out.println("Unexpected error: " + e);
        }
    }
}
