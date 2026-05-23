package J05_Abstraction;

// Real-world Banking System Abstraction Example

abstract class BankAccount {

    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    abstract void calculateInterest();

    void showBalance() {
        System.out.println(accountHolder + "'s Balance : " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.05;
        System.out.println(accountHolder + "'s Interest : " + interest);
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("Current Account usually provides no interest.");
    }
}

public class BankingSystemAbstractionDemo {

    public static void main(String[] args) {

        SavingsAccount s1 = new SavingsAccount("Daniel Foster", 50000);
        CurrentAccount c1 = new CurrentAccount("Ethan Walker", 80000);

        s1.showBalance();
        s1.calculateInterest();

        System.out.println();

        c1.showBalance();
        c1.calculateInterest();
    }
}

