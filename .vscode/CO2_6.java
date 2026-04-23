public class CO2_6 {

    // Data fields
    double width = 1;
    double height = 1;

    // No-argument constructor
    CO2_6() {
        // default values already set
    }

    // Parameterized constructor
    CO2_6(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to calculate area
    double getArea() {
        return width * height;
    }

    // Method to calculate perimeter
    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {

        CO2_6 r1 = new CO2_6();
        System.out.println("Rectangle 1:");
        System.out.println("Width = " + r1.width + ", Height = " + r1.height);
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        System.out.println();

        CO2_6 r2 = new CO2_6(5, 3);
        System.out.println("Rectangle 2:");
        System.out.println("Width = " + r2.width + ", Height = " + r2.height);
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());
    }
}