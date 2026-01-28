package LabSix;

class Account {
    protected int accountNumber;
    protected double balance;
    protected double annualInterestRate;


    public Account(int accountNumber, double balance, double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Annual Interest Rate: " + annualInterestRate + "%");
    }
}


class CheckingAccount extends Account {
    private double overdraftLimit;

    public CheckingAccount(int accountNumber, double balance,
                           double annualInterestRate, double overdraftLimit) {
        super(accountNumber, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }
}
class SavingsAccount extends Account {

    public SavingsAccount(int accountNumber, double balance, double annualInterestRate) {
        super(accountNumber, balance, annualInterestRate);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Savings account cannot be overdrawn.");
        }
    }
}