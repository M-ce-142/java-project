import java.util.Scanner;

class Employee {
    String name;
    String department;

    void readDetails(Scanner sc) {
        System.out.print("Enter employee name: ");
        name = sc.nextLine();

        System.out.print("Enter department: ");
        department = sc.nextLine();
    }

    void displayDetails() {
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize;
    String projectName;

    void readManagerDetails(Scanner sc) {
        readDetails(sc); 

        System.out.print("Enter team size: ");
        teamSize = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter project name: ");
        projectName = sc.nextLine();
    }

    @Override
    void displayDetails() {
        System.out.println("\nManager Details:");
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}

public class CO2_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();
        System.out.println("=== Employee ===");
        emp.readDetails(sc);
        emp.displayDetails();

        System.out.println();

        Manager mgr = new Manager();
        System.out.println("=== Manager ===");
        mgr.readManagerDetails(sc);
        mgr.displayDetails();

        System.out.println();

        Employee ref;
        
        ref = emp; 
        System.out.println("Using Employee reference (Employee object):");
        ref.displayDetails();

        System.out.println();

        ref = mgr;
        System.out.println("Using Employee reference (Manager object):");
        ref.displayDetails(); 

        sc.close();
    }
}