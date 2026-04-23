import java.util.Scanner;

public class CO2_12 {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CO2_12 obj = new CO2_12();

        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();
        System.out.printf("Volume of Cube: %.2f\n", obj.calculateVolume(side));

        System.out.println();

        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        System.out.print("Enter height: ");
        double h = sc.nextDouble();
        System.out.printf("Volume of Rectangular Cube: %.2f\n", obj.calculateVolume(l, w, h));

        System.out.println();

        System.out.print("Enter radius of sphere: ");
        float r = sc.nextFloat();
        System.out.printf("Volume of Sphere: %.2f\n", obj.calculateVolume(r));

        sc.close();
    }
}