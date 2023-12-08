public class Bank{
    private double amount;

    public Bank(double amount){
        this.amount = amount;
    }

    public void withdraw(double withdrawalAmount){
        String msg = (withdrawalAmount <= amount)? "Withdrawal successful" : "Insufficient funds";

        amount = (withdrawalAmount <= amount) ? (amount - withdrawalAmount) : amount;
        System.out.println(msg);
    }
    
     public void deposit(double depositAmount) {
        // Depositing funds
        amount += depositAmount;
    }

    public static void main(String[] args) {
        // Creating an instance of Bank with initial amount 10000
        Bank myBank = new Bank(10000);

        // Withdrawal
        double withdrawalAmount = 5000;
        myBank.withdraw(withdrawalAmount);

        // Deposit
        double depositAmount = 5000;
        myBank.deposit(depositAmount);

        // Display total balance
        System.out.println("Total balance: " + myBank.amount);
    }
}