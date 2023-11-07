package encapsulation;

public class BankAccount1 extends BankAccount{
    public static void main(String[] args) {
        BankAccount1 b=new BankAccount1();
        b.setAccountNumber(180010);
        b.setBalance(10000);
        System.out.println("Account no is =" +b.getAccountNumber());
        System.out.println("Account balance is = "+b.getBalance());
        System.out.println("---------------------");
        b.setAccountNumber(121112);
        b.setBalance(13400);
        System.out.println("Account no is =" +b.getAccountNumber());
        System.out.println("Account balance is = "+b.getBalance());

    }
}
