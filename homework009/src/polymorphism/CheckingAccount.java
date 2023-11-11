package polymorphism;

public class CheckingAccount extends BankAccount{
    public static void main(String[] args) {
        CheckingAccount c=new CheckingAccount();
        c.deposit();
        c.withdraw();
    }

    @Override
    public void withdraw() {
    System.out.println("you can withdraw maximum of £250 in a day");
    }
}
