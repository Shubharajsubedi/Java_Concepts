package labThree;

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account();

        a.setId(1222);
        a.setBalance(20000);
        a.setAnnualInterestRate(4.5);
        a.withdraw(2500);
        a.deposit(3000);

        System.out.println("Montly Interest Rate is " + a.getMonthlyInterestRate());
        System.out.println("Balance: "+a.getBalance());
        System.out.println();


    }
}