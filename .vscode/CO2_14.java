import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(Scanner sc) {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double interestRate = 4.0; 

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest (Savings): " + interest);
    }
}

class FixedDepositAccount extends BankAccount {
    double rate = 6.5; 
    int time;

    void inputFDDetails(Scanner sc) {
        System.out.print("Enter time (in years): ");
        time = sc.nextInt();
    }

    void maturityAmount() {
        double maturity = balance + (balance * rate * time) / 100;
        System.out.println("Maturity Amount (FD): " + maturity);
    }
}

public class CO2_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Saving Account ===");
        SavingAccount sa = new SavingAccount();
        sa.openAccount(sc);

        System.out.print("Enter amount to deposit: ");
        sa.deposit(sc.nextDouble());

        System.out.print("Enter amount to withdraw: ");
        sa.withdraw(sc.nextDouble());

        sa.checkBalance();
        sa.calculateInterest();

        System.out.println();

        System.out.println("=== Fixed Deposit Account ===");
        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount(sc);

        fd.inputFDDetails(sc);
        fd.maturityAmount();

        sc.close();
    }
}