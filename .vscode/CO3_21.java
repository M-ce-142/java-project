
import java.util.Scanner;

public class CO3_21 {

    void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CO3_21 app = new CO3_21();

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            app.checkEligibility(age);

        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Invalid input!");

        } finally {
            System.out.println("Validation process completed");
        }

        sc.close();
    }
}
