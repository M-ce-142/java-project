
import java.util.*;

public class CO5_32 {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> rollNumbers = new LinkedList<>();
        System.out.println("Enter 5 roll numbers:");
        for (int i = 0; i < 5; i++) {
            rollNumbers.add(sc.nextInt());
        }

        System.out.print("Enter roll number to search: ");
        int searchRoll = sc.nextInt();

        boolean foundRoll = searchElement(rollNumbers, searchRoll);
        System.out.println("Roll number found? " + foundRoll);

        sc.nextLine();
        LinkedList<String> names = new LinkedList<>();
        System.out.println("\nEnter 5 names:");
        for (int i = 0; i < 5; i++) {
            names.add(sc.nextLine());
        }

        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();

        boolean foundName = searchElement(names, searchName);
        System.out.println("Name found? " + foundName);

        sc.close();
    }
}
