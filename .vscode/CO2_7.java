import java.util.Scanner;

public class CO2_7 {

    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter employee salary: ");
        employeeSalary = sc.nextDouble();

    }

    public void displayEmployeeData() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employeeName);
        System.out.println("Salary: " + employeeSalary);
    }

    public static void main(String[] args) {

        CO2_7 emp = new CO2_7();

        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}