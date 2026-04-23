import java.util.Scanner;

public class CO2_8 {

    int x, y;

    CO2_8() {
        x = 5;
        y = 5;
    }

    CO2_8(int x, int y) {
        this.x = x;
        this.y = y;
    }

    CO2_8(CO2_8 p) {
        this.x = p.x;
        this.y = p.y;
    }

    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CO2_8 p1 = new CO2_8();
        System.out.println("Default Constructor:");
        p1.display();

        System.out.println();

        System.out.print("Enter x coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y coordinate: ");
        int y = sc.nextInt();

        CO2_8 p2 = new CO2_8(x, y);
        System.out.println("Parameterized Constructor:");
        p2.display();

        System.out.println();

        CO2_8 p3 = new CO2_8(p2);
        System.out.println("Copy Constructor (copy of p2):");
        p3.display();

        sc.close();
    }
}