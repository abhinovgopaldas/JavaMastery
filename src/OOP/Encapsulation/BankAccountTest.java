package OOP;

public class BankAccountTest {
    private int accountNumber;
    private double balance;
    BankAccountTest(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if (amount>0){
            balance = balance+amount;
        }
    }
    public void withdraw(double amount){
        if(balance>=amount && amount>0){
            balance = balance-amount;
        }
    }

    public static void main(String[] args) {
        BankAccountTest account = new BankAccountTest(129956,5000);
        System.out.println("Account number = "+account.accountNumber);
        account.getBalance();
        System.out.println("Current balance = "+account.getBalance());
        account.withdraw(250);
        System.out.println("After withdraw = "+account.getBalance());
        account.deposit(259);
        System.out.println("After Deposit = "+account.getBalance());

    }
}
