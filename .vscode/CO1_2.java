import java.util.*;

public class CO1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        System.out.print("Enter d: ");
        double d = sc.nextDouble();

        System.out.print("Enter e: ");
        double e = sc.nextDouble();

        System.out.print("Enter f: ");
        double f = sc.nextDouble();

        // Cramer's Rule calculations
        double D = (a * d) - (b * c);
        double Dx = (e * d) - (b * f);
        double Dy = (a * f) - (e * c);

        // Check if solution exists
        if (D == 0) {
            System.out.println("The system has no unique solution (D = 0).");
        } else {
            double x = Dx / D;
            double y = Dy / D;

            // Display results
            System.out.printf("Value of x = %.2f\n", x);
            System.out.printf("Value of y = %.2f\n", y);
        }

        sc.close();
    }
}