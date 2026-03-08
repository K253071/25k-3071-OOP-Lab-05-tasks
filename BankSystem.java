class Account {

    int accountNumber;
    double balance;

    // Static variables
    static int totalAccounts = 0;
    static double totalBankBalance = 0;

    // Constructor
    Account(int accNo, double bal) {
        accountNumber = accNo;
        balance = bal;

        totalAccounts++;
        totalBankBalance += bal;
    }

    // Static method to show bank summary
    static void showBankSummary() {
        System.out.println("Total Accounts: " + totalAccounts);
        System.out.println("Total Bank Balance: " + totalBankBalance);
    }
}

public class BankSystem {
    public static void main(String[] args) {

        // Creating accounts
        Account a1 = new Account(101, 5000);
        Account a2 = new Account(102, 8000);
        Account a3 = new Account(103, 12000);

        // Display bank summary
        Account.showBankSummary();
    }
}