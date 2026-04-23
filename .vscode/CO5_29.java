
import java.util.*;

public class CO5_29 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.println("Enter 5 student marks:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Mark " + (i + 1) + ": ");
            marks.add(sc.nextInt());
        }

        System.out.println("\nAll Marks:");
        for (int m : marks) {
            System.out.println(m);
        }

        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("\nHighest Mark: " + max);
        System.out.println("Lowest Mark: " + min);

        sc.close();
    }
}
