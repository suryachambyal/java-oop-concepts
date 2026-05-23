package J03_Encapsulation;

// Demonstrating Encapsulation using
// private fields with getters and setters

class BankAccount {

    // Private field (data hiding)
    private double balance;

    // Private field for account holder name
    private String accountHolderName;

    // Constructor
    BankAccount(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    // Getter method to access balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {

        // Validation for positive deposit amount
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolderName +
                    " deposited : " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {

        // Validation for withdrawal
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(accountHolderName +
                    " withdrew : " + amount);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Method to display account balance
    public void displayBalance() {
        System.out.println(accountHolderName +
                "'s Current Balance : " + balance);
    }

    public static void main(String[] args) {

        // Creating BankAccount objects
        BankAccount b1 = new BankAccount("John Doe");
        BankAccount b2 = new BankAccount("Alice Smith");
        BankAccount b3 = new BankAccount("Michael Brown");

        // Performing operations on first account
        b1.deposit(10000);
        b1.withdraw(2500);

        System.out.println();

        // Performing operations on second account
        b2.deposit(5000);
        b2.withdraw(1000);

        System.out.println();

        // Performing operations on third account
        b3.deposit(20000);
        b3.withdraw(7000);

        System.out.println();

        // Displaying balances
        b1.displayBalance();
        b2.displayBalance();
        b3.displayBalance();
    }
}