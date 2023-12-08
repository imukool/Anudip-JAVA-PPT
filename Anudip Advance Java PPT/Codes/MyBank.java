import java.util.Scanner;

class Account{
    private String ac_no;
    private String ac_holder_name;
    private String address;

    public void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number:");
        ac_no = sc.nextLine();
        System.out.println("Enter account holder's name:");
        ac_holder_name = sc.nextLine();
        System.out.println("Enter address:");
        address = sc.nextLine();
    }

    public void displayDetails() {
        System.out.println("Account Number: " + ac_no);
        System.out.println("Account Holder's Name: " + ac_holder_name);
        System.out.println("Address: " + address);
    }
}

class SavingsAccount extends Account {
    private double balance;
    private String ac_type;

    
    public void inputBalance() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter initial balance:");
        balance = sc.nextDouble();
    }

    public void displayAcInfo() {
        super.displayDetails();  
        System.out.println("Account Balance: " + balance);
    }

    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal successful");
        }
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit successful");
    }
}

public class MyBank {
    public static void main(String[] args) {
        
        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.inputDetails();

        savingsAccount.inputBalance();

        savingsAccount.displayAcInfo();

        savingsAccount.withdraw(500);

        savingsAccount.deposit(1000);

        savingsAccount.displayAcInfo();
    }
}