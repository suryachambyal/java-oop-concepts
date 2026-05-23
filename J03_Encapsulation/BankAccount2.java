package J03_Encapsulation;

// Demonstrating Encapsulation using
// private fields, validation, and controlled access methods

class BankAccount2 {

    // Private fields (data hiding)
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Parameterized constructor
    public BankAccount2(int accountNumber,
                        String accountHolderName,
                        double balance) {

        // Initializing values using setter methods
        setAccountNumber(accountNumber);
        setAccountHolderName(accountHolderName);
        setBalance(balance);
    }

    // Getter method for account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Setter method for account number
    public void setAccountNumber(int accountNumber) {

        // Validation for account number
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid account number!");
        }
    }

    // Getter method for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Setter method for account holder name
    public void setAccountHolderName(String accountHolderName) {

        // Validation for account holder name
        if (accountHolderName != null &&
                !accountHolderName.trim().isEmpty()) {

            this.accountHolderName = accountHolderName;

        } else {
            System.out.println("Please enter a valid account holder name!");
        }
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Setter method for balance
    public void setBalance(double balance) {

        // Validation for balance
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount!");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {

        // Validation for deposit amount
        if (amount > 0) {

            balance += amount;

            System.out.println(accountHolderName +
                    " deposited : " + amount);

        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {

        // Validation for withdrawal amount
        if (amount > 0 && amount <= balance) {

            balance -= amount;

            System.out.println(accountHolderName +
                    " withdrew : " + amount);

        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Overriding toString() method
    @Override
    public String toString() {

        return "BankAccount {" +
                "Account Number = " + accountNumber +
                ", Account Holder = " + accountHolderName +
                ", Balance = " + balance +
                "}";
    }

    public static void main(String[] args) {

        // Creating BankAccount objects
        BankAccount2 b1 = new BankAccount2(101,
                "Daniel Parker",
                25000);

        BankAccount2 b2 = new BankAccount2(102,
                "Nathan Brooks",
                50000);

        BankAccount2 b3 = new BankAccount2(103,
                "Ryan Mitchell",
                75000);

        // Displaying account details
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println();

        // Performing deposit operation
        b1.deposit(5000);

        // Performing withdrawal operation
        b2.withdraw(10000);

        System.out.println();

        // Displaying updated balances
        System.out.println("Updated Balance for "
                + b1.getAccountHolderName()
                + " : " + b1.getBalance());

        System.out.println("Updated Balance for "
                + b2.getAccountHolderName()
                + " : " + b2.getBalance());
    }
}