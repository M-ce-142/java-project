
import java.util.Scanner;

class Student {

    protected int rollNo;
    protected String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

class Result extends Student {

    double marks1, marks2, marks3;

    Result(int rollNo, String name, double m1, double m2, double m3) {
        super(rollNo, name);
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    void displayResult() {
        displayStudent();

        double total = marks1 + marks2 + marks3;
        double avg = total / 3;

        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
        System.out.println("Marks 3: " + marks3);
        System.out.println("Total: " + total);
        System.out.printf("Average: %.2f\n", avg);
    }
}

public class CO2_19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter Marks 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter Marks 3: ");
        double m3 = sc.nextDouble();

        Result r = new Result(roll, name, m1, m2, m3);

        System.out.println("\n--- Mark Sheet ---");
        r.displayResult();

        sc.close();
    }
}
