import java.util.Scanner;

class Shape {
    double d1, d2;

    void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    double getArea() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape {
    double getArea() {
        return d1 * d2;
    }
}

public class CO2_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        Triangle t = new Triangle();
        t.getData(base, height);
        System.out.printf("Area of Triangle: %.2f\n", t.getArea());

        System.out.println();

        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();

        Rectangle r = new Rectangle();
        r.getData(length, width);
        System.out.printf("Area of Rectangle: %.2f\n", r.getArea());

        sc.close();
    }
}