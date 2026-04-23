import java.util.Scanner;

public class CO2_11 {

    String collegeName;

    CO2_11(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {
        String studentName;
        String course;

        void acceptData() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter student name: ");
            studentName = sc.nextLine();

            System.out.print("Enter course: ");
            course = sc.nextLine();
        }

        void displayData() {
            System.out.println("\n--- Admission Details ---");
            System.out.println("College Name: " + collegeName); 
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter college name: ");
        String collegeName = sc.nextLine();

        CO2_11 college = new CO2_11(collegeName);

        CO2_11.Admission admission = college.new Admission();

        admission.acceptData();
        admission.displayData();

        sc.close();
    }
}