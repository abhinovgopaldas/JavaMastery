package OOP;

public class BankAccountServices {
    public static void main(String[] args){
        BankAccountTest account = new BankAccountTest(3959452,10000);
        BankAccountTest firstAccount = account;
        account = new BankAccountTest(51423,200);
        System.out.println(account.getBalance());
        System.out.println(firstAccount.getBalance());


    }
}
