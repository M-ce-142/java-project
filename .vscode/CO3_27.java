
import java.io.*;

public class CO3_27 {

    public static void main(String[] args) {

        FileWriter fw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("students.txt");

            fw.write("101 Maan 85\n");
            fw.write("102 Rahul 78\n");
            fw.write("103 Kunj 92\n");

            System.out.println("Student records written to file successfully.\n");

            fw.close();

            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            System.out.println("Reading student records:\n");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }

            System.out.println("\nFile operation completed.");
        }
    }
}
