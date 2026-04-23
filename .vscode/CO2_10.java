import java.util.Scanner;

public class CO2_10 {

    String accountHolderName;
    double balance;

    static double interestRate = 5.0; 

    CO2_10(String name, double balance) {
        this.accountHolderName = name;
        this.balance = balance;
    }

    double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    void display() {
        System.out.println("\nAccount Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: " + calculateInterest());
    }

    static void updateInterestRate(double newRate) {
        interestRate = newRate;
        System.out.println("\nInterest rate updated to: " + interestRate + "%");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter balance: ");
        double balance1 = sc.nextDouble();
        sc.nextLine(); 

        CO2_10 acc1 = new CO2_10(name1, balance1);

        System.out.print("\nEnter account holder name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter balance: ");
        double balance2 = sc.nextDouble();

        CO2_10 acc2 = new CO2_10(name2, balance2);

        System.out.println("\n--- Before Interest Rate Update ---");
        acc1.display();
        acc2.display();

        System.out.print("\nEnter new interest rate: ");
        double newRate = sc.nextDouble();
        CO2_10.updateInterestRate(newRate);

        System.out.println("\n--- After Interest Rate Update ---");
        acc1.display();
        acc2.display();

        sc.close();
    }
}